package TravelAdvisor;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Notification")

public class Notification {

	@Id
	@Column(name = "autoID")
	private String autoID;

	@Column(name = "userID")
	private String userID;

	@Column(name = "q_id")
	private String q_id;

	@Column(name = "dateAndTime")
	private Date dateAndTime;

	@Column(name = "content")
	private String content;

	@Column(name = "status")
	private String status;

	public Notification() {
		super();
	}

	public Notification(String autoID, String userID, String q_id, Date dateAndTime, String content, String status) {
		super();
		this.autoID = autoID;
		this.userID = userID;
		this.q_id = q_id;
		this.dateAndTime = dateAndTime;
		this.content = content;
		this.status = status;
	}

	public String getAutoID() {
		return autoID;
	}

	public void setAutoID(String autoID) {
		this.autoID = autoID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getQ_id() {
		return q_id;
	}

	public void setQ_id(String q_id) {
		this.q_id = q_id;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
