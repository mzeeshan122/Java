import java.awt.Graphics;

import javax.swing.JPanel;

public class main extends JPanel{
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		int width = getWidth(), height = getHeight();
		
		g.drawLine(0, 0, width, height);
		g.drawLine(0, height, width, 0);
	}

}
