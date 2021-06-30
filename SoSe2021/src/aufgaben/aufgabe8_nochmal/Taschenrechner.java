package aufgaben.aufgabe8_nochmal;

import javax.swing.*;

import java.awt.*;
import java.util.*;

public class Taschenrechner extends JFrame {
	
	public Taschenrechner() {
		super();
		this.setTitle("Taschenrechner");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		
		this.setSize(250, 350);
		this.setLocation(500, 200);
		this.setVisible(true);
	}
	
	public JPanel initContent() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
		oben.setLayout(new FlowLayout());
		JTextField tf = new JTextField(8);
		tf.setFont(new Font("Verdana", Font.PLAIN, 24));
		tf.setHorizontalAlignment(JTextField.RIGHT);
		oben.add(tf);
		
		JPanel unten = new JPanel();
		unten.setLayout(new GridLayout(6,3, 10, 10));
		JButton b[] = new JButton[9];
		for(int i = 0; i < 9; i++) {
			b[i] = new JButton(i+1+"");
			unten.add(b[i]);
		}
		
		JButton b0 = new JButton("0");
		JButton bMal = new JButton("*");
		JButton bDurch = new JButton("/");
		JButton bPlus = new JButton("+");
		JButton bMinus = new JButton("-");
		JButton bKlauf = new JButton("(");
		JButton bKlzu = new JButton(")");
		JButton bKomma = new JButton(".");
		JButton bC = new JButton("C");
		JButton bCE = new JButton("CE");
		JButton bErg = new JButton("=");

		unten.add(bKlauf);		
		unten.add(b0);
		unten.add(bKlzu);		
		unten.add(bMal);
		unten.add(bDurch);
		unten.add(bPlus);
		unten.add(bMinus);
		unten.add(bKomma);
		unten.add(bErg);
		
		mainPanel.add(oben, BorderLayout.NORTH);
		mainPanel.add(unten, BorderLayout.CENTER);
		
		
		return mainPanel;
	}
	

	public static void main(String[] args) {
		new Taschenrechner();

	}

}
