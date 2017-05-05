package com.model;

import java.sql.Date;

public class TechTalk {

	
	private String talkTitle;
	private String talkDescription;
	private String talkPresenter;
	private Date talkDate;
	
	
	@Override
	public String toString() {
		return "TechTalk [talkTitle=" + talkTitle + ", talkDescription=" + talkDescription + ", talkPresenter="
				+ talkPresenter + ", talkDate=" + talkDate + "]";
	}
	public String getTalkTitle() {
		return talkTitle;
	}
	public void setTalkTitle(String talkTitle) {
		this.talkTitle = talkTitle;
	}
	public String getTalkDescription() {
		return talkDescription;
	}
	public void setTalkDescription(String talkDescription) {
		this.talkDescription = talkDescription;
	}
	public String getTalkPresenter() {
		return talkPresenter;
	}
	public void setTalkPresenter(String talkPresenter) {
		this.talkPresenter = talkPresenter;
	}
	public Date getTalkDate() {
		return talkDate;
	}
	public void setTalkDate(Date talkDate) {
		this.talkDate = talkDate;
	}
	public TechTalk(String talkTitle, String talkDescription, String talkPresenter, Date talkDate) {
		super();
		this.talkTitle = talkTitle;
		this.talkDescription = talkDescription;
		this.talkPresenter = talkPresenter;
		this.talkDate = talkDate;
	}
	public TechTalk() {
		super();
	}
	
	
	
}
