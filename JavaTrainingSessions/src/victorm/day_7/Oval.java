package victorm.day_7;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval extends Shape {

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing an Oval");
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		int x = 0;
		int y = 0;
		int w = (int) (getSize().getWidth() - 100) ;
		int h = (int) (getSize().getHeight() - 1);
		
		g2d.drawOval(x, y, w, h);
	}

}
