package com.example.quartzdemo.service.impl;

import com.example.quartzdemo.distributor.TaskDistributor;
import com.example.quartzdemo.param.DeleteTaskModel;
import com.example.quartzdemo.param.JobDetailModel;
import com.example.quartzdemo.param.OperationModel;
import com.example.quartzdemo.util.CronUtils;
import com.example.quartzdemo.param.QuartzModel;
import com.example.quartzdemo.service.QuartzService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 调度任务信息操作处理 服务层
 *
 * @Author luoYong
 * @Date 2021-07-22 14:14
 */
@Slf4j
@Service
public class QuartzServiceImpl implements QuartzService {

    @Autowired
    private Scheduler scheduler;

    /**
     * 新增定时任务
     */
    @Override
    public Boolean addJob(QuartzModel quartzModel) {
        try {
            String cron = quartzModel.getCron();
            //校验cron是否有效
            boolean valid = CronUtils.isValid(cron);
            if (!valid) {
                return false;
            }
            JobDetail jobDetail = JobBuilder.newJob(TaskDistributor.class)
                    .withIdentity(quartzModel.getJobName(), quartzModel.getJobGroup())
                    .build();
            // 携带job内容 此处可以携带业务所需要的执行参数
            JobDetailModel jobDetailModel = quartzModel.getJobData();
            if (!Objects.isNull(jobDetailModel)) {
                jobDetail.getJobDataMap().put("jobDetailModel", jobDetailModel);
            }
            CronTrigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity(quartzModel.getTriggerName(), quartzModel.getTriggerGroup())
                    .startNow()
                    .withSchedule(CronScheduleBuilder.cronSchedule(cron))
                    .build();
            //把作业和触发器注册到任务调度中
            scheduler.scheduleJob(jobDetail, trigger);
            //启用调度
            scheduler.start();
            log.info("---------定时任务成功添加进quartz队列中！----------");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * 暂停定时任务
     */
    @Override
    public Boolean pauseJob(OperationModel operationModel) {
        try {
            scheduler.pauseJob(JobKey.jobKey(operationModel.getJobName(), operationModel.getJobGroup()));
            System.out.println("暂停定时任务成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * 继续定时任务
     */
    @Override
    public Boolean resumeJob(OperationModel operationModel) {
        try {
            scheduler.resumeJob(JobKey.jobKey(operationModel.getJobName(), operationModel.getJobGroup()));
            System.out.println("恢复定时任务成功");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * 删除定时任务
     */
    @Override
    public Boolean deleteJob(OperationModel operationModel) {
        try {

            // TriggerKey 定义了trigger的名称和组别 ，通过任务名和任务组名获取TriggerKey
            TriggerKey triggerKey = TriggerKey.triggerKey(operationModel.getJobName(), operationModel.getJobGroup());
            // 停止触发器
            scheduler.resumeTrigger(triggerKey);
            // 移除触发器
            scheduler.unscheduleJob(triggerKey);
            scheduler.deleteJob(JobKey.jobKey(operationModel.getJobName(), operationModel.getJobGroup()));
            System.out.println("删除定时任务成功");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * 查看所有定时任务
     *
     * @return
     */
    @Override
    public List<Map<String, Object>> queryAllJob() {
        List<Map<String, Object>> jobList = null;
        try {
            GroupMatcher<JobKey> matcher = GroupMatcher.anyJobGroup();
            Set<JobKey> jobKeys = scheduler.getJobKeys(matcher);
            jobList = new ArrayList<Map<String, Object>>();
            for (JobKey jobKey : jobKeys) {
                List<? extends Trigger> triggers = scheduler.getTriggersOfJob(jobKey);
                for (Trigger trigger : triggers) {
                    jobList.add(this.buildMap(jobKey, trigger));
                }
            }
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return jobList;
    }

    /**
     * 返回指定的map集合
     */
    private Map<String, Object> buildMap(JobKey jobKey, Trigger trigger) throws SchedulerException {
        Map<String, Object> map = new HashMap<>();
        map.put("jobName", jobKey.getName());
        map.put("jobGroupName", jobKey.getGroup());
        map.put("description", "触发器:" + trigger.getKey());
        Trigger.TriggerState triggerState = scheduler.getTriggerState(trigger.getKey());
        map.put("jobStatus", triggerState.name());
        if (trigger instanceof CronTrigger) {
            CronTrigger cronTrigger = (CronTrigger) trigger;
            String cronExpression = cronTrigger.getCronExpression();
            map.put("jobTime", cronExpression);
        }
        return map;
    }

    /**
     * 获取所有正在运行的job
     *
     * @return
     */
    @Override
    public List<Map<String, Object>> queryAllRunningJob() {
        List<Map<String, Object>> jobList = null;
        try {
            List<JobExecutionContext> executingJobs = scheduler.getCurrentlyExecutingJobs();
            jobList = new ArrayList<Map<String, Object>>(executingJobs.size());
            for (JobExecutionContext executingJob : executingJobs) {
                JobDetail jobDetail = executingJob.getJobDetail();
                JobKey jobKey = jobDetail.getKey();
                Trigger trigger = executingJob.getTrigger();
                jobList.add(this.buildMap(jobKey, trigger));
            }
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return jobList;
    }

}
