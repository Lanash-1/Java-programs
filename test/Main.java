package test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Subscription{
	
}

class UserDetails{
	int planCost;
	int planType;
	boolean activePlan;
	UserDetails(int planType, int planCost){
		this.planCost = planCost;
		this.planType = planType;
		activePlan = false;
	}
}

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Map<String, String> users = new HashMap<String, String>();
		Map<String, UserDetails> data = new HashMap<String, UserDetails>();
		boolean isAuthenticated = false;
		boolean exit = true;
		while(exit){
			System.out.print("Enter username: ");
			String username = sc.nextLine();
			System.out.print("Enter password: ");
			String password = sc.nextLine();
			if(users.containsKey(username)) {
				isAuthenticated = true;
				System.out.println("Logged in");
			}else {
				users.put(username, password);
				isAuthenticated = true;
				System.out.println("Signed up");
			}
			if(!(data.containsKey(username))) {
				data.put(username, new UserDetails(0, 0));
			}
			UserDetails currentUserDetails = data.get(username);
			if(currentUserDetails )
		}
//		data.put(username, new UserDetails("A", 299));
//		System.out.println(data.get(username));
	}
}