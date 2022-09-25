package userPojo;

//Create a UserService class with one method
public class UserService {

	//The method's name is createUser
	public User createUser () {

		//This createUser method will take an array of Strings as input
		String[] input = new String[3];
		
		//The input array will have three Strings inside of it: a username
		//a password, and a name.
		input[0] = "aUsernameHere";
		input[1] = "aPasswordHere";
		input[2] = "Somebodies Name";
		
		//Output a User object that will be populated with the inputs above
		User user = new User(input[0], input[1], input[2]);
		return user;
	}
	
}
