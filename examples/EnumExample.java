package examples;
public class EnumExample {
	public enum Direction {
		NORTH("up"),
		SOUTH("down"),
		EAST("right"),
		WEST("left");

		String direction;
		Direction(String direction) {
			this.direction = direction;
		}
	}
	public static void main(String[] args) {
		for(Direction d: Direction.values()) {
			System.out.println(d+" - "+ d.direction);
		}		
	}
}