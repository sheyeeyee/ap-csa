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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit;

import breakout.BreakoutBall;
import breakout.Brick;
import breakout.Colors;
import breakout.Pages;
import breakout.PowerUp;
import pong.Score;
import snake.SnakeRunner;
import utilities.GDV5;

public class Yummy extends Rectangle {
	//IDEA: if the snake eats smth, then have the next thing slide in ("fall") from the top rather than spawning, have the start and stop place of it be random but it only goes straight downward to the stop place
	private int fStartX, fStartY;
	
	
	public Yummy(int x, int y) {
		super(x, y, 0, 0);
		this.setSize(Tile.getTileSize(), Tile.getTileSize());
	}
	
	
	public void spawn() {
		fStartX = (int) (Math.random() * SnakeRunner.getColumns());
	}
}