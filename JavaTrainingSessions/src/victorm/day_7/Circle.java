package victorm.day_7;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape{

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Circle");
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		
		//draw an oval
		int x = 1;
		int y = 1;
		int w = (int) (getSize().getWidth() - 1) ;
		int h = (int) (getSize().getHeight() - 1);
		
		g2d.drawOval(x, y, w, h);
	}
}
