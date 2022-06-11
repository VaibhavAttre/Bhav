import java.awt.Color;
import java.awt.Graphics;


public class Computer extends GameObject{

	public Computer(int x, int y, ID id, Color c, boolean won) {
		super(x, y, id, c, won);
		// TODO Auto-generated constructor stub
	}

	public void tick() {
		// TODO Auto-generated method stub
		// random 
	}

	public void render(Graphics g, boolean won) {
		// TODO Auto-generated method stub
		//System.out.println("X thing");
		g.setColor(getColor());
		if (!won) {
			g.fillRect(x, y, 150, 150);		
		} else {
			g.fillRect(x, y, 640, 640);
		}
	 	
		
	}
}
