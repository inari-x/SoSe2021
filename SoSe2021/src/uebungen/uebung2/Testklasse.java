package uebungen.uebung2;

import java.lang.Enum;

import uebungen.uebung2.TicTacToe.State;
import java.util.Random;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		TicTacToe playingField = new TicTacToe();
		
		// playingField.print();
		Random r = new Random();
		// while 
		// auto increment a variable which counts from 0
		// 0 / evens = red -> use modulo to calculate if odd or even
		// odds = black
		playingField.makeMove(r.nextInt(3), r.nextInt(3), State.RED);
		playingField.makeMove(r.nextInt(3), r.nextInt(3), State.BLACK);
		// fake game simulation
		
		//
		playingField.print();
			
		
	}

}
