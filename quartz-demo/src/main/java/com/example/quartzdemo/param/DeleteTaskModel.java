package com.example.quartzdemo.param;

import java.io.Serializable;

/**
 * 操作quartz任务 参数体
 *
 * @Author luoYong
 * @Date 2021-07-22 14:24
 */
public class DeleteTaskModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String jobName;//任务名称

	private String jobGroup;//任务组名称

	private String triggerName;//触发器名称

	private String triggerGroup;//触发器组名称

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public String getTriggerGroup() {
		return triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}
}
