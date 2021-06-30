package vorlesung.ereignisbehandlung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ereignisbehandlung extends JFrame {
	
	JLabel unten;
    Integer anzKlicks = 0;
	
	public Ereignisbehandlung() {
		super();
		this.setTitle("Ereignisbehandlung");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		
		this.setSize(200, 150);
		this.setLocation(200, 100);
		this.setVisible(true);
	}
	
	public JPanel initContent() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
        JButton minus = new JButton("-");
        JButton plus = new JButton("+");
        minus.setActionCommand("minus");
        plus.setActionCommand("plus");
        
   //   ActionHandler ah = new ActionHandler();
        minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Ereignisbehandlung.this.anzKlicks--;
				Ereignisbehandlung.this.unten.setText(Ereignisbehandlung.this.anzKlicks.toString());
			}	
        });
        
        plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Ereignisbehandlung.this.anzKlicks++;
				Ereignisbehandlung.this.unten.setText(Ereignisbehandlung.this.anzKlicks.toString());
			}
        });
        
        oben.add(minus);
        oben.add(plus);
		
		this.unten = new JLabel(this.anzKlicks.toString());
		unten.setFont(new Font("Verdana", Font.BOLD, 24));
		unten.setHorizontalAlignment(JLabel.CENTER);
		mainPanel.add(unten, BorderLayout.CENTER);
		mainPanel.add(oben, BorderLayout.NORTH);
		
		return mainPanel;
	}
	
	/*
	public class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object quelle = e.getSource();
	        if(quelle instanceof JButton )
	        {
	            JButton button = (JButton) quelle;
	            if(button.getActionCommand().equals("plus"))
	            {
	                Ereignisbehandlung.this.anzKlicks++;
	            }
	            else if(button.getActionCommand().equals("minus"))
	            {
	                Ereignisbehandlung.this.anzKlicks--;
	            }
	        }
	        Ereignisbehandlung.this.unten.setText(Ereignisbehandlung.this.anzKlicks.toString());
		}
		
	}
	
	*/
	
	public static void main(String[] args) {
		new Ereignisbehandlung();
	}

	
}
