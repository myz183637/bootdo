package com.bootdo.system.so.java.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 销售机会
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-18 10:12:24
 */
public class OpportunitiesDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer soId;
	//
	private String soSource;
	//
	private String customerName;
	//
	private Double probalilitySuccess;
	//
	private String outline;
	//
	private String linkman;
	//
	private String linkmanTel;
	//
	private String describe;
	//
	private String creator;
	//
	private Date createTime;
	//
	private String soStatus;
	//
	private Date appointedTime;
	//
	private String customerManager;

	/**
	 * 设置：
	 */
	public void setSoId(Integer soId) {
		this.soId = soId;
	}
	/**
	 * 获取：
	 */
	public Integer getSoId() {
		return soId;
	}
	/**
	 * 设置：
	 */
	public void setSoSource(String soSource) {
		this.soSource = soSource;
	}
	/**
	 * 获取：
	 */
	public String getSoSource() {
		return soSource;
	}
	/**
	 * 设置：
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * 获取：
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * 设置：
	 */
	public void setProbalilitySuccess(Double probalilitySuccess) {
		this.probalilitySuccess = probalilitySuccess;
	}
	/**
	 * 获取：
	 */
	public Double getProbalilitySuccess() {
		return probalilitySuccess;
	}
	/**
	 * 设置：
	 */
	public void setOutline(String outline) {
		this.outline = outline;
	}
	/**
	 * 获取：
	 */
	public String getOutline() {
		return outline;
	}
	/**
	 * 设置：
	 */
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	/**
	 * 获取：
	 */
	public String getLinkman() {
		return linkman;
	}
	/**
	 * 设置：
	 */
	public void setLinkmanTel(String linkmanTel) {
		this.linkmanTel = linkmanTel;
	}
	/**
	 * 获取：
	 */
	public String getLinkmanTel() {
		return linkmanTel;
	}
	/**
	 * 设置：
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	/**
	 * 获取：
	 */
	public String getDescribe() {
		return describe;
	}
	/**
	 * 设置：
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * 获取：
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setSoStatus(String soStatus) {
		this.soStatus = soStatus;
	}
	/**
	 * 获取：
	 */
	public String getSoStatus() {
		return soStatus;
	}
	/**
	 * 设置：
	 */
	public void setAppointedTime(Date appointedTime) {
		this.appointedTime = appointedTime;
	}
	/**
	 * 获取：
	 */
	public Date getAppointedTime() {
		return appointedTime;
	}
	/**
	 * 设置：
	 */
	public void setCustomerManager(String customerManager) {
		this.customerManager = customerManager;
	}
	/**
	 * 获取：
	 */
	public String getCustomerManager() {
		return customerManager;
	}
}
