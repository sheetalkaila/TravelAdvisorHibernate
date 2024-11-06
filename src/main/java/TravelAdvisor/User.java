package TravelAdvisor;

import javax.persistence.*;

@Entity
@Table(name="User")

public class User {

	@Id
	@Column(name="userID")
	private String userID;
	
	@Column(name="password")
	private String password;
	
	@Column(name="type")
	private String type;
	
	@Column(name="tag")
	private String tag;

	public User() {
		super();
	}

	public User(String userID, String password, String type, String tag) {
		super();
		this.userID = userID;
		this.password = password;
		this.type = type;
		this.tag = tag;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
	
	
}
