package com.telusko.OnetoOne1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private int empid;
	private String name;
	@OneToOne
	private License license;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public License getLicense() {
		return license;
	}
	public void setLicense(License license) {
		this.license = license;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	

}
