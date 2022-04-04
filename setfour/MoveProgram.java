package setfour;
import java.util.Scanner;

class MoveProgram {
	static int m = 4;
	static int[][] array = {{4,4,2,0}, {4,0,4,0}, {2,4,0,0}, {2,0,0,0}};
	
	static void moveLeftOrRight() {
		int start = 0;
		int total = 0;
		for(int row = 0; row<m; row++) {
			start = 0;
			total = array[row][start];
			for(int col=1; col<m; col++) {
				if(array[row][col] == array[row][start]) {
					total += array[row][col];
					array[row][col] = 0;
					if(col == m-1) {
						array[row][start] = total;
					}
				}else if(array[row][col] == 0){
					if(col == m-1) {
						array[row][start] = total;
					}
				}else {
					array[row][start] = total;
					start = col;
					total = array[row][start];
				}
			}
		}	
	}
	
	static void moveLeft() {
		moveLeftOrRight();
		int index = 0;
		for(int row = 0; row<m; row++) {
			index=0;
			for(int col = 0; col<m; col++) {
				if(array[row][col] != 0) {
					array[row][index] = array[row][col];
					if(col!=index) {
						array[row][col] = 0;
					}
					index++;
				}
			}
		}
	}
	
	static void moveRight() {
		moveLeftOrRight();
		int index = m-1;
		for(int row = 0; row<m; row++) {
			index=m-1;
			for(int col = m-1; col>=0; col--) {
				if(array[row][col] != 0) {
					array[row][index] = array[row][col];
					if(col!=index) {
						array[row][col] = 0;
					}
					index--;
				}
			}
		}
	}
	
	static void insertAt(int row, int col, int value) {
		array[row][col] = value;
	}
	
	static void moveUpOrDown() {
		int start = 0;
		int total = 0;
		for(int col=0; col<m; col++) {
			start = 0;
			total = array[start][col];
			for(int row=1; row<m; row++) {
				if(array[row][col] == array[start][col]) {
					total += array[row][col];
					array[row][col] = 0;
					if(row == m-1) {
						array[start][col] = total;
					}
				}else if(array[row][col] == 0){
					if(row == m-1) {
						array[start][col] = total;
					}
				}else {
					array[start][col] = total;
					start = row;
					total = array[start][col];
				}
			}
		}
	}
	
	static void moveUp() {

		moveUpOrDown();
		int index = 0;
		for(int col=0; col<m; col++) {
			index = 0;
			for(int row=0; row<m; row++) {
				if(array[row][col] != 0) {
					array[index][col] = array[row][col];
					if(row!=index) {
						array[row][col] = 0;
					}
					index++;
				}
			}
		}
	}
	
	static void moveDown() {
		moveUpOrDown();
		int index = m-1;
		for(int col=0; col<m; col++) {
			index = m-1;
			for(int row=m-1; row>=0; row--) {
				if(array[row][col] != 0) {
					array[index][col] = array[row][col];
					if(row!=index) {
						array[row][col] = 0;
					}
					index--;
				}
			}
		}
	}
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		moveLeft();
//		insertAt(1,1,8);
//		moveLeft();
//		moveRight();
		
//		moveUp();
//		moveDown();
//		insertAt(2, 1, 8);
//		insertAt(1, 2, 2);
//		moveDown();
		
		moveDown();
		moveDown();
		insertAt(3, 3, 4);
		insertAt(2, 3, 2);
		moveRight();

		for(int i=0; i<m; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
