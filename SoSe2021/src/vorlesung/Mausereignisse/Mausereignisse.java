package vorlesung.Mausereignisse;

import java.awt.Graphics;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mausereignisse extends JFrame implements MouseListener, MouseMotionListener {
	Canvas canvas;
	
	public Mausereignisse()
    {
        super();
        this.setTitle("Mausereignisse");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        this.canvas = new Canvas();
        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);
        this.getContentPane().add(this.canvas);

        this.setSize(400, 300);
        this.setLocation(300,200);
        this.setVisible(true);
    }

    private class Canvas extends JPanel
    {
        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);        // Implementierung von JPanel aufrufen
            Graphics2D g2 = (Graphics2D)g;  // Methoden von Graphics2D nutzbar
            // hier koennen wir zeichnen
        }
    }
    
    public static void main(String[] args) 
    {
        new Mausereignisse();
    }
    
    @Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("mouseClicked");
    	Point p = e.getPoint();
    	int x = e.getX();
    	int y = e.getY();
    	System.out.println("mouseClicked bei [x=" + p.x + ",y=" + p.y + "]");
    	System.out.println("mouseClicked bei [x=" + x +" ,y=" + y + "]");
    	
    	 if(e.isAltDown()) System.out.println("Alt-Taste gedrueckt");
         if(e.isAltGraphDown()) System.out.println("AltGraph-Taste gedrueckt");
         if(e.isControlDown()) System.out.println("Ctrl-Taste gedrueckt");
         if(e.isMetaDown()) System.out.println("Meta-Taste gedrueckt");
         if(e.isShiftDown()) System.out.println("Shift-Taste gedrueckt");
         
         if(e.getClickCount() == 2) System.out.println("Doppelklick");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseExited");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseReleased");
	}
   

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseDragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
//		System.out.println("mouseMoved");
		Point p = e.getPoint();
		System.out.println("mouseMoved bei [x=" + p.x +" ,y=" + p.y + "]");
	}

	
}

