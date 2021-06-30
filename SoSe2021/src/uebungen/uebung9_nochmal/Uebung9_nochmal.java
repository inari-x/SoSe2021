package uebungen.uebung9_nochmal;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Uebung9_nochmal extends JFrame implements ActionListener{
	
	public JButton add;
	public JButton remove;
	public JTextField text;
	public JPanel unten;
	List<JLabel> labels = new ArrayList<>();
	
	public Uebung9_nochmal() {
		super();
		this.setTitle("Elemente hinzufuegen");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		
		this.setSize(400, 100);
		this.setLocation(500, 700);
		this.setVisible(true);
	}
	
	public JPanel initContent() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2,1));
		
		JPanel oben = new JPanel();
		text = new JTextField(10);
		add = new JButton("add");
		this.add.addActionListener(this);
		remove = new JButton("remove");
		this.remove.addActionListener(this);
		oben.add(text);
		oben.add(add);
		oben.add(remove);
		oben.setBackground(Color.YELLOW);
		
		mainPanel.add(oben);
		
		
		unten = new JPanel();
		unten.setBackground(Color.CYAN);
		
		mainPanel.add(unten);
		
		return mainPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object quelle = e.getSource();
		if(quelle instanceof JButton) {
			JButton button = (JButton)quelle;
			if(button.getText().equals("add")) {
				JLabel neu = new JLabel(this.text.getText());
				neu.setBackground(Color.RED);
				neu.setOpaque(true);
				System.out.println(this.text.getText());
				this.labels.add(neu);
				this.unten.add(neu);
			}
			else if(button.getText().equals("remove")) {
				String inputText = this.text.getText();
				Iterator<JLabel> it = this.labels.iterator();
				while(it.hasNext())
				{
					JLabel aktLabel = it.next();
					if(aktLabel.getText().equals(inputText))
					{
						it.remove();
						this.unten.remove(aktLabel);
					}
				}
			}
			this.unten.revalidate();//jetzt sieht man das
			this.unten.repaint();   //jetzt sieht man das
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Uebung9_nochmal();
	}


}
