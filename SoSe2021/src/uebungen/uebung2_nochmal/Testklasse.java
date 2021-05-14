package uebungen.uebung2_nochmal;

import uebungen.uebung2_nochmal.TicTacToe.State;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe ttt = new TicTacToe();
		ttt.print();
		ttt.makeMove(0, 2, State.RED);
		ttt.print();
		ttt.makeMove(1, 1, State.BLACK);
		ttt.print();
		ttt.makeMove(2, 2, State.RED);
		ttt.print();
		ttt.makeMove(1, 2, State.BLACK);
		ttt.print();
		
		
	
	}

}
