package com.telusko.OnetoOne1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class License {

	@Id
	private int lid;
	private String lstate;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLstate() {
		return lstate;
	}
	public void setLstate(String lstate) {
		this.lstate = lstate;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lstate=" + lstate + "]";
	}
	
	
}
