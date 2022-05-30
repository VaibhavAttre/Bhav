import java.util.Scanner;
public class tic {
	
	//public variables 
	public static Scanner s = new Scanner(System.in);
	public static String[][] grid = new String[3][3];
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setGrid();		
		move();
	}
	
	public tic(String[][] g) {
		grid = g;
	}
	
	//printing the grid
	public static void printGrid() {
		for (int i = 0; i < grid[0].length; i++) {
			for (int j = 0; j < grid[0].length+2; j++) {
				if(j%2 == 0) {
					System.out.print(grid[i][j/2]);
				} else {
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
	}
	
	//main game loop
	public static void move() {
		int i = 0;
		while (!winX() && !winO() /*|| add a check for all boxes filled */) {
			if (i%2 == 0) { playerMove(true);
			} else { playerMove(false); }
			i++;
			printGrid();
		}
		if (winX()) { System.out.println("X WINS");}
		else if (winO()) { System.out.println("O WINS"); }
	}
	
	//Displays player move
	public static void playerMove(boolean m) {
		System.out.println("Give move x and y");
		int x = s.nextInt();
		int y = s.nextInt();
		if (!grid[x][y].equals(" ")) {
			playerMove(m);
		}else {
			if(m == true) {
				grid[x][y] = "X";
			} else {
				grid[x][y] = "O";
			}
		}
	}
	
	//initializes grid to all empty
	public static void setGrid () {
		for (int i = 0; i < grid[0].length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = " ";
			}
		}
	}
	
	//checks if X won
	public static boolean  winX() {
		boolean won = false;
		for (int i =0; i < 3; i++) {
			if (checkHor("X", i, 0) || checkVer("X",0,i) || checkDiag("X")) {
				won = true;
				break;
			}
		}
		return won;
	}
	
	//checks if O won
	public static boolean winO() {
		boolean won = false;
		for (int i =0; i < 3; i++) {
			if (checkHor("O", i, 0)|| checkVer("O",0,i) || checkDiag("O")) {
				won = true;
				break;
			}
		}
		return won;
	}
	
	//checks horizontal for win
	public static boolean checkHor(String x, int i, int j) {
		if(grid[i][j].equals(x)) {
			if (j == 2) {
				return true;
			} else {
				return checkHor(x,i,j+1);
			}
		} 
		return false;
	}
	
	//checks vertical for win
	public static boolean checkVer(String x, int i, int j) {
		if(grid[i][j].equals(x)) {
			if (i == 2) {
				return true;
			} else {
				return checkVer(x,i+1,j);
			}
		} 
		return false;
	}
	
	//checks diagonal for win
	public static boolean checkDiag(String x) {
		boolean found = false;
		for (int i = 0; i < 3; i++) {
			if (grid[i][i].equals(x) || grid[i][2-i].equals(x)) {
				if (i == 2) {
					found = true;
				}
			} else {
				break;
			}
		}
		return found;
	}
	
}
	