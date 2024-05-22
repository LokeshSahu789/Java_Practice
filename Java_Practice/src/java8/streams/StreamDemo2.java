package java8.streams;
//Program to convert User[] into 
//Map<userId, User> 

import java.util.Arrays; 
import java.util.Map; 
import java.util.stream.*; 

//Implementing the User class 
class User { 

	// Attributes of the user class 
	private int userId; 
	private String name; 
	private String city; 

	// Constructor 
	public User(int userId, String name, 
				String city) 
	{ 
		this.userId = userId; 
		this.name = name; 
		this.city = city; 
	} 

	// Getters of the user class 
	public int getUserId() { return userId; } 

	public String getName() { return name; } 

	public String getCity() { return city; } 

	// Overriding the toString method 
	// to return the custom string 
	@Override
	public String toString() 
	{ 
		return "User [userId = "
			+ userId + ", name = "
			+ name + ", city = "
			+ city + "]"; 
	} 
} 

public class StreamDemo2 { 

	// Function to convert the User 
	// to the map 
	public static Map toMap(User user1, User user2, 
							User user3) 
	{ 

		Map<Integer, User> userMap 
			= Arrays.asList(user1, user2, user3) 
				.stream() 
				.collect(Collectors.toMap( 
						user -> user.getUserId(), 
						user -> user)); 

		return userMap; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating users 
		User user1 
			= new User(1, "User1", "Pune"); 

		User user2 
			= new User(2, "User2", "Mumbai"); 

		User user3 
			= new User(3, "User3", "Nagpur"); 

		System.out.println(toMap(user1, user2, 
								user3)); 
	} 
} 
