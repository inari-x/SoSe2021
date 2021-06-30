package vorlesung.ereignisbehandlung;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Zeichnen extends JFrame {

	
	public Zeichnen() {
		super();
		this.setTitle("Wir zeichnen");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(add(new Canvas()));
		
		this.setSize(500, 500);
		this.setLocation(200, 100);
		this.setVisible(true);
	}
	
	 private class Canvas extends JPanel {
	        @Override
	        protected void paintComponent(Graphics g)
	        {
	            super.paintComponent(g);        // Implementierung von JPanel aufrufen
	            Graphics2D g2 = (Graphics2D)g;  // Methoden von Graphics2D nutzbar
	            // hier koennen wir zeichnen
	            
//	            for(int i=0; i<10; i++)
//	            {
//	                g2.drawOval(50+i*10, 50, 80, 80);
//	                g2.drawOval(50+i*10, 150, 80, 180);
//	            }
	            
//	            Shape rectangle = new Rectangle2D.Double(40.0, 30.0, 200.0, 200.0);
//	            Shape circle = new Ellipse2D.Double(40.0, 30.0, 200.0, 200.0);
//
//	            g2.draw(rectangle);
//	            g2.draw(circle);
	            
	            Shape arc1 = new Arc2D.Double(50.0, 50.0, 200.0, 200.0, 180.0, 90.0, Arc2D.OPEN);
	            Shape arc2 = new Arc2D.Double(50.0, 50.0, 200.0, 200.0, 180.0, -90.0, Arc2D.OPEN);
	            Shape arc3 = new Arc2D.Double(50.0, 50.0, 200.0, 200.0, 20.0, 45.0, Arc2D.PIE);
	            Shape arc4 = new Arc2D.Double(60.0, 63.0, 180.0, 180.0, 0.0, -180.0, Arc2D.PIE);

	            g2.setStroke(new BasicStroke(4.0f));    // dickere Linie
	            g2.draw(arc1);
	            g2.setColor(Color.RED);                 // Zeichenfarbe rot
	            g2.draw(arc2);
	            g2.setColor(Color.BLUE);                    
	            g2.draw(arc3);
	            g2.setColor(Color.GREEN);                   
	            g2.draw(arc4);

	        }

	    }

	
	public static void main(String[] args) {
		new Zeichnen();
	}

}
