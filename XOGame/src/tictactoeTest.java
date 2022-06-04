public class tictactoeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] xHor = {
				{"X","X","X"},
				{"O","O","X"},
				{"X","O","O"}
		};
		String[][] oHor = {
				{"O","X","X"},
				{"O","O","O"},
				{"X","O","X"}
		};
		String[][] xVer = {
				{"X","X","O"},
				{"X","O","O"},
				{"X","O","X"}
		};
		String[][] oVer = {
				{"O","X","O"},
				{"O","O","X"},
				{"O","X","O"}
		};
		String[][] xDiag = {
				{"X"," "," "},
				{" ","X"," "},
				{" "," ","X"}
		};
		String[][] oDiag = {
				{"O"," "," "},
				{" ","O"," "},
				{" "," ","O"}
		};
		String[][] xDiagB = {
				{" "," ","X"},
				{" ","X"," "},
				{"X"," "," "}
		};
		String[][] oDiagB = {
				{"X","X","O"},
				{"X","O","X"},
				{"O","X","X"}
		};
		
		tic x = new tic(xHor);
		tic.move();

		tic y = new tic(oHor);
		tic.move();

		tic z = new tic(xVer);
		tic.move();

		tic a = new tic(oVer);
		tic.move();

		tic b = new tic(xDiag);
		tic.move();

		tic c = new tic(oDiag);
		tic.move();
		
		tic d = new tic(xDiagB);
		tic.move();

		tic e = new tic(oDiagB);
		tic.move();
	}
	

	


}
