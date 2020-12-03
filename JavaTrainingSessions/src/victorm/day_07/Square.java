package victorm.day_07;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Square extends Shape {

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Square");
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		int x = 20;
		int y = 20;
		int w = (int) (getSize().getWidth() - 50) ;
		int h = (int) (getSize().getHeight() - 50);
		
		g2d.drawRect(x, y, w, h);
	}

}
