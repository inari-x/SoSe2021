package vorlesung.Mausereignisse;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KreiseZeichnen extends JFrame implements MouseListener {
	
	Canvas canvas;
	List<Point> points;
	
	    public KreiseZeichnen()
	    {
	        super();
	        this.setTitle("Kreise zeichnen");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	        
	        this.points = new ArrayList<>();
	        this.canvas = new Canvas();
	        this.canvas.addMouseListener(this);
	        this.getContentPane().add(this.canvas);

	        this.setSize(400, 300);
	        this.setLocation(300,200);
	        this.setVisible(true);
	    }

	    private class Canvas extends JPanel
	    {
	    	final static int DURCHMESSER = 20;
	        // die View
	        @Override
	        protected void paintComponent(Graphics g)
	        {
	            super.paintComponent(g);        
	            Graphics2D g2 = (Graphics2D)g;  
	            // hier koennen wir zeichnen
	            
	            for(Point p : KreiseZeichnen.this.points) {
	            	g2.fillOval(p.x, p.y, DURCHMESSER, DURCHMESSER);
	            }
	        }
	    }

	    public static void main(String[] args) 
	    {
	        new KreiseZeichnen();
	    }

	    // der Controller
	    @Override
	    public void mouseClicked(MouseEvent e) {
	        Point p = e.getPoint();
	        System.out.println("mouseClicked bei [x=" + p.x +" ,y=" + p.y + "]");  
	        this.points.add(p);
	        
	        this.canvas.repaint();
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {}

	    @Override
	    public void mouseReleased(MouseEvent e) {}

	    @Override
	    public void mouseEntered(MouseEvent e) {}

	    @Override
	    public void mouseExited(MouseEvent e) {}

}

