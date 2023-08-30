package com.example.quartzdemo.param;

import java.io.Serializable;

/**
 * quartz新增任务参数
 *
 * @Author luoYong
 * @Date 2021-07-22 14:14
 */
public class QuartzModel implements Serializable {
	private static final long serialVersionUID = 1L;

	//命名任务名后缀
	public static final String JOB_NAME_SUFFIX = "_jn";
	//命名任务组名称后缀
	public static final String JOB_GROUP_SUFFIX = "_jg";
	//命名触发器名后缀
	public static final String TRIGGER_NAME_SUFFIX = "_tn";
	//命名触发器组后缀
	public static final String TRIGGER_GROUP_SUFFIX = "_tg";

	private String jobName;//任务名称

	private String jobGroup;//任务组名称

	private String triggerName;//触发器名称

	private String triggerGroup;//触发器组名称

	private String cron;//cron表达式

	private JobDetailModel jobData;//携带内容

	public QuartzModel() {

	}

	//构建对象
	public QuartzModel(String taskId, String cron, Integer type) {
		this.setJobName(taskId);
		this.setJobGroup(taskId);
		this.setTriggerName(taskId);
		this.setTriggerGroup(taskId);
		this.setCron(cron);
		JobDetailModel jobDetailModel = new JobDetailModel();
		jobDetailModel.setType(type);
		jobDetailModel.setContent(taskId);
		this.setJobData(jobDetailModel);
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName + JOB_NAME_SUFFIX;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup + JOB_GROUP_SUFFIX;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName + TRIGGER_NAME_SUFFIX;
	}

	public String getTriggerGroup() {
		return triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup + TRIGGER_GROUP_SUFFIX;
	}

	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

	public JobDetailModel getJobData() {
		return jobData;
	}

	public void setJobData(JobDetailModel jobData) {
		this.jobData = jobData;
	}
}
