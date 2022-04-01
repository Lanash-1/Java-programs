package setone;
import java.util.Scanner;

public class SecondProgram {
	
	static boolean isStone(char num1, char num2) {
		if(Integer.parseInt(String.valueOf(num1)) - Integer.parseInt(String.valueOf(num2)) == 1 || Integer.parseInt(String.valueOf(num1)) - Integer.parseInt(String.valueOf(num2)) == -1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean available = false;
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++) {
			boolean flag = false;
			String number = Integer.toString(i);
			int size = number.length();
			if(size == 1) {
				flag = true;
			}else {
				if(isStone(number.charAt(0), number.charAt(size-1))) {
					for(int j=1;j<size; j++) {
						if(!isStone(number.charAt(j), number.charAt(j-1))){
							flag = false;
							break;
						}else {
							flag = true;
						}
					}
				}
			}
			if(flag) {
				System.out.print(number+" ");
				available = true;
			}
		}
		if(!available) {
			System.out.println("No stepping numbers available");
		}
	}
}
