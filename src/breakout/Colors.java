package breakout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import javax.swing.JFrame;

import snake.SnakeRunner;
import snake.Tile;

import utilities.GDV5;

public class Colors {	
	//teal shades (dark to light)
	public static Color pastelTeal1 = new Color(0, 40, 30);
	public static Color pastelTeal2 = new Color(5, 50, 40);
	public static Color pastelTeal3 = new Color (10, 60, 50);
	public static Color pastelTeal4 = new Color (15, 70, 60);
	public static Color pastelTeal5 = new Color (20, 80, 70);
	public static Color pastelTeal6 = new Color(25, 90, 80);
	public static Color pastelTeal7 = new Color(30, 100, 90);
	public static Color pastelTeal8 = new Color(35, 110, 100);
	public static Color pastelTeal9 = new Color(40, 120, 110);
	public static Color pastelTeal10 = new Color(45, 130, 120);
	public static Color pastelTeal11 = new Color(50, 140, 130);
	public static Color pastelTeal12 = new Color(55, 150, 140);
	public static Color pastelTeal13 = new Color(60, 160, 150);
	public static Color pastelTeal14 = new Color(65, 170, 160);
	public static Color pastelTeal15 = new Color(70, 180, 170);
	public static Color pastelTeal16 = new Color(75, 190, 180);
	public static Color pastelTeal17 = new Color(80, 200, 190);
	public static Color pastelTeal18 = new Color(85, 210, 200);
	public static Color pastelTeal19 = new Color(90, 220, 210);
	public static Color pastelTeal20 = new Color(95, 230, 220);
	public static Color pastelTeal21 = new Color(100, 240, 230);
	public static Color pastelTeal22 = new Color(110, 250, 240);
	
	public static Color pastelTeals[] = {pastelTeal1, pastelTeal2, pastelTeal3, pastelTeal4, pastelTeal5, 
			pastelTeal6, pastelTeal7, pastelTeal8, pastelTeal9, pastelTeal10, pastelTeal11, pastelTeal12, pastelTeal13, pastelTeal14, pastelTeal15, pastelTeal16,
			pastelTeal17, pastelTeal18, pastelTeal19, pastelTeal20, pastelTeal21, pastelTeal22};
	public static Color pastelTeals2D[][] = {{pastelTeal1, pastelTeal2, pastelTeal3, pastelTeal4, pastelTeal5, 
		pastelTeal6, pastelTeal7, pastelTeal8, pastelTeal9, pastelTeal10, pastelTeal11, pastelTeal12, pastelTeal13, pastelTeal14, pastelTeal15, pastelTeal16,
		pastelTeal17, pastelTeal18, pastelTeal19, pastelTeal20}, {pastelTeal2, pastelTeal3, pastelTeal4, pastelTeal5, 
			pastelTeal6, pastelTeal7, pastelTeal8, pastelTeal9, pastelTeal10, pastelTeal11, pastelTeal12, pastelTeal13, pastelTeal14, pastelTeal15, pastelTeal16,
			pastelTeal17, pastelTeal18, pastelTeal19, pastelTeal20, pastelTeal21}};
	
	//blue shades	
	public static Color pastelBlue02 = new Color(0, 40, 50);
	public static Color pastelBlue01 = new Color(10, 50, 60);
	public static Color pastelBlue0 = new Color(20, 60, 70);
	public static Color pastelBlue = new Color(30, 70, 80);
	public static Color pastelBlue1 = new Color(40, 80, 90);
	public static Color pastelBlue2 = new Color(50, 90, 100);
	public static Color pastelBlue3 = new Color(60, 100, 110);
	public static Color pastelBlue4 = new Color(70, 110, 120);
	public static Color pastelBlue5 = new Color(80, 120, 130);
	public static Color pastelBlue6 = new Color(90, 130, 140);
	public static Color pastelBlue7 = new Color(100, 140, 150);
	public static Color pastelBlue8 = new Color(110, 150, 160);
	public static Color pastelBlue9 = new Color(120, 160, 170);
	public static Color pastelBlue10 = new Color(130, 170, 180);
	public static Color pastelBlue11 = new Color(140, 180, 190);
	public static Color pastelBlue12 = new Color(150, 190, 200);
	public static Color pastelBlue13 = new Color(160, 200, 210);
	public static Color pastelBlue14 = new Color(170, 210, 220);
	public static Color pastelBlue15 = new Color(180, 220, 230);
	public static Color pastelBlue16 = new Color(190, 230, 240);
	public static Color pastelBlue17 = new Color(200, 240, 250);
	
	public static Color pastelBlues[] = {pastelBlue02, pastelBlue01, pastelBlue0, pastelBlue, pastelBlue1, pastelBlue2, pastelBlue3, pastelBlue4, pastelBlue5, 
			pastelBlue6, pastelBlue7, pastelBlue8, pastelBlue9, pastelBlue10, pastelBlue11, pastelBlue11, pastelBlue12, pastelBlue13, pastelBlue14, pastelBlue15, pastelBlue16, pastelBlue17};
	
//	public static Color pastelBluesTest[] = new Color[SnakeRunner.getNumTiles()];
//	
//	public static void blueShades() {
//		for (int i = 0; i < SnakeRunner.getNumTiles(); i+=10) {
//			int r = i;
//			int g = i + 40;
//			int b = i + 50;
//			pastelBluesTest[i] = new Color(r, g, b);
//		}
//	}
	
	//light green shades
	public static Color pastelGreen0 = new Color(5, 75, 35);
	public static Color pastelGreen = new Color(20, 90, 50);
	public static Color pastelGreen1 = new Color(35, 105, 65);
	public static Color pastelGreen2 = new Color(50, 120, 80);
	public static Color pastelGreen3 = new Color(65, 135, 95);
	public static Color pastelGreen4 = new Color(80, 150, 110);
	public static Color pastelGreen5 = new Color(95, 165, 125);
	public static Color pastelGreen6 = new Color(110, 180, 140);
	public static Color pastelGreen7 = new Color(125, 195, 155);
	public static Color pastelGreen8 = new Color(140, 210, 170);
	public static Color pastelGreen9 = new Color(155, 225, 185);
	public static Color pastelGreen10 = new Color(160, 240, 200);
	
	public static Color pastelGreens[] = {pastelGreen0, pastelGreen, pastelGreen1, pastelGreen2, pastelGreen3, pastelGreen4, pastelGreen5, 
			pastelGreen6, pastelGreen7, pastelGreen8, pastelGreen9, pastelGreen10};
	
	//tan shades
	public static Color pastelTan0 = new Color(85, 75, 65);
	public static Color pastelTan = new Color(100, 90, 80);
	public static Color pastelTan1 = new Color(115, 105, 95);
	public static Color pastelTan2 = new Color(130, 120, 110);
	public static Color pastelTan3 = new Color(145, 135, 125);
	public static Color pastelTan4 = new Color(160, 150, 140);
	public static Color pastelTan5 = new Color(175, 165, 155);
	public static Color pastelTan6 = new Color(190, 180, 170);
	public static Color pastelTan7 = new Color(205, 195, 185);
	public static Color pastelTan8 = new Color(220, 210, 200);
	public static Color pastelTan9 = new Color(235, 225, 215);
	public static Color pastelTan10 = new Color(250, 240, 230);
	
	public static Color pastelTans[] = {pastelTan0, pastelTan, pastelTan1, pastelTan2, pastelTan3, pastelTan4, pastelTan5, 
			pastelTan6, pastelTan7, pastelTan8, pastelTan9, pastelTan10};
	

	public static Color colors[][] = {pastelTeals, pastelBlues, pastelGreens, pastelTans};
	
	public static Color getColorPaletteShade(int palette, int shade) {
		return colors[palette][shade];
	}
}
