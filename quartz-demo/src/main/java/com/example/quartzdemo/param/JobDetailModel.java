package com.example.quartzdemo.param;

import java.io.Serializable;

/**
 * 用于携带jobDetail内容体
 *
 * @Author luoYong
 * @Date 2021-07-23 9:47
 */
public class JobDetailModel implements Serializable {
	private static final long serialVersionUID = 1L;

	//携带的内容的对应的type  用于区分执行什么业务逻辑
	private Integer type;

	//携带的value  用于执行业务逻辑的id等
	private String content;

	public JobDetailModel() {

	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
