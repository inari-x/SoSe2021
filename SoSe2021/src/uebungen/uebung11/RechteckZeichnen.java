package uebungen.uebung11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class RechteckZeichnen extends JFrame implements MouseListener, MouseMotionListener {	
    //	Objektvariablen 
	Canvas canvas;
	Rechteck aktRechteck;
	Color aktColor;
	Map<Rechteck, Color> rechteck;
    
    public RechteckZeichnen()
    {
        super();
        this.setTitle("Rechteck zeichnen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	
	//Collection für die Rechtecke anlegen
        this.rechteck = new LinkedHashMap<>(); //hierarchisch

	//Leinwand anlegen und die Listener für Mausereignisse hinzufügen
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
            super.paintComponent(g);        
            Graphics2D g2 = (Graphics2D)g;  
            
            //aktuelles Rechteck zeichnen (falls es aktuell eins gibt) 
            if(RechteckZeichnen.this.aktRechteck != null) {
            	g2.setColor(aktColor);
				int x = RechteckZeichnen.this.aktRechteck.getX();
				int y = RechteckZeichnen.this.aktRechteck.getY();
				int width = RechteckZeichnen.this.aktRechteck.getWidth();
				int height = RechteckZeichnen.this.aktRechteck.getHeight();
				
				g2.fillRect(x, y, width, height);
            }
            
            //gespeicherte Rechtecke aus der Collection zeichnen
            for(Map.Entry<Rechteck, Color> entry : RechteckZeichnen.this.rechteck.entrySet()) {
				Rechteck r = entry.getKey();
				Color c = entry.getValue();
				
				g2.setColor(c);
            	int x = r.getX();
				int y = r.getY();
				int width = r.getWidth();
				int height = r.getHeight();
				
				g2.fillRect(x, y, width, height);
            }
        }
    }

    public static void main(String[] args) 
    {
        new RechteckZeichnen();
    }

    
	@Override
	public void mousePressed(MouseEvent e) {
		Point p = e.getPoint();
		
		//neues Rechteck erzeugen	//hoehe und breite wissen wir noch nicht
		this.aktRechteck = new Rechteck(p.x, p.y, 0, 0);
		
		//zufällige Farbe erzeugen - hatten wir letzte Woche
		Random r = new Random();
		int rot = r.nextInt(256);
		int gruen = r.nextInt(256);
		int blau = r.nextInt(256);
		
		this.aktColor = new Color(rot, gruen, blau);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = e.getPoint();
		
		//Höhe und Breite des aktuellen Rechtecks setzen
		//je nachdem ob die Maus gerade nach rechts, links, oben oder unten gezogen wird		
		if(p.x > this.aktRechteck.getX()) { //Maus nach rechts
			int width = p.x - this.aktRechteck.getX();
			this.aktRechteck.setWidth(width); //Rechteck bescheid sagen neue groesse
		}
		else { //Maus nach links
			int width = (this.aktRechteck.getX() - p.x) + this.aktRechteck.getWidth(); // ab + weil neuer Startpunkt vergeben wurde
			this.aktRechteck.setWidth(width);
			this.aktRechteck.setX(p.x);  //neuer startpunkt
		} 
		//Maus nach unten
		if(p.y > this.aktRechteck.getY()) {
			int height = p.y - this.aktRechteck.getY();
			this.aktRechteck.setHeight(height);
		}
		//Maus nach oben
		else {
			int height = (this.aktRechteck.getY() - p.y) + this.aktRechteck.getHeight(); // ab + weil neuer Startpunkt vergeben wurde
			this.aktRechteck.setHeight(height);
			this.aktRechteck.setY(p.y);
		}
		//Leinwand neu zeichnen
		this.canvas.repaint();
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		//aktuelles Rechteck speichern
		this.rechteck.put(aktRechteck, aktColor);
		
	}
	
	@Override public void mouseClicked(MouseEvent e) {}
	@Override public void mouseEntered(MouseEvent e) {}
	@Override public void mouseExited(MouseEvent e) {}
	@Override public void mouseMoved(MouseEvent e) {}
}

