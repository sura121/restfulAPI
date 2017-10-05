package org.seonbeen.domain;

public class ReplyVO {
	
	private int rno;
	private int bno;
	private int gord;
	private int parent;
	private int depth;
	private String rcontent;
	private String rwriter;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getGord() {
		return gord;
	}
	public void setGord(int gord) {
		this.gord = gord;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public String getRwriter() {
		return rwriter;
	}
	public void setRwriter(String rwriter) {
		this.rwriter = rwriter;
	}
	
	@Override
	public String toString() {
		return "ReplyVO [rno=" + rno + ", bno=" + bno + ", gord=" + gord + ", parent=" + parent + ", depth=" + depth
				+ ", rcontent=" + rcontent + ", rwriter=" + rwriter + "]";
	}
	
	

}
