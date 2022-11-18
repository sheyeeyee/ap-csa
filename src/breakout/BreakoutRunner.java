package breakout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import utilities.GDV5;

public class BreakoutRunner extends GDV5 {
	//create variable for max window sizes
	private static int winX = BreakoutRunner.getMaxWindowX();
	private static int winY = BreakoutRunner.getMaxWindowY();
	
	//set paddle parameters
	private static int pWidth = 200;
	private static int pHeight = 10;
	private static int pOffset = 8;
	
	private Brick[] bricks; //??
	
	BreakoutBall ball = new BreakoutBall(20);
	BreakoutPaddle p = new BreakoutPaddle((winX / 2 - pWidth / 2), 800 - pHeight - pOffset, pWidth, pHeight);
	
	static String ballColor = "";
	static String paddleColor = "";
	
	//colors
	private static Color pastelBlue = new Color(180, 224, 229);
	private static Color pastelTeal = new Color(72, 218, 188);
	private static Color pastelLightGreen = new Color(171, 232, 219);
	private static Color pastelTan = new Color(229, 209, 180);
	private static Color pastelTan2 = new Color(186, 170, 146);
	
	public BreakoutRunner() {
		super();
		bricks = Brick.makeBricks();
	}
	
	public static void main(String[] args) {
		BreakoutRunner runner = new BreakoutRunner();
		runner.start();
	}

	//bc of this, no loops needed since these are being called continuously
	@Override
	public void update() { //60 fps, driver called 60 times per second
		ball.move();
		p.paddleMove();
	}

	@Override
	public void draw(Graphics2D win) { //at the processor speed (~3000 fps, called 3000 times per second)
		//bricks
		for (Brick b:bricks) {
			b.draw(win);
		}
		
		//ball
		win.setColor(pastelTan);
		win.fillOval((int) ball.getX(), (int) ball.getY(), (int) ball.getWidth(), (int) ball.getHeight());
		
		//paddle
		win.setColor(pastelTan2);
		win.fillRect((int) p.getX(), (int) p.getY(), (int) p.getWidth(), (int) p.getHeight());
	}
}
