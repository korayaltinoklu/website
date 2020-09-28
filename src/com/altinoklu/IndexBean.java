package com.altinoklu;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name="indexBean")
@SessionScoped
public class IndexBean {

	
	private String ad="Koray ALTINOKLU";
	private String buttonName="Beni Týkla";

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getButtonName() {
		return buttonName;
	}


	
	
	
}