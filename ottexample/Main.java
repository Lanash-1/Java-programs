package ottexample;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class UserDetails{
	boolean isPlanActive;
	int planCost;
	int planValidity;
	UserDetails(boolean isPlanActive, int planCost, int planValidity){
		this.isPlanActive = isPlanActive;
		this.planCost = planCost;
		this.planValidity = planValidity;
	}
}

class User{
	String username;
	String password;
	User(String username, String password){
		this.username = username;
		this.password = password;
	}
}

class UserStore{
	private final List<User> users;
	UserStore(List<User> users){
		this.users = users;
	}
	
	public List<User> getUserList(){
		return users;
	}
}

class Movie{
	String title;
	String language;
	int releaseYear;
}


class Series extends Movie{
	int totalNoOfEpisode;
}

class Shows extends Series{
	Shows(String title, String language, int releaseYear){
		this.title = title;
		this.language = language;
		this.releaseYear = releaseYear;
	}
	Shows(String title, String language, int releaseYear, int totalNoOfEpisode){
		this.title = title;
		this.language = language;
		this.releaseYear = releaseYear;
		this.totalNoOfEpisode = totalNoOfEpisode;
	}
}

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		User user1 = new User("aaaaaa", "111111");
		User user2 = new User("bbbbbb", "222222");
		User user3 = new User("cccccc", "333333");
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		UserStore store = new UserStore(users);
		List<User> userList = store.getUserList();
		Shows show1 = new Shows("m 1", "english", 2022);
		Shows show2 = new Shows("s 1", "tamil", 2000, 8);
		Shows show3 = new Shows("m 2", "hindi", 2012);
		Shows show4 = new Shows("s 2", "telugu", 2020, 5);
		Shows show5 = new Shows("m 3", "english", 2021);
		Shows show6 = new Shows("s 3", "english", 2010, 10);
		List<Shows> shows = new ArrayList<Shows>();
		shows.add(show1);
		shows.add(show2);
		shows.add(show3);
		shows.add(show4);
		shows.add(show5);
		shows.add(show6);
		Map<String, UserDetails> details = new HashMap<String, UserDetails>();
		UserDetails data1 = new UserDetails(true, 999, 12);
		UserDetails data2 = new UserDetails(false, 0, 0);
		UserDetails data3 = new UserDetails(true, 199, 1);
		List<UserDetails> data = new ArrayList<UserDetails>();
		data.add(data1);
		data.add(data2);
		data.add(data3);
		for(int i=0; i<userList.size(); i++) {
			details.put(userList.get(i).username, data.get(i));
		}
		for (Map.Entry<String, UserDetails> d : details.entrySet()) {
			System.out.println("Username: " + d.getKey());
			System.out.println("Active plan: " + d.getValue().isPlanActive);
			System.out.println("Plan cost: " + d.getValue().planCost);
			System.out.println("Plan validity: "+ d.getValue().planValidity);
		}	
	}
}