package com.example.quartzdemo.controller;

import com.example.quartzdemo.param.OperationModel;
import com.example.quartzdemo.param.QuartzModel;
import com.example.quartzdemo.service.QuartzService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 调度任务信息操作处理
 */
@RestController
@RequestMapping("/quartz")
@Api(tags = "quartz相关控制器", description = "quartz相关控制器")
public class QuartzController {

    @Autowired
    private QuartzService quartzService;

    /**
     * 新增任务
     */
    @PostMapping("/insert")
    @ApiOperation(value = "新增任务", notes = "新增任务")
    public Boolean insertTask(@RequestBody QuartzModel quartzModel) {
        return quartzService.addJob(quartzModel);
    }

    /**
     * 暂停任务
     */
    @PostMapping("/pause")
    @ApiOperation(value = "暂停任务", notes = "暂停任务")
    public Boolean pauseTask(@RequestBody OperationModel operationModel) {
        return quartzService.pauseJob(operationModel);
    }

    /**
     * 恢复任务
     */
    @PostMapping("/resume")
    @ApiOperation(value = "恢复任务", notes = "恢复任务")
    public Boolean resumeTask(@RequestBody OperationModel operationModel) {
        return quartzService.resumeJob(operationModel);
    }

    /**
     * 删除任务
     */
    @PostMapping("/delete")
    @ApiOperation(value = "删除任务", notes = "删除任务")
    public Boolean deleteTask(@RequestBody OperationModel operationModel) {
        return quartzService.deleteJob(operationModel);
    }

    /**
     * 查看所有定时任务
     */
    @GetMapping("/query-all-job")
    @ApiOperation(value = "查看所有定时任务", notes = "查看所有定时任务")
    public List<Map<String, Object>> queryAllJob() {
        return quartzService.queryAllJob();
    }

    /**
     * 查看正在运行的任务
     */
    @GetMapping("/query-all-running-job")
    @ApiOperation(value = "查看正在执行的任务", notes = "查看正在执行的任务")
    public List<Map<String, Object>> queryAllRunningJob() {
        return quartzService.queryAllRunningJob();
    }
}
