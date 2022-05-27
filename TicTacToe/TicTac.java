
public class TicTac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grid = new int [3][3];
		printGrid(grid);
	}
	
	public static void printGrid(int[][] grid) {
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
	}

}
	