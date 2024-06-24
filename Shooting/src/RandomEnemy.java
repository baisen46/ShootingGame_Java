
public class RandomEnemy extends Enemy{
	public RandomEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=2;
	}
	public void move() {
		super.move();
		vx=Math.random()*4-2;
	}
	public void draw(MyFrame f) {
		f.setColor(59,175,117);
		f.fillRect(x-10,y,10,20);
		f.fillRect(x+10,y,10,20);	
		f.fillRect(x,y+20,10,10);
	}
}
