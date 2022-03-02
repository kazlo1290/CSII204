package lab6;
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
public class ursdagText extends GraphicsProgram{
	public void run(){
		int n = 1000;
//		double dx = (getWidth()) / n;
//		double dy = (getHeight()) / n;
		GLabel HodoldogText = new GLabel("I'm student + I study PAZ . . .", 100, 100);
		HodoldogText.setFont("Times New Roman-72");
		add(HodoldogText);
		while(true){
			HodoldogText.move(1, 0);
			pause(20);
		}
//		for(int i=0; i<n; i++){
//			HodoldogText.move(1, 0);
//			pause(20);
//		}
	}
}
