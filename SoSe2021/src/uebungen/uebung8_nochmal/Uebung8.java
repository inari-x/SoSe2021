package uebungen.uebung8_nochmal;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Uebung8 extends JFrame {
	
	public Uebung8() {
		super();
		this.setTitle("GUI Uebung");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		
		this.setSize(400, 300);
		this.setLocation(300, 500);
		this.setVisible(true);
	}
	
	private JPanel initContent() {
		JPanel mainpanel = new JPanel();
		mainpanel.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
		JLabel text1 = new JLabel("Text");
		oben.setBackground(Color.BLUE);
		text1.setForeground(Color.WHITE);
		Border redLine = BorderFactory.createLineBorder(Color.RED,2);
        oben.setBorder(redLine);
		oben.add(text1);
		
		JPanel rechts = new JPanel();
        rechts.setLayout(new GridLayout(2,1, 20, 20));
        mainpanel.add(rechts, BorderLayout.EAST);
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        rechts.add(b1);
        rechts.add(b2);
        
        //Fenster mitte
        JPanel mitte = new JPanel();
        mainpanel.add(mitte, BorderLayout.CENTER);
        mitte.setBackground(Color.GRAY);
        mitte.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        
        //Text Mitte
        JLabel text2 = new JLabel("Weiterer Text");
        text2.setLayout(new FlowLayout(FlowLayout.CENTER));
        mitte.add(text2);
        
        JTextField field = new JTextField("Feld",10);
        mitte.add(text2);
        mitte.add(field);
		
		
		mainpanel.add(oben, BorderLayout.NORTH);
		
		return mainpanel;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Uebung8();
	}

}
