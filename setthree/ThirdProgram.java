package setthree;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ThirdProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");
		int limit = sc.nextInt();
		List<String> setWords = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		int gaps = 0;
		int noOfWords = 0;
		int index = 0;
		int currentLength = 0;
		String currentSet = "";
		while(index < words.length) {
			if(limit < words[index].length()) {
				System.out.println("Cannot justify");
				return;
			}
			currentLength += words[index].length();
			noOfWords++;
			gaps = noOfWords-1;
			if(currentLength+gaps <= limit) {
				setWords.add(words[index]);
				index++;
				continue;
			}else {

				int remainingSpace = limit - (currentLength-words[index].length());
				int leftSpace;
				int equalSpace;
				if(gaps-1 == 0) {
					equalSpace = 0;
					leftSpace = remainingSpace;
				}else {					
					equalSpace = remainingSpace/(gaps-1);
					leftSpace = remainingSpace%(gaps-1);
				}
				int count = 0;
				currentSet = "";
				while(count < noOfWords-1) {
					currentSet += setWords.get(count);
					if(count == 0) {
						for(int i=0; i<leftSpace; i++) {
							currentSet += " ";
						}
					}
					if(count!=noOfWords-2) {						
						for(int i=0; i<equalSpace; i++) {
							currentSet += " ";
						}
					}
					count++;
				}
				result.add(currentSet);
				System.out.println(currentSet);
				setWords.clear();
				currentLength = 0;
				noOfWords = 0;
				gaps = 0;
			}
		}
		if(gaps == 0) {
			currentSet = words[words.length-1];
			int endSpace = limit-currentSet.length();
			for(int i=0; i<endSpace; i++) {
				currentSet += " ";
			}
			result.add(currentSet);
			System.out.println(currentSet);
		}else {
			currentSet = "";
			int remainingSpace = limit - (currentLength);
			for(String w : setWords) {
				currentSet += w + " ";
				remainingSpace--;
			}
			for(int i=0; i<remainingSpace; i++) {
				currentSet += " ";
			}
			result.add(currentSet);
			System.out.println(currentSet);
		}
	}
}