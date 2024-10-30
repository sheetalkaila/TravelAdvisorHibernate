package TravelAdvisor;

import javax.persistence.*;

@Entity
@Table(name="Attraction")

public class Attraction {

	@Id
	@Column(name="name")
	private String name;
	
	@Column(name="tag")
	private String tag;
	
	@Column(name="city")
	private String city;
	
	@Column(name="decription")
	private String desc;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="creator")
	private String Creator;
	
	@Column(name="status")
	private String Status;

	public Attraction() {
		super();
	}

	public Attraction(String name, String tag, String city, String desc, String rating, String creator, String status) {
		super();
		this.name = name;
		this.tag = tag;
		this.city = city;
		this.desc = desc;
		this.rating = rating;
		Creator = creator;
		Status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
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
