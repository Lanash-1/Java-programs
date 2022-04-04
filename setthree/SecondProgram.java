package setthree;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] string = sc.nextLine().split(" ");
		String word = "";
		for(String s : string) {
			word+=s.toLowerCase();
		}
//		System.out.println(word);
		List<String> result = new ArrayList<String>();
		List<String> total = new ArrayList<String>();
		for(int i=0; i<word.length()-2; i++) {
			for(int j=i+2; j<word.length()+1; j++) {
				String temp = word.substring(i, j);
				if(result.contains(temp)) {
					total.add(temp);
				}else {
					result.add(temp);
				}
			}
		}
		if(total.size()>0) {
			String current = total.get(0);
		for(int i=1; i<total.size(); i++) {
			if(total.get(i).contains(current)) {
				current = total.get(i);
			}else if(current.length() > total.get(i).length()) {
					if(current.contains(total.get(i))) {
						continue;
					}else {
						System.out.println(current);
						current = total.get(i);
					}
				}else {
					current = total.get(i);
				}
		}
		System.out.println(current);
		}else {
			System.out.println("None");
		}
//		System.out.println("RESULT");
//		for(String t : total) {
//			System.out.println(t);
//		}
	}
}