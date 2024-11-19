package TravelAdvisor;

import java.util.Scanner;

public class UserManagement {

	Scanner input = new Scanner(System.in);
	Hibernate h = new Hibernate();
	
	public User login() {
		
		System.out.println("Enter Your loginID.");
		String id  = input.nextLine();
		
		System.out.println("Enter Your password.");
		String psw  = input.nextLine();
				
		User loginuser = h.getUser(id,psw);
		return loginuser;
		
	}

	public User signup() {
		
		System.out.println("Enter Your loginID.");
		String id  = null;
		
		boolean isvaliduserid = false;
		while(!isvaliduserid) 
		{
			id  = input.nextLine();
			if(isValidId(id)) 
			{
				if(!h.isUserExists(id)) 
				{
					isvaliduserid = true;
				}
			}

		}
		
		System.out.println("Enter Your password.");
		String psw  = input.nextLine();
			
		while(psw.equals(id)) 
		{
			System.out.println("Password can not be same as LoginId Please enter a different password.");
			psw = input.nextLine();

		}		
		
		String type = null;
		while(type==null) 
		{
			System.out.println("Please Enter type.");
			System.out.println("1.Admin");
			System.out.println("2.User");
			type = input.nextLine();
		}		
		
		if(type.equals("1")) 
		{
			type = "admin";
		}
		else if (type.equals("2"))
		{
			type = "user";
		}
		else
		{
			System.out.println("Enter from the above choices only.");

		}
		String tag = "hist";
		User newUser = new User();
		newUser.setUserID(id);
		newUser.setPassword(psw);
		newUser.setType(type);
		newUser.setTag(tag);
		h.createUser(newUser);
		return newUser;
	}

	public boolean isValidId(String id) 
	{
		boolean isValid = true;
		
		if(id.equalsIgnoreCase("admin")) 
		{
			isValid = false;
			System.out.println("id can not be admin.");

		}
		if(id.length()<=2 || id.length()>11) 
		{
			isValid = false;
			System.out.println("id must be 3 to 10 characters.");

		}
		
		boolean hasLetter = false;
		boolean hasDigit = false;
		
		for(int i=0; i<id.length(); i++) {
			char currentChar = id.charAt(i);
			
			if(Character.isDigit(currentChar)) 
			{
				hasDigit = true;

			}
			if(Character.isLetter(currentChar)) 
			{
				hasLetter = true;

			}
		}
		
		if(!hasDigit || !hasLetter) 
		{
			isValid = false;
			System.out.println("id contains atleast one letter and one digit.");

		}
		
		return isValid;
		
	}
		

}
