package TravelAdvisor;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Review")

public class Review {

	@Id
	@Column(name = "autoID")
	private int autoID;

	@Column(name = "attractionName")
	private String attractionName;

	@Column(name = "userID")
	private String userID;

	@Column(name = "content")
	private String content;

	@Column(name = "score")
	private double score;

	@Column(name = "dateAndTime")
	private Date dateAndTime;

	public Review() {
		super();
	}

	public Review(int autoID, String attractionName, String userID, String content, double score, Date dateAndTime) {
		super();
		this.autoID = autoID;
		this.attractionName = attractionName;
		this.userID = userID;
		this.content = content;
		this.score = score;
		this.dateAndTime = dateAndTime;
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

}
