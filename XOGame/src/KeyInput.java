import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	private boolean turn;
	
	public KeyInput(Handler handler, boolean turn) {
		this.handler = handler;
		this.turn = turn;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		TicTacToeApp.printGrid();
		//System.out.println(TicTacToeApp.turns + "1");
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject temp = handler.object.get(i);
			
			if ( TicTacToeApp.turns) {

				if (key == KeyEvent.VK_1  && TicTacToeApp.grid[0][0] == ' ') {
					TicTacToeApp.grid[0][0] = 'X';
				} else if (key == KeyEvent.VK_2 && TicTacToeApp.grid[0][1] == ' ') {
					TicTacToeApp.grid[0][1] = 'X';
				} else if (key == KeyEvent.VK_3 && TicTacToeApp.grid[0][2] == ' ') {
					TicTacToeApp.grid[0][2] = 'X';
				} else if (key == KeyEvent.VK_4 && TicTacToeApp.grid[1][0] == ' ') {
					TicTacToeApp.grid[1][0] = 'X';
				} else if (key == KeyEvent.VK_5 && TicTacToeApp.grid[1][1] == ' ') {
					TicTacToeApp.grid[1][1] = 'X';
				} else if (key == KeyEvent.VK_6 && TicTacToeApp.grid[1][2] == ' ') {
					TicTacToeApp.grid[1][2] = 'X';
				} else if (key == KeyEvent.VK_7 && TicTacToeApp.grid[2][0] == ' ') {
					TicTacToeApp.grid[2][0] = 'X';
				} else if (key == KeyEvent.VK_8 && TicTacToeApp.grid[2][1] == ' ') {
					TicTacToeApp.grid[2][1] = 'X';
				} else if (key == KeyEvent.VK_9 && TicTacToeApp.grid[2][2] == ' ') {
					TicTacToeApp.grid[2][2] = 'X';
				}
 
			}
			else if(TicTacToeApp.turns == false) {
				
				if (key == KeyEvent.VK_1 && TicTacToeApp.grid[0][0] == ' ' ) {
					TicTacToeApp.grid[0][0] = 'O';
				} else if (key == KeyEvent.VK_2 && TicTacToeApp.grid[0][1] == ' ' ) {
					TicTacToeApp.grid[0][1] = 'O';
				} else if (key == KeyEvent.VK_3 && TicTacToeApp.grid[0][2] == ' ') {
					TicTacToeApp.grid[0][2] = 'O';
				} else if (key == KeyEvent.VK_4 && TicTacToeApp.grid[1][0] == ' ') {
					TicTacToeApp.grid[1][0] = 'O';
				} else if (key == KeyEvent.VK_5 && TicTacToeApp.grid[1][1] == ' ') {
					TicTacToeApp.grid[1][1] = 'O';
				} else if (key == KeyEvent.VK_6 && TicTacToeApp.grid[1][2] == ' ') {
					TicTacToeApp.grid[1][2] = 'O';
				} else if (key == KeyEvent.VK_7 && TicTacToeApp.grid[2][0] == ' ') {
					TicTacToeApp.grid[2][0] = 'O';
				} else if (key == KeyEvent.VK_8 && TicTacToeApp.grid[2][1] == ' ' ) {
					TicTacToeApp.grid[2][1] = 'O';
				} else if (key == KeyEvent.VK_9 && TicTacToeApp.grid[2][2] == ' ') {
					TicTacToeApp.grid[2][2] = 'O';
				}
			}
	
			
		}
		if (TicTacToeApp.turns == true) {
			TicTacToeApp.turns = false;
 		} else {
 			TicTacToeApp.turns = true;
 		}
		TicTacToeApp.getInstance().displayOnBoard();
		
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		TicTacToeApp.printGrid();
	
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject temp = handler.object.get(i);
			
			if (TicTacToeApp.turns) {
				if (key == KeyEvent.VK_1  && TicTacToeApp.grid[0][0] == ' ') {
					TicTacToeApp.grid[0][0] = 'X';
				} else if (key == KeyEvent.VK_2 && TicTacToeApp.grid[0][1] == ' ') {
					TicTacToeApp.grid[0][1] = 'X';
				} else if (key == KeyEvent.VK_3 && TicTacToeApp.grid[0][2] == ' ') {
					TicTacToeApp.grid[0][2] = 'X';
				} else if (key == KeyEvent.VK_4 && TicTacToeApp.grid[1][0] == ' ') {
					TicTacToeApp.grid[1][0] = 'X';
				} else if (key == KeyEvent.VK_5 && TicTacToeApp.grid[1][1] == ' ') {
					TicTacToeApp.grid[1][1] = 'X';
				} else if (key == KeyEvent.VK_6 && TicTacToeApp.grid[1][2] == ' ') {
					TicTacToeApp.grid[1][2] = 'X';
				} else if (key == KeyEvent.VK_7 && TicTacToeApp.grid[2][0] == ' ') {
					TicTacToeApp.grid[2][0] = 'X';
				} else if (key == KeyEvent.VK_8 && TicTacToeApp.grid[2][1] == ' ') {
					TicTacToeApp.grid[2][1] = 'X';
				} else if (key == KeyEvent.VK_9 && TicTacToeApp.grid[2][2] == ' ') {
					TicTacToeApp.grid[2][2] = 'X';
				}
 
 
			}
			else if(!TicTacToeApp.turns) {
				
				if (key == KeyEvent.VK_1 && TicTacToeApp.grid[0][0] == ' ' ) {
					TicTacToeApp.grid[0][0] = 'O';
				} else if (key == KeyEvent.VK_2 && TicTacToeApp.grid[0][1] == ' ' ) {
					TicTacToeApp.grid[0][1] = 'O';
				} else if (key == KeyEvent.VK_3 && TicTacToeApp.grid[0][2] == ' ') {
					TicTacToeApp.grid[0][2] = 'O';
				} else if (key == KeyEvent.VK_4 && TicTacToeApp.grid[1][0] == ' ') {
					TicTacToeApp.grid[1][0] = 'O';
				} else if (key == KeyEvent.VK_5 && TicTacToeApp.grid[1][1] == ' ') {
					TicTacToeApp.grid[1][1] = 'O';
				} else if (key == KeyEvent.VK_6 && TicTacToeApp.grid[1][2] == ' ') {
					TicTacToeApp.grid[1][2] = 'O';
				} else if (key == KeyEvent.VK_7 && TicTacToeApp.grid[2][0] == ' ') {
					TicTacToeApp.grid[2][0] = 'O';
				} else if (key == KeyEvent.VK_8 && TicTacToeApp.grid[2][1] == ' ' ) {
					TicTacToeApp.grid[2][1] = 'O';
				} else if (key == KeyEvent.VK_9 && TicTacToeApp.grid[2][2] == ' ') {
					TicTacToeApp.grid[2][2] = 'O';
				}
			}
		

		}
		

		TicTacToeApp.getInstance().displayOnBoard();		
	}
	
}
