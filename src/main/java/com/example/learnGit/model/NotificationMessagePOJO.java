package com.example.learnGit.model;

public class NotificationMessagePOJO {

	private String senderName;
	private String receiverName;
	private String senderMailId;
	private String receiverMainId;
	private int senderNo;
	private int receiverNo;
	private String senderMessageInfo;
	private int priority;
	
	private String senderMessageStatus;
	
	
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getSenderMailId() {
		return senderMailId;
	}
	public void setSenderMailId(String senderMailId) {
		this.senderMailId = senderMailId;
	}
	public String getReceiverMainId() {
		return receiverMainId;
	}
	public void setReceiverMainId(String receiverMainId) {
		this.receiverMainId = receiverMainId;
	}
	public int getSenderNo() {
		return senderNo;
	}
	public void setSenderNo(int senderNo) {
		this.senderNo = senderNo;
	}
	public int getReceiverNo() {
		return receiverNo;
	}
	public void setReceiverNo(int receiverNo) {
		this.receiverNo = receiverNo;
	}
	public String getSenderMessageInfo() {
		return senderMessageInfo;
	}
	public void setSenderMessageInfo(String senderMessageInfo) {
		this.senderMessageInfo = senderMessageInfo;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getSenderMessageStatus() {
		return senderMessageStatus;
	}
	public void setSenderMessageStatus(String senderMessageStatus) {
		this.senderMessageStatus = senderMessageStatus;
	}
	
	
	
}
