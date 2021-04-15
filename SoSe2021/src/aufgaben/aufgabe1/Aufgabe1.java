package aufgaben.aufgabe1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe1 {


	public static void main(String[] args) {
		 int numberOfPlayers = 0;
	        Scanner s = new Scanner(System.in);
	        int wurf = 0;
	        int wuerfelsumme = 0;
	        String antwort;
	        int[] punkte;

	        System.out.println("How many players?");

	        while(true) {
	            numberOfPlayers = s.nextInt();
	            punkte = new int[numberOfPlayers];
	            for (int spieler = 1; spieler <= numberOfPlayers; spieler++) {
	                System.out.println("NEXT TURN: Player " + spieler);

	                wurf = (int) (Math.random() * 6 + 1);
	                wuerfelsumme += wurf;
	                System.out.print("You rolled a " + wurf + "! ");
	                System.out.println("Score: " + wuerfelsumme);

	                while (wurf < 6) {
	                    System.out.println("Roll the dice again? Press ’y’ to continue or any other key to quit.");
	                    antwort = s.next();
	                    if (antwort.equals("y") &&  wurf < 6) {
	                    	wurf = (int) (Math.random() * 6 + 1);
	                        wuerfelsumme += wurf;
	                        if (wuerfelsumme > 5) {
	                            punkte[spieler - 1] = wuerfelsumme;
	                            System.out.println("NEXT PLAYER!");
	                            break;
	                        }
	                        System.out.print("You rolled a " + wurf + "! ");
	                        System.out.println("Score: " + wuerfelsumme);

	                    } else{
	                        punkte[spieler - 1] = wuerfelsumme;
	                        System.out.println("Your final score is: " + punkte[spieler - 1]);
	                        break;
	                    }
	                }
	                wuerfelsumme = 0;
	            }
	            int gewinner = 0;
	            for (int i = 0; i < punkte.length; i++) {
	                if(punkte[i] >= 20) {
	                    if(gewinner != -1) {
	                        if(punkte[i] > punkte[gewinner]) {
	                            gewinner = i;
	                        }
	                    } else {
	                        gewinner = i;
	                    }
	                }
	            }
	            if(gewinner == -1) {
	                System.out.println("No one wins");
	            } else {
	                System.out.println("Player " + (gewinner + 1) + " has won with a score of " + punkte[gewinner]);
	            }
	            break;
	        }
	        s.close();
	}	

//		int showConfirm = JOptionPane.showConfirmDialog(null, "Do you have fun programing?");
//	        // 0=yes, 1=no, 2=cancel
//	        System.out.println(showConfirm);
//	        
//	    String showInput = JOptionPane.showInputDialog(null, "How much experience do you have with programing?");
//	    	System.out.println(showInput);
//	    	
//	    JFrame f = new JFrame();	
//	    JOptionPane.showMessageDialog(f,"Vielen Dank fuer deine Antworten!");
//	    
//	    String[] options = {"good", "bad", "okay"};
//        int x = JOptionPane.showOptionDialog(null, "How was this survey?",
//                "Click a button",
//                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
//        System.out.println(x);
	}	




