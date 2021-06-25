package aufgaben.aufgabe8;

import javax.swing.*;
import java.awt.*;

public class Taschenrechner extends JFrame{
	
	public Taschenrechner() {
		super();
		this.setTitle("Taschenrechner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setLocation(300,200);
        
        JPanel content = this.initContent();
        this.getContentPane().add(content);
        
        this.setVisible(true);
	}
	
	private JPanel initContent() {
		
		JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        //NORTH
        JPanel north = new JPanel();
        mainPanel.add(north, BorderLayout.NORTH);
        JTextField field = new JTextField(17);
        field.setHorizontalAlignment(JTextField.RIGHT);
        north.add(field);
        
        //EAST
        JPanel east = new JPanel();
        mainPanel.add(east, BorderLayout.EAST);
        east.setLayout(new GridLayout(6, 1, 5, 5));
        JButton zahl3 = new JButton("3");
        east.add(zahl3);
        
        JButton zahl6 = new JButton("6");
        east.add(zahl6);
        
        JButton zahl9 = new JButton("9");
        east.add(zahl9);
        
        JButton klammer = new JButton(")");
        east.add(klammer);
        
        JButton plus = new JButton("+");
        east.add(plus);
        
        JButton gleich = new JButton("=");
        east.add(gleich);
        
        //CENTER
        JPanel center = new JPanel();
        mainPanel.add(center, BorderLayout.CENTER);
        center.setLayout(new GridLayout(6, 1, 5, 5));
        JButton zahl2 = new JButton("2");
        center.add(zahl2);
        
        JButton zahl5 = new JButton("5");
        center.add(zahl5);
        
        JButton zahl8 = new JButton("8");
        center.add(zahl8);
        
        JButton zahl0 = new JButton("0");
        center.add(zahl0);
        
        JButton geteilt = new JButton("/");
        center.add(geteilt);
        
        JButton punkt = new JButton(".");
        center.add(punkt);
        
        //WEST
        JPanel west = new JPanel();
        mainPanel.add(west, BorderLayout.WEST);
        west.setLayout(new GridLayout(6, 1, 5, 5));
        JButton zahl1 = new JButton("1");
        west.add(zahl1);
        
        JButton zahl4 = new JButton("4");
        west.add(zahl4);
        
        JButton zahl7 = new JButton("7");
        west.add(zahl7);
        
        JButton klammer2 = new JButton("(");
        west.add(klammer2);
        
        JButton mal = new JButton("*");
        west.add(mal);
        
        JButton minus = new JButton("-");
        west.add(minus);
        
        return mainPanel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Taschenrechner();
	}

}
