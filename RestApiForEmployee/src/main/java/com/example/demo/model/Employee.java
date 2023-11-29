package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  Empid;
	private String EmpName;
	private String Empemail;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpemail() {
		return Empemail;
	}
	public void setEmpemail(String empemail) {
		Empemail = empemail;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", EmpName=" + EmpName + ", Empemail=" + Empemail + "]";
	}
	public Employee(int empid, String empName, String empemail) {
		super();
		Empid = empid;
		EmpName = empName;
		Empemail = empemail;
	}
	
	
}
