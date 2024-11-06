package TravelAdvisor;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="qanda")

public class qanda {

	@Id
	@Column(name="autoID")
	private String autoID;
	
	@Column(name="attractionName")
	private String attractionName;
	
	@Column(name="type")
	private String type;
	
	@Column(name="userID")
	private String userID;
	
	@Column(name="content")
	private String content;
	
	@Column(name="dateAndTime")
	private Date dateAndTime;
	
	@Column(name="q_id")
	private String q_id;

	public qanda() {
		super();
	}

	public qanda(String autoID, String attractionName, String type, String userID, String content, Date dateAndTime,
			String q_id) {
		super();
		this.autoID = autoID;
		this.attractionName = attractionName;
		this.type = type;
		this.userID = userID;
		this.content = content;
		this.dateAndTime = dateAndTime;
		this.q_id = q_id;
	}

	public String getAutoID() {
		return autoID;
	}

	public void setAutoID(String autoID) {
		this.autoID = autoID;
	}

	public String getAttractionName() {
		return attractionName;
	}

	public void setAttractionName(String attractionName) {
		this.attractionName = attractionName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getQ_id() {
		return q_id;
	}

	public void setQ_id(String q_id) {
		this.q_id = q_id;
	}
	
	
	
	
}
