package recursions;

class StringReverse 
{ 
    void reverseString(String str) 
    { 
        if (str.length() <= 1) 
           System.out.println(str); 
        else
        {
            System.out.print(str.charAt(str.length()-1)); 
            reverseString(str.substring(0,str.length()-1)); 
        } 
    }
}

public class RecursionReverseString {
	public static void main(String[] args) {
		String word = "Summer intern";
		StringReverse r = new StringReverse();
		r.reverseString(word);
	}
}
