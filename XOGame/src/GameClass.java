import java.awt.*;
import javax.swing.JFrame;

public class GameClass extends Canvas{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4852111642960020147L;


	
	public GameClass (int width, int height, String title, TicTacToeApp ticTacToeApp) {
		JFrame frame = new JFrame(title);
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(ticTacToeApp);
		frame.setVisible(true);
		
		
		ticTacToeApp.start();	
	}
}