package practice;
import java.util.ArrayList;
import java.util.List;

class Characters{
	String name;
	String power;
	int rank;
	Characters(String name, String power, int rank){
		this.name = name;
		this.power = power;
		this.rank = rank;
	}
}

public class ArrayListExample {
	public static void main(String[] args) {		
		ArrayList<String> EmployeeNames = new ArrayList<String>();
		int arr[]=new int[5];
		for(int i=0; i<5; i++){
			arr[i] = i+1;
			EmployeeNames.add("Emp "+arr[i]);
		}
		for(String name: EmployeeNames) {
			System.out.println(name);
		}
		
		Characters c1 = new Characters("lion", "attack", 1);
		Characters c2 = new Characters("tiger", "attack", 2);
		Characters c3 = new Characters("monkey", "defence", 3);
		
		
		List<Characters> icon = new ArrayList<Characters>();
		icon.add(c1);
		icon.add(c2);
		icon.add(c3);
		System.out.println(icon);
		for(Characters c: icon) {
			System.out.println(c.name + " " + c.power + " " + c.rank);
		}
		
	}
}