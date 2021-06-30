package vorlesung.GUI;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyFirstWindow extends JFrame {
	
	public MyFirstWindow() {
		super();
		this.setTitle("My first window");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel content = this.initContent();
	    this.getContentPane().add(content);
		//this.getContentPane().setBackground(Color.PINK);
		
		this.setSize(400, 300);
        this.setLocation(200,100);
        this.setVisible(true);
	}
	
	/*
	 * FlowLayout - alles nebeneinander, so lange es passt, sonst untereinander (Standard JPanel)
	 * GridLayout - Gitterstruktur in Zeilen und Spalten
	 * BorderLayout - Norden, Sueden, Osten, Westen, Center (Standard JFrame)
	 */

	
//	private JPanel initContent() {
//		JPanel mainPanel = new JPanel();
//
//	    // hier weitere Container oder Steuerelemente hinzufuegen
//		JLabel label = new JLabel("Name: ");
//        JTextField input = new JTextField(10);
//        JButton button = new JButton("Klick mich!");
//
//        // Steuerlement-Objekte dem Container (JPanel) hinzufuegen
//        mainPanel.add(label);
//        mainPanel.add(input);
//        mainPanel.add(button);
//        
//	    return mainPanel;
//	}
	
//	private JPanel initContent(){
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BorderLayout());
//
//        mainPanel.add(new JButton("NORTH"), BorderLayout.NORTH);
//        mainPanel.add(new JButton("SOUTH"), BorderLayout.SOUTH);
//        mainPanel.add(new JButton("EAST"), BorderLayout.EAST);
//        mainPanel.add(new JButton("WEST"), BorderLayout.WEST);
//        mainPanel.add(new JButton("CENTER"), BorderLayout.CENTER);
//
//        return mainPanel;
//    }
	
	private JPanel initContent()
    {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel oben = new JPanel();
        oben.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        oben.add(new JLabel("Name : "));
        oben.add(new JTextField(10));
        oben.setBackground(Color.LIGHT_GRAY);

        JPanel mitte = new JPanel();
        mitte.setLayout(new GridLayout(3,2, 10, 10));
        mitte.add(new JButton("Button 1"));
        mitte.add(new JButton("Button 2"));
        mitte.add(new JButton("Button 3"));
        mitte.add(new JButton("Button 4"));
        mitte.add(new JButton("Button 5"));
        mitte.add(new JButton("Button 6"));
        mitte.setBackground(Color.GREEN);

        JPanel unten = new JPanel();
        unten.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
        unten.add(new JButton("Abbruch"));
        unten.add(new JButton("OK"));
        unten.setBackground(Color.LIGHT_GRAY);

        mainPanel.add(oben, BorderLayout.NORTH);
        mainPanel.add(mitte, BorderLayout.CENTER);
        mainPanel.add(unten, BorderLayout.SOUTH);

        return mainPanel;
    }

	public static void main(String[] args) {
		new MyFirstWindow();
	}
	

}
