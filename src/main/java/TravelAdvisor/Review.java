package TravelAdvisor;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Review")

public class Review {

	@Id
	@Column(name = "autoID")
	private String autoID;

	@Column(name = "attractionName")
	private String attractionName;

	@Column(name = "userID")
	private String userID;

	@Column(name = "content")
	private String content;

	@Column(name = "score")
	private String score;

	@Column(name = "dateAndTime")
	private Date dateAndTime;

	public Review() {
		super();
	}

	public Review(String autoID, String attractionName, String userID, String content, String score, Date dateAndTime) {
		super();
		this.autoID = autoID;
		this.attractionName = attractionName;
		this.userID = userID;
		this.content = content;
		this.score = score;
		this.dateAndTime = dateAndTime;
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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

}
