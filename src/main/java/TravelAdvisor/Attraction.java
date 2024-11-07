package TravelAdvisor;

import javax.persistence.*;

@Entity
@Table(name="Attraction")

public class Attraction {

	@Id
	@Column(name="attractionName")
	private String attractionName;
	
	@Column(name="tag")
	private String tag;
	
	@Column(name="city")
	private String city;
	
	@Column(name="decription")
	private String desc;
	
	@Column(name="rating")
	private double rating;
	
	@Column(name="creator")
	private String Creator;
	
	@Column(name="status")
	private String Status;

	public Attraction() {
		super();
	}

	public Attraction(String attractionName, String tag, String city, String desc, double rating, String creator, String status) {
		super();
		this.attractionName = attractionName;
		this.tag = tag;
		this.city = city;
		this.desc = desc;
		this.rating = rating;
		this.Creator = creator;
		this.Status = status;
	}

	public String getName() {
		return attractionName;
	}

	public void setName(String attractionName) {
		this.attractionName = attractionName;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getCreator() {
		return Creator;
	}

	public void setCreator(String creator) {
		Creator = creator;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	
	
	
	
	
}
