import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		TicTacToeApp.printGrid();
	
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject temp = handler.object.get(i);
			
			if (temp.getID() == ID.Player) {
				if (key == KeyEvent.VK_1 ) {
					TicTacToeApp.grid[0][0] = 'X';
				} else if (key == KeyEvent.VK_2 ) {
								TicTacToeApp.grid[0][1] = 'X';
				} else if (key == KeyEvent.VK_3 ) {
					TicTacToeApp.grid[0][2] = 'X';
				} else if (key == KeyEvent.VK_4 ) {
					TicTacToeApp.grid[1][0] = 'X';
				} else if (key == KeyEvent.VK_5 ) {
					TicTacToeApp.grid[1][1] = 'X';
				} else if (key == KeyEvent.VK_6 ) {
					TicTacToeApp.grid[1][2] = 'X';
				} else if (key == KeyEvent.VK_7 ) {
					TicTacToeApp.grid[2][0] = 'X';
				} else if (key == KeyEvent.VK_8 ) {
					TicTacToeApp.grid[2][1] = 'X';
				} else if (key == KeyEvent.VK_9 ) {
					TicTacToeApp.grid[2][2] = 'X';
				}
 
			}
			else if(temp.getID() == ID.Enemy) {
		
				if (key == KeyEvent.VK_Q ) {
					TicTacToeApp.grid[0][0] = 'O';
				} else if (key == KeyEvent.VK_W) {
					TicTacToeApp.grid[0][1] = 'O';
				} else if (key == KeyEvent.VK_E) {
					TicTacToeApp.grid[0][2] = 'O';
				} else if (key == KeyEvent.VK_R) {
					TicTacToeApp.grid[1][0] = 'O';
				} else if (key == KeyEvent.VK_T ) {
					TicTacToeApp.grid[1][1] = 'O';
				} else if (key == KeyEvent.VK_Y ) {
					TicTacToeApp.grid[1][2] = 'O';
				} else if (key == KeyEvent.VK_U ) {
					TicTacToeApp.grid[2][0] = 'O';
				} else if (key == KeyEvent.VK_I ) {
					TicTacToeApp.grid[2][1] = 'O';
				} else if (key == KeyEvent.VK_O ) {
					TicTacToeApp.grid[2][2] = 'O';
				}
			}
			//ticTacToeApp.displayOnBoard();
			
		}
		TicTacToeApp.getInstance().displayOnBoard();
		
		//TicTacToeApp.printGrid();	
		
		
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		TicTacToeApp.printGrid();
	
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject temp = handler.object.get(i);
			
			if (temp.getID() == ID.Player) {
				if (key == KeyEvent.VK_1) {
					TicTacToeApp.grid[0][0] = 'X';
				} else if (key == KeyEvent.VK_2 ) {
					TicTacToeApp.grid[0][1] = 'X';
				} else if (key == KeyEvent.VK_3) {
					TicTacToeApp.grid[0][2] = 'X';
				} else if (key == KeyEvent.VK_4 ) {
					TicTacToeApp.grid[1][0] = 'X';
				} else if (key == KeyEvent.VK_5 ) {
					TicTacToeApp.grid[1][1] = 'X';
				} else if (key == KeyEvent.VK_6 ) {
					TicTacToeApp.grid[1][2] = 'X';
				} else if (key == KeyEvent.VK_7 ) {
					TicTacToeApp.grid[2][0] = 'X';
				} else if (key == KeyEvent.VK_8) {
					TicTacToeApp.grid[2][1] = 'X';
				} else if (key == KeyEvent.VK_9) {
					TicTacToeApp.grid[2][2] = 'X';
				}
 
			}
			else if(temp.getID() == ID.Enemy) {
		
				if (key == KeyEvent.VK_Q ) {
					TicTacToeApp.grid[0][0] = 'O';
				} else if (key == KeyEvent.VK_W) {
					TicTacToeApp.grid[0][1] = 'O';
				} else if (key == KeyEvent.VK_E) {
					TicTacToeApp.grid[0][2] = 'O';
				} else if (key == KeyEvent.VK_R) {
					TicTacToeApp.grid[1][0] = 'O';
				} else if (key == KeyEvent.VK_T ) {
					TicTacToeApp.grid[1][1] = 'O';
				} else if (key == KeyEvent.VK_Y) {
					TicTacToeApp.grid[1][2] = 'O';
				} else if (key == KeyEvent.VK_U ) {
					TicTacToeApp.grid[2][0] = 'O';
				} else if (key == KeyEvent.VK_I ) {
					TicTacToeApp.grid[2][1] = 'O';
				} else if (key == KeyEvent.VK_O ) {
					TicTacToeApp.grid[2][2] = 'O';
				}
			}
			//ticTacToeApp.displayOnBoard();

		}
		TicTacToeApp.getInstance().displayOnBoard();
										
		
		//TicTacToeApp.printGrid();	
		
		
	}
	
}
