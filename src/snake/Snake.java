package snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit;

import pong.Score;
import breakout.BreakoutRunner;
import breakout.Brick;
import breakout.Colors;
import utilities.GDV5;

public class Snake extends Rectangle {
	//create variable for max window sizes
	private static int winX = GDV5.getMaxWindowX();
	private static int winY = GDV5.getMaxWindowY();
	
	private static int sVx, sVy;
	
	private int colShade = 5;
	
	ArrayList<Tile> body;
	
//	private static int sWidth = Tile.getTileSize();
//	private static int sHeight;
	
	public Snake(int size) {
		body = new ArrayList<Tile>();
		body.add(new Tile(winX / 2 - (2 * Tile.getTileSize()), winY / 2, Colors.pastelTans[colShade]));
//		body.get(0).setDirection(1);
		addBody(size - 1, body.get(0).getDirection()); //subtract 1 because we already have the head on it so we just need the rest
	}
	
	public void addBody(int size) {
		int x = (int) body.get(0).getX(); //getting x position of head
		int y = (int) body.get(0).getY(); //getting y position of head
		
		for (int i = 0; i < size; i++) {
			body.add(new Tile(x + body.get(0).getDimension(), y, Colors.pastelTans[colShade + 1]));
			x += body.get(0).getDimension();
			colShade++;
		}
	}
	
	//addBody method with direction
	public void addBody(int size, int direction) {
		int colShade = 5;
		int x = (int) body.get(0).getX(); //getting x position of head
		int y = (int) body.get(0).getY(); //getting y position of head
		
		for (int i = 0; i < size; i++) {
			body.add(new Tile(x + body.get(0).getDimension(), y, direction, Colors.pastelTans[colShade + 1]));
			x += body.get(0).getDimension();
			colShade++;
		}
	}
	
	public void updateBodyDirection(Tile[] board) {
		//"this" refers to the snake's head
		for (int i = 0; i < board.length; i++) { //iterate thru board
			for (int j = 1; j < body.size(); j++) { //iterate thru body
				//the head is on that specific tile
				if (body.get(j).getX() == board[i].getX() && body.get(j).getY() == board[i].getY()) {
					body.get(j).setDirection(board[i].getDirection()); //get that part of the body to pick up the direction of the tile that was set by the head
					System.out.println(board[i].getDirection() + " : " + body.get(j).getDirection());
				}
			}
		}
	}
	
	public void moveSnake() {
		for (Tile t : body) {
			t.move();
		}
	}
	
	public void draw(Graphics2D pb) {
		for (Tile t : body) {
			t.fill(pb);
		}
	}
	
	public void resetSnakePosition() {
		this.translate(0, 0);
	}
}