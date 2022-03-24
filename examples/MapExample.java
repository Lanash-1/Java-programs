package examples;
import java.util.*;
public class MapExample {
	public static void main(String[] args) {
		
		System.out.println("hash map");
		
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Student 1", 1);
		hmap.put("Student 2", 2);
		hmap.put("Student 3", 3);
		for(Map.Entry<String, Integer> m: hmap.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
		System.out.println("Linked hash map");
		
		Map<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
		lhmap.put(2, "Student 2");
		lhmap.put(3, "Student 3");
		lhmap.put(1, "Student 1");
		for(Map.Entry<Integer, String> m: lhmap.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}
}