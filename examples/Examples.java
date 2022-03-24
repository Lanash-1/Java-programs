package examples;

class VarArgsExample{
	String result = "";
	VarArgsExample(String... words){
		for(String word : words) {
			result = result.concat(word);
		}
	}
}

public class Examples {
	public static void main(String[] args) {
		
		VarArgsExample words = new VarArgsExample("var","args");
		System.out.println(words.result + " with concat");
		StringBuffer buffer=new StringBuffer(words.result);
		buffer.append(" with string Buffer");
		System.out.println(buffer);
		StringBuilder builder = new StringBuilder(buffer);
		builder.replace(20, builder.length(),"Builder");
		System.out.println(builder);
	}
}
