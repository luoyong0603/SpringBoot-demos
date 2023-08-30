package com.example.quartzdemo.service;

import com.example.quartzdemo.param.DeleteTaskModel;
import com.example.quartzdemo.param.OperationModel;
import com.example.quartzdemo.param.QuartzModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * quartz任务调度接口层
 *
 * @Author luoYong
 * @Date 2021-07-22 14:14
 */
@Service
public interface QuartzService {

    /**
     * 新增定时任务
     */
    Boolean addJob(QuartzModel quartzModel);

    /**
     * 暂停定时任务
     */
    Boolean pauseJob(OperationModel operationModel);

    /**
     * 继续定时任务
     */
    Boolean resumeJob(OperationModel operationModel);

    /**
     * 删除定时任务
     */
    Boolean deleteJob(OperationModel operationModel);


    /**
     * 查看所有定时任务
     */
    List<Map<String, Object>> queryAllJob();


    /**
     * 查看正在运行的任务
     */
    List<Map<String, Object>> queryAllRunningJob();
}
