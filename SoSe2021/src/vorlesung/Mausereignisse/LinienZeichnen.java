package vorlesung.Mausereignisse;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinienZeichnen extends JFrame implements MouseListener, MouseMotionListener {
    Canvas canvas;
    Linie aktLinie;
    List<Linie> linien;

    public LinienZeichnen()
    {
        super();
        this.setTitle("Linien zeichnen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        
        this.linien = new ArrayList<>();
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
        // die View
        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);        
            Graphics2D g2 = (Graphics2D)g;  
            
            if(LinienZeichnen.this.aktLinie != null) {
            	int x1 = LinienZeichnen.this.aktLinie.getXstart();
            	int y1 = LinienZeichnen.this.aktLinie.getYstart();
                int x2 = LinienZeichnen.this.aktLinie.getXende();
                int y2 = LinienZeichnen.this.aktLinie.getYende();

                g2.drawLine(x1, y1, x2, y2);
            }
            //speichern der Linie
            for(Linie l : LinienZeichnen.this.linien) {
            	int x1 = l.getXstart();
                int y1 = l.getYstart();
                int x2 = l.getXende();
                int y2 = l.getYende();

                g2.drawLine(x1, y1, x2, y2);
            }

        }
    }

    public static void main(String[] args) 
    {
        new LinienZeichnen();
    }

    // der Controller
    @Override
    public void mousePressed(MouseEvent e) {
        Point p = e.getPoint();
        this.aktLinie = new Linie(p,p);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point p = e.getPoint();
        this.aktLinie.setEnde(p);
        
        this.canvas.repaint();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Point p = e.getPoint();
        this.linien.add(aktLinie);
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void mouseMoved(MouseEvent e) {}
}
