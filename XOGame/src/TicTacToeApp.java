import java.util.Scanner;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class TicTacToeApp extends Canvas implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2229404510287813480L;
	public static final int WIDTH = 640, HEIGHT = 640;/*WIDTH/12 * 9;*/
	private Thread thread;
	private boolean running = false;
	private Handler handler;
	
	private BufferStrategy bs = this.getBufferStrategy();
	public static boolean ex = false;
	public static int turn = 0;
	//private Graphics g = bs.getDrawGraphics();
	
	//public variables 
	public static Scanner s = new Scanner(System.in);
	public static char[][] grid =new char[3][3];
	public static TicTacToeApp tObj = null;
	
	public TicTacToeApp() {
		handler = new Handler();
		if (turn%2 == 0) {
			this.addKeyListener(new KeyInput(handler, true));
		} else {
			this.addKeyListener(new KeyInput(handler, false));
		}
		turn++;
		new GameClass(WIDTH, HEIGHT, "TicTacToe", this);
		handler.addObject(new Player(0,0,ID.Player, Color.white, false));
		handler.addObject(new Computer(0,0,ID.Enemy, Color.white, false));
		System.out.println(turn+ "turn");
		if  (tObj != null) throw new RuntimeException("alr created yuh");
		tObj = this;

	}
	
	public static TicTacToeApp getInstance() {
		return tObj;
	}
	

	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000/amountOfTicks;
		double delta = 0;
			long timer = System.currentTimeMillis();
			int frames = 0;
			while (running) {
				displayOnBoard();
				long now = System.nanoTime();
			delta += (now - lastTime)/ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (running) {
				render();
			}
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				//System.out.println("FPS: "+frames);
				frames = 0;
			}
		}
		stop();
	}
	
	private void tick() { //winX is called here
		if (winX()) {
			handler.addObject(new Player(0,0,ID.Player, Color.blue, true));
			//stop();
		} else if (winO()) {
			handler.addObject(new Computer(0,0,ID.Enemy, Color.green, true));
			//stop();
		}
		handler.tick(); 
	}
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.blue);
		for (int i =1; i <= 3; i++) {
			g.fillRect(WIDTH/3*i, 0, 10, HEIGHT);
			g.fillRect(0, HEIGHT/3*i, WIDTH,10);
		}
		
		handler.render(g);
		g.dispose();
		bs.show();
	}
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
		//setGrid();
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayOnBoard() {


		for (int i =0; i <  3; i++) {
			for (int j =0; j < 3; j++) {
				
				if(grid[i][j] == 'X') {
					
					handler.addObject(new Player((WIDTH*j/3)+j,(HEIGHT*i/3)+i,ID.Player, Color.blue, false));
				} 
				else if (grid[i][j] == 'O') {
					handler.addObject(new Computer((WIDTH*j/3)+j,(HEIGHT*i/3)+i,ID.Enemy, Color.green, false));
				}
			}
		}
	}
	
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
	
	public static void main (String[] arg) {
		//setGrid();
		new TicTacToeApp();
		//TicTacToeApp.getInstance();
		setGrid();
		
	}
	
	public  boolean  winX() {
		boolean won = false;
		for (int i =0; i < 3; i++) {
			if ( (checkHor('X', i, 0) || checkVer('X',0,i) || checkDiag('X')) ) {
				//handler.addObject(new Player(WIDTH,HEIGHT,ID.Player, Color.blue));
				won = true;
				break;
			}
		}
		return won;
	}
	
	public  boolean winO() {
		boolean won = false;
		for (int i =0; i < 3; i++) {
			if ((checkHor('O', i, 0)|| checkVer('O',0,i) || checkDiag('O'))) {
				//handler.addObject(new Computer(WIDTH,HEIGHT,ID.Enemy, Color.green));
				won = true;
				break;
			}
		}
		return won;
	}
	
	//checks horizontal for win
	public static boolean checkHor( char x, int i, int j) {
		if(grid[i][j] == x) {
			if (j == 2) {
				return true;
			} else {
				return checkHor(x,i,j+1);
			}
		} 
		return false;
	}
	
	//checks vertical for win
	public static boolean checkVer(char x, int i, int j) {
		if(grid[i][j] == x) {
			if (i == 2) {
				return true;
			} else {
				return checkVer(x,i+1,j);
			}
		} 
		return false;
	}
	
	//checks diagonal for win
	public static boolean checkDiag(char x) {
		boolean found = false;
		for (int i = 0; i < 3; i++) {
			if (grid[i][i] == x || grid[i][2-i] == x) {
				if (i == 2) {
					found = true;
				}
			} else {
				break;
			}
		}
		return found;
	}

	public static void setGrid () {
		if (ex == false) {
			ex  = true;
			for (int i = 0; i < grid[0].length; i++) {
				for (int j = 0; j < grid[0].length; j++) {
					grid[i][j] =' ';
				}
			}
		}
	}
}
