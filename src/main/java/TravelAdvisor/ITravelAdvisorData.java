package TravelAdvisor;

import java.util.ArrayList;

public interface ITravelAdvisorData {

	//user
	User getUser(String loginid,String psw);
	boolean isUserExists(String registerid);
	void createUser(User u);
	
	
	//attraction
	void createAttraction(Attraction a);
	Attraction getAttraction(String attName);
	ArrayList<Attraction> getAttractions(String torc,String torcvalue);
	
	void updateAttraction(Attraction a);
	
	
	//review
	void createReview(Review r);
	ArrayList<Review> getReviews(String attName);
	
	
	//favorite
	ArrayList<Attraction> getFavAttractions(String userid);
	
	
	//qanda
	ArrayList<String> getQuestions(String attName);
	void createAns(qanda qa);
	ArrayList<qanda> viewallqanda(String attName);
	
	
	//notification
	void updateNotification(Notification n);
	int getNotificationCount(int qid);
}
