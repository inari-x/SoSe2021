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
		
		ttt.makeMove(1, 1, State.RED);
		ttt.printResultat();
		ttt.print();
		ttt.makeMove(1, 2, State.BLACK);
		ttt.printResultat();
		ttt.print();
		ttt.makeMove(1, -1, State.BLACK);
		ttt.printResultat();
		ttt.print();
		ttt.makeMove(0, 1, State.RED);
		ttt.printResultat();
		ttt.print();
		ttt.makeMove(2, 1, State.BLACK);
		ttt.printResultat();
		ttt.print();
		ttt.makeMove(1, 0, State.RED);
		ttt.printResultat();
		ttt.print();
		ttt.makeMove(0, 0, State.BLACK);
		ttt.printResultat();
		ttt.print();
		ttt.makeMove(0, 2, State.RED);
		ttt.printResultat();
		ttt.print();
		ttt.makeMove(2, 0, State.BLACK);
		ttt.printResultat();
		ttt.print();
		ttt.makeMove(2, 2, State.RED);
		ttt.printResultat();
		ttt.print();
		ttt.spielen();
		// ttt.makeRandomMove(State.RED);
		// ttt.print();
	
	}

}
