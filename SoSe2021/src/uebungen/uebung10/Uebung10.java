package uebungen.uebung10;

import java.awt.*;
import java.util.Random;

import javax.swing.*;


public class Uebung10 extends JFrame{

    public Uebung10()
    {

        super();
        this.setTitle("Uebung10");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.getContentPane().add(new Canvas());
        this.setSize(400, 300);
        this.setLocation(300, 400);
        this.setVisible(true);
        //Titel, Verhalten beim Schließen ...

        //neue Leinwand (Canvas) anlegen und dem Fenster hinzufügen     

        //Größe, Location, Sichtbarkeit      

    }

    private class Canvas extends JPanel
    {
        @Override
        protected void paintComponent(Graphics g)
        {
        	
        	  super.paintComponent(g);       
              Graphics2D g2 = (Graphics2D)g;  
              
              //g2.drawRect(20, 130, 200, 100);
              
              Random r = new Random();
              int rot = r.nextInt(256);
              int gruen = r.nextInt(256);
              int blau = r.nextInt(256);
              Color c = new Color(rot, gruen, blau);
              
              int abstand = this.getHeight()/20;
              int hoehe = this.getHeight() - 2*abstand;
              int breite = this.getWidth() - 2*abstand;
              g2.setColor(c);
              
              
              if(hoehe < breite) {
            	  int abstandLinks = (this.getWidth() - hoehe)/2;
            	  g2.fillRect(abstandLinks, abstandLinks, hoehe, hoehe);
              }
              else {
            	  int abstandOben = (this.getHeight()-breite)/2;
            	  g2.setStroke(new BasicStroke(5.0f));
            	  g2.drawRect(abstand, abstandOben, breite, breite);
              }
             
              
              
            // Implementierung von JPanel aufrufen
            // Methoden von Graphics2D nutzbar machen

            //Zufällige Werte für Rot, Grün und Blau erzeugen
            //Kleine Hilfe:
            //https://www.tutorialspoint.com/java/util/random_nextint_inc_exc.htm
            //public Color(int r, int g, int b)

            //falls die Höhe des Fensters kleiner ist, als die Breite
            //Länge der Seiten an Höhe anpassen
            //Quadrat ausgefüllt

            //sonst 
            //Länge der Seiten an Breite anpassen
            //Quadrat nicht ausgefüllt, Linienstärke 5.0f 
        }           

    }

    public static void main(String[] args) 
    {
        new Uebung10();
    }

}
