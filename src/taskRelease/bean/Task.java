package taskRelease.bean;

import java.util.Date;

public class Task {
	private Integer Id;
	private String title;
	private String content;
	private long releaseTime;
	private Integer releaseTea;
	private Integer receiverStu;
	private String state;
	private long finishTime;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(long releaseTime) {
		this.releaseTime = releaseTime;
	}
	public Integer getReleaseTea() {
		return releaseTea;
	}
	public void setReleaseTea(Integer releaseTea) {
		this.releaseTea = releaseTea;
	}
	public Integer getReceiverStu() {
		return receiverStu;
	}
	public void setReceiverStu(Integer receiverStu) {
		this.receiverStu = receiverStu;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(long finishTime) {
		this.finishTime = finishTime;
	}
}
