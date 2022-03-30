package test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class ComingSoon{
	static List<String> showsComingSoon = new ArrayList<String>();
	static void add(String... shows) {
		for(String show : shows) {
			showsComingSoon.add(show);
		}
	}
	static void display() {
		System.out.println("Upcoming shows");
		for(String shows : showsComingSoon) {
			System.out.println(shows);
		}
	}
}

class Subscription{
	int planType = 0;
	int planCost = 0;
	int planValidity = 0;
	boolean activePlan;
	void plan() {
			System.out.println("Inactive Plan");	
	}
}
class BasicPlan extends Subscription{
	void plan() {
		planType = 1;
		planCost = 199;
		planValidity = 1;
	}
}
class PremiumPlan extends Subscription{
	void plan() {
		planType = 2;
		planCost = 499;
		planValidity = 3;
	}
}
class YearPlan extends Subscription{
	void plan() {
		planType = 3;
		planCost = 999;
		planValidity = 12;
	}
}

class UserPlanDetails extends Subscription{
	
	UserPlanDetails(int planType, int planCost, int planValidity){
		super.planCost = planCost;
		super.planType = planType;
		super.planValidity = planValidity;
		if(planType > 0) {
			super.activePlan = true;
		}else {
			super.activePlan = false;
		}
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

class SeriesStore{
	private final List<Series> series;
	SeriesStore(List<Series> series){
		this.series = series;
	}
	
	public List<Series> getSeriesList(){
		return series;
	}
}

class MovieStore{
	private final List<Movie> movies;
	MovieStore(List<Movie> movies){
		this.movies = movies;
	}
	
	public List<Movie> getMovieList(){
		return movies;
	}
}

public class Project {
	static Scanner sc = new Scanner(System.in);
	static
	{
		final String ott = "Show";
		System.out.println("Welcome to the " + ott);
		ComingSoon.add("arrival 1", "arrival 2", "arrival 3", "arrival 4");
	}
	
	static void display() {
		System.out.println("0.logout\n1.View Current Plan\n2.Watch movies\n3.Watch series");
	}
	public static void main(String[] args) {
		ComingSoon.display();
		Map<String, String> users = new HashMap<String, String>();
		Map<String, UserPlanDetails> data = new HashMap<String, UserPlanDetails>();
		Shows show1 = new Shows("movie 1", "english", 2022);
		Shows show2 = new Shows("series 1", "tamil", 2000, 8);
		Shows show3 = new Shows("movie 2", "tamil", 2012);
		Shows show4 = new Shows("series 2", "telugu", 2020, 5);
		Shows show5 = new Shows("movie 3", "english", 2021);
		Shows show6 = new Shows("series 3", "tamil", 2010, 10);
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(show1);
		movies.add(show3);
		movies.add(show5);
		List<Series> series = new ArrayList<Series>();
		series.add(show2);
		series.add(show4);
		series.add(show6);

		MovieStore movieStore = new MovieStore(movies);
		SeriesStore seriesStore = new SeriesStore(series);
		
		List<Movie> movieList = movieStore.getMovieList();
		List<Series> seriesList = seriesStore.getSeriesList();
		
		boolean isAuthenticated = false;
		boolean exit = true;
		while(exit){
			System.out.println("0. Exit\n1.Login or Signup");
			int auth = sc.nextInt();
			sc.nextLine();
			if(auth == 0 || auth != 1) {
				break;
			}
			System.out.print("Enter username: ");
			String username = sc.nextLine();
			System.out.print("Enter password: ");
			String password = sc.nextLine();
			if(users.containsKey(username)) {
				if(users.get(username).equals(password)) {
					isAuthenticated = true;
					System.out.println("Logged in");
				}else {
				System.out.println("Invalid password. Try Again");
				}
			}else {
				users.put(username, password);
				isAuthenticated = true;
				System.out.println("Signed up");
			}
			if(!(data.containsKey(username))) {
				data.put(username, new UserPlanDetails(0, 0, 0));
			}
			while(!(data.get(username).activePlan) && isAuthenticated) {
				System.out.println("Subscribe to continue");
				System.out.println("0. Logout");
				System.out.println("1. View Plans");
				int option = sc.nextInt();
				Subscription selectedPlan = null;
				switch(option) {
				case 0:
					isAuthenticated = false;
					System.out.println("Logged out");
					break;
				case 1:
					System.out.println("Select plan to view");
					System.out.println("1. Basic plan\n2.Premium plan\n3.year plan");
					int planoption = sc.nextInt();
//					Subscription selectedPlan;
					switch(planoption) {
					case 1:
						selectedPlan = new BasicPlan();
						selectedPlan.plan();
						System.out.println("Plan cost: " + selectedPlan.planCost + "\nPlan Validity: " + selectedPlan.planValidity);
						break;
					case 2:
						selectedPlan = new PremiumPlan();
						selectedPlan.plan();
						System.out.println("Plan cost: " + selectedPlan.planCost + "\nPlan Validity: " + selectedPlan.planValidity);
						break;
					case 3:
						selectedPlan = new YearPlan();
						selectedPlan.plan();
						System.out.println("Plan cost: " + selectedPlan.planCost + "\nPlan Validity: " + selectedPlan.planValidity);
						break;
					default:
						System.out.println("Invalid option");
					}
					if(planoption > 0 && planoption < 4) {
						System.out.println("Press 1 to subscribe");
						int sub = sc.nextInt();
						switch(sub) {
						case 1:
							data.put(username, new UserPlanDetails(selectedPlan.planType, selectedPlan.planCost, selectedPlan.planValidity));
							System.out.println("Subscribed.");
							break;
						default:
							System.out.println("Cannot subscribe");
						}
					}
					break;
				default:
					System.out.println("Invalid option");
				}
			}
			while(isAuthenticated) {
				
				display();
				int action = sc.nextInt();
				switch(action) {
				case 0:
					System.out.println("Logged out");
					isAuthenticated = false;
					break;
				case 1:
					System.out.println("Plan Type: "+data.get(username).planType+"\nPlan Cost: "+data.get(username).planCost+"\nPlan Validity: "+data.get(username).planValidity);
					break;
				case 2:
					System.out.println("Movies");
					for(int i=0; i<movieList.size(); i++) {
						System.out.println(movieList.get(i).title);
					}
					System.out.println("Select movie to play");
					int selectedMovie = sc.nextInt();
					if(selectedMovie < movieList.size()) {						
						System.out.println("Playing now\nTitle:- "+movieList.get(selectedMovie-1).title+
								"\nLanguage:- "+movieList.get(selectedMovie-1).language+
								"\nYear:- "+movieList.get(selectedMovie-1).releaseYear);
					}else {
						System.out.println("Select from the above list");
					}
					break;
				case 3:
					System.out.println("Series");
					for(int i=0; i<seriesList.size(); i++) {
						System.out.println(seriesList.get(i).title);
					}
					System.out.println("Select series to play");
					int selectedSeries = sc.nextInt();
					if(selectedSeries < seriesList.size()) {	
						System.out.println("Playing now\nTitle:- "+seriesList.get(selectedSeries-1).title+
								"\nEpisodes:- "+seriesList.get(selectedSeries-1).totalNoOfEpisode+
								"\nLanguage:- "+seriesList.get(selectedSeries-1).language+
								"\nYear:- "+seriesList.get(selectedSeries-1).releaseYear);
					}else {
						System.out.println("Select from the above list");
					}
					break;
				default:
					System.out.println("Invalid option");
				}
			}
		}
		System.out.println("End");
	}
}