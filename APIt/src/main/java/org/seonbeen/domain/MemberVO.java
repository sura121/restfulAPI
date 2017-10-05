package org.seonbeen.domain;


public class MemberVO {
	
	private int mno;
	private String name;
	private String id;
	private String password;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "MemberVO [mno=" + mno + ", name=" + name + ", id=" + id + ", password=" + password + "]";
	}
	
	
	
	
}
