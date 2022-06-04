import java.awt.Color;
import java.awt.Graphics;

public abstract class GameObject {

	protected int x,y;
	protected ID id;
	protected Color color;
	protected boolean won;
	
	public GameObject(int x, int y, ID id, Color color, boolean won) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.color = color;
		this.won = won;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g, boolean won);
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setID(ID id) {
		this.id = id;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public ID getID() {
		return id;
	}
	
	public Color getColor() {
		return color;
	}
	public boolean getWon() {
		return won;
	}
}
