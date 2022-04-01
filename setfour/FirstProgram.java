package setfour;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstProgram {
	
	public static int digitSum(int no) {
		int sumOfDigits = 0;
		while(no>0) {
			sumOfDigits += no%10;
			no /= 10;
		}
		return sumOfDigits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int y = sc.nextInt();
		List<Integer> result = new ArrayList<Integer>();
		if(n1 < n2) {
			for(int x=n1; x<=n2; x++) {
				boolean flag = true;
				if(y<3) {
					y = 3;
				}
				if(x == y) {
					y+=2;
					result.add(x);
					flag = false;
				}else if(x%y == 0 || y%x == 0) {
					y+=2;
					result.add(x);
					flag = false;
				}else {
					int z = x;
					while(z>9) {
						z = digitSum(z);
						if(z%y == 0 || y%z == 0) {
							result.add(x);
							y+=2;
							flag = false;
							break;
						}
						if(z%y == 0 || y%z == 0) {
							result.add(x);
							y+=2;
							flag = false;
						}
					}
				}
				if(flag) {
					y-=1;
				}
			}
		}else {
			System.out.println("NONE");
//			for(int x=n1; x>=n2; x--) {
//				boolean flag = true;
//				if(y<3) {
//					y = 3;
//				}
//				if(x == y) {
//					y+=2;
//					result.add(x);
//					flag = false;
//				}else if(x%y == 0 || y%x == 0) {
//					y+=2;
//					result.add(x);
//					flag = false;
//				}else {
//					int z = x;
//					while(z>9) {
//						z = digitSum(z);
//						if(z%y == 0 || y%z == 0) {
//							result.add(x);
//							y+=2;
//							flag = false;
//							break;
//						}
//						if(z%y == 0 || y%z == 0) {
//							result.add(x);
//							y+=2;
//							flag = false;
//						}
//					}
//				}
//				if(flag) {
//					y-=1;
//				}
//			}
		}
		for(Integer r : result) {
			System.out.print(r + " ");
		}
	}
}
