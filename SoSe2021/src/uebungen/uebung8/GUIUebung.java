package uebungen.uebung8;

import java.awt.BorderLayout;
//import
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.*;

public class GUIUebung extends JFrame {

	public GUIUebung() {
		super();
		this.setTitle("GUI Uebung");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
//		this.pack();
        this.setLocation(500,350);
        
        JPanel content = this.initContent();
	    this.getContentPane().add(content);
       
        this.setVisible(true);
	}

	private JPanel initContent() {
		//Panel mit Layout
		JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        //Panel Oben und Hintergrund
        JPanel oben = new JPanel();
        JLabel text1 = new JLabel("Text");
        oben.setBackground(Color.BLUE);
        oben.add(text1);
        text1.setForeground(Color.WHITE);
        mainPanel.add(oben, BorderLayout.NORTH);
        
        //Rahmen
        Border redLine = BorderFactory.createLineBorder(Color.RED,2);
        oben.setBorder(redLine);
        
        
        JPanel rechts = new JPanel();
        rechts.setLayout(new GridLayout(2,1, 20, 20));
        mainPanel.add(rechts, BorderLayout.EAST);
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        rechts.add(b1);
        rechts.add(b2);
        
        //Fenster mitte
        JPanel mitte = new JPanel();
        mainPanel.add(mitte, BorderLayout.CENTER);
        mitte.setBackground(Color.GRAY);
        mitte.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        
        //Text Mitte
        JLabel text2 = new JLabel("Weiterer Text");
        text2.setLayout(new FlowLayout(FlowLayout.CENTER));
        mitte.add(text2);
        
        JTextField field = new JTextField("Feld",10);
        mitte.add(text2);
        mitte.add(field);
       

        return mainPanel;
	}

	public static void main(String[] args) {
		new GUIUebung();
	}

}
