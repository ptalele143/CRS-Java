/**
 * 
 */
package com.lti.bean;

import java.util.*;

/**
 * @author user256
 *
 */
public class Student {
	private String fname,sname,emailId,password;
	private int studentId;
	private int altCounter;
	private int optedCounter;
	int cid[]=new int[4];
	private long contactNum;
	List reports;
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the altCounter
	 */
	public int getAltCounter() {
		return altCounter;
	}
	/**
	 * @param altCounter the altCounter to set
	 */
	public void setAltCounter(int altCounter) {
		this.altCounter = altCounter;
	}
	/**
	 * @return the optedCounter
	 */
	public int getOptedCounter() {
		return optedCounter;
	}
	/**
	 * @param optedCounter the optedCounter to set
	 */
	public void setOptedCounter(int optedCounter) {
		this.optedCounter = optedCounter;
	}
	/**
	 * @return the contactNum
	 */
	public long getContactNum() {
		return contactNum;
	}
	/**
	 * @param contactNum the contactNum to set
	 */
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	

}
