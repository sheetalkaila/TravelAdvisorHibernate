package TravelAdvisor;

import javax.persistence.*;

@Entity
@Table(name="Favorite")

public class Favorite {

	@Id
	@Column(name="autoID")
	private String autoID;
	
	@Column(name="userID")
	private String userID;
	
	@Column(name="attractionName")
	private String attractionName;

	public Favorite() {
		super();
	}

	public Favorite(String autoID, String userID, String attractionName) {
		super();
		this.autoID = autoID;
		this.userID = userID;
		this.attractionName = attractionName;
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

	public String getAttractionName() {
		return attractionName;
	}

	public void setAttractionName(String attractionName) {
		this.attractionName = attractionName;
	}

	
	
}