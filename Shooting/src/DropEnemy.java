
public class DropEnemy extends Enemy {
	public DropEnemy(double x, double y, double vx, double vy) {
		super(x,y,vx,vy);
		life=1;
	}
	public void move() {
		super.move();
		vy=vy+0.1;
	}
	public void draw(MyFrame f) {
		f.setColor(59,175,117);
		f.fillRect(x,y,30,10);
		f.fillRect(x+10,y+10,10,20);
		
	}
	
	

}
