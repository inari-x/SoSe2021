package uebungen.uebung2;

import java.lang.Enum;

import java.util.Random;

import uebungen.uebung2.TicTacToe.State;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		TicTacToe ttt = new TicTacToe();
		ttt.print();
		ttt.makeMove(1, 2, State.RED);
		ttt.print();
		ttt.makeMove(-4711, 12345, State.EMPTY);
	
	}

}
