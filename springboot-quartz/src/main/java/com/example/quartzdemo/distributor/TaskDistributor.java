package com.example.quartzdemo.distributor;

import com.example.quartzdemo.param.JobDetailModel;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;


/**
 * 定时任务执行器
 */
@Slf4j
public class TaskDistributor extends QuartzJobBean {

    /**
     * 根据不同的jobDetail携带的type参数区分,执行不同业务
     */
    @Override
    protected void executeInternal(JobExecutionContext context) {
        synchronized (this) {
            log.info("开始执行定时任务...............");
            try {
                //获取job中携带的内容并转成jobDetailModel对象
                JobDetailModel jobDetailModel = (JobDetailModel) context.getJobDetail().getJobDataMap().get("jobDetailModel");
                Integer type = jobDetailModel.getType();
                String content = jobDetailModel.getContent();
                //根据type执行不同的业务逻辑
                switch (type) {
                    case 1:
                        System.out.println("task1即将被执行，content:" + content);
                        //模拟处理逻辑
                        Thread.sleep(5000);
                        log.info("---------task1定时任务执行结束----------");
                        break;
                    case 2:
                        System.out.println("task2即将被执行，content:" + content);
                        //模拟处理逻辑
                        Thread.sleep(5000);
                        log.info("----------task2定时任务结束---------");
                        break;
                    default:
                        log.info("---------定时任务执行开始----------");
                        log.info("---------定时任务执行结束----------");
                        break;
                }
            } catch (Throwable t) {
                log.error(t.getMessage(), t);
            }
            log.info("定时任务执行结束...............");
        }
    }
}
