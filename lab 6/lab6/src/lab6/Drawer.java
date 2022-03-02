package lab6;
import acm.program.*;
import java.awt.event.*;
import acm.graphics.*;

public class Drawer extends GraphicsProgram {
	public GLine zuraas;
	public void mousePressed(MouseEvent MouseObject){
		double x = MouseObject.getX();
		double y = MouseObject.getY();
		zuraas = new GLine(x, y, x ,y);
		add(zuraas);
	}
	public void mouseDragged(MouseEvent MouseObject){
		double x = MouseObject.getX();
		double y = MouseObject.getY();
		zuraas.setEndPoint(x, y);
	}
	public void run(){
			addMouseListeners();
	}
}
