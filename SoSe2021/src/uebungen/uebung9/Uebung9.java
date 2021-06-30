package uebungen.uebung9;

import javax.swing.*;
import java.util.*;
import java.util.List;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Uebung9 extends JFrame implements ActionListener {
	public JButton add;
	public JButton remove;
	public JTextField text;
	public JPanel unten;
	List<JLabel> labels = new ArrayList<>();
	
	public Uebung9() {
		super();
		this.setTitle("Elemente hinzufuegen");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 100);
		this.setLocation(300, 500);
		
		JPanel content = this.initContent();
	    this.getContentPane().add(content);
		
		this.setVisible(true);
	}
	
	public JPanel initContent() {
		JPanel mainpanel = new JPanel();
		mainpanel.setLayout(new GridLayout(2,1));
		
		JPanel oben = new JPanel();
		mainpanel.add(oben);
		oben.setLayout(new FlowLayout());
		oben.setBackground(Color.YELLOW);
		this.text = new JTextField(10);
		oben.add(text);
		
		this.add = new JButton("add");
		oben.add(this.add);
		this.add.addActionListener(this);
		
		this.remove = new JButton("remove");
		oben.add(this.remove);
		this.remove.addActionListener(this);
		
		this.unten = new JPanel();
		mainpanel.add(this.unten);
		this.unten.setBackground(Color.CYAN);
		
		
		return mainpanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	//	System.out.println("Test...");
		
		Object quelle = e.getSource(); //hat actionevent ausgeloest und wird zurueckgegeben
		if(quelle instanceof JButton) { // ist es ein JButton
			JButton button = (JButton) quelle; //welcher Button
			if(button.getText().equals("add")) {
				JLabel neu = new JLabel(this.text.getText());
				neu.setBackground(Color.RED);  //Farbe des JLabels
				neu.setOpaque(true);           //Farbe des JLabels
				System.out.println(this.text.getText());
				this.labels.add(neu);
				this.unten.add(neu);  //sieht man noch nicht
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
		new Uebung9();
	}

	

}
