package lab6;
import acm.program.*;

import java.awt.Color;

import acm.graphics.*;
public class DrawDurs extends GraphicsProgram{
	public void run(){
		GLabel name = new GLabel("T.Bilguun", 40, 40);
		name.setFont("SanSerif-Italic-25");
		name.setColor(Color.ORANGE);
		add(name);
		GOval oval = new GOval(100, 60, 200, 100);
		GRect rect = new GRect(100, 180, 200, 100);
		rect.setFilled(true);
		rect.setFillColor(Color.BLUE);
		oval.setFilled(true);
		oval.setFillColor(Color.RED);
		add(rect);
		add(oval);
	}
}
