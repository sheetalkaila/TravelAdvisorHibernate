package TravelAdvisor;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="qanda")

public class qanda {

	@Id
	@Column(name="autoID")
	private int autoID;
	
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
	private int q_id;

	public qanda() {
		super();
	}

	public qanda(int autoID, String attractionName, String type, String userID, String content, Date dateAndTime,
			int q_id) {
		super();
		this.autoID = autoID;
		this.attractionName = attractionName;
		this.type = type;
		this.userID = userID;
		this.content = content;
		this.dateAndTime = dateAndTime;
		this.q_id = q_id;
	}

	public int getAutoID() {
		return autoID;
	}

	public void setAutoID(int autoID) {
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

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	
	
	
	
}
