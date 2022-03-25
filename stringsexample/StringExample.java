package stringsexample;

public class StringExample {
	public static void main(String[] args) {
		// String literals
		String word = "literal"; 
		
		// using new keyword
		String objWord = new String("literal"); 
		
		System.out.println(word == objWord); // false
		System.out.println(word.equals(objWord)); // true
		objWord = objWord.intern();
		System.out.println(word == objWord); // true
	}
}
