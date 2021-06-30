package klausurvorbereitung2021;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class KV1 extends JFrame{
	Canvas canvas;
	
	public KV1() {
		super();
		this.setTitle("Klausurvorbereitung 1");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.canvas = new Canvas();
		this.getContentPane().add(this.canvas, BorderLayout.CENTER);
		
		this.setSize(400, 400);
		this.setLocation(200, 100);
		this.setVisible(true);
	}
	
	class Canvas extends JPanel {
		
		final static int DURCHMESSER = 2;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			
			int widthCanvas = this.getWidth();
			int heightCanvas = this.getHeight();
//			g2.drawLine(0, 0, widthCanvas, heightCanvas);
//			g2.drawLine(widthCanvas, 0, 0, heightCanvas);
			
			int x1 = 0, seite = 0, y1 = 0;
			
			if(widthCanvas < heightCanvas) {
				x1 = (int)(widthCanvas * 0.05); //1 zwanzigstel
				seite = (int)(widthCanvas * 0.9); // 90 prozent Quadrat breit
				y1 = (heightCanvas - seite) / 2;
			}
			else {
				y1 = (int)(heightCanvas * 0.05);
				seite = (int)(heightCanvas * 0.9);
				x1 = (widthCanvas - seite) / 2;
			}
			
			
			g2.setStroke(new BasicStroke(3.0f));
			g2.drawRect(x1, y1, seite, seite);
			g2.drawArc(x1, y1, seite *2, seite*2, 90, 90);
			
//			g2.fillOval(30, 40, DURCHMESSER, DURCHMESSER);
//			g2.fillOval(130, 140, DURCHMESSER, DURCHMESSER);
			Random r = new Random();
			
			int xm = x1 + seite;
			int ym = y1 + seite;
			for(int i = 0; i < 50000; i++) {
				int x = r.nextInt(seite - DURCHMESSER) + x1;
				int y = r.nextInt(seite - DURCHMESSER) + y1;
				if((x-xm) * (x - xm) + (y -ym) * (y-ym) <= seite *seite) {
					g2.setColor(Color.RED);
				}
				else {
					g2.setColor(Color.BLUE);
				}
			
				g2.fillOval(x, y, DURCHMESSER, DURCHMESSER);
			}
		}
	}
	
	public static void main(String[] args) {
		new KV1();
	}
}
