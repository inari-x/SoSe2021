 package uebungen.uebung2;

import java.util.Random;

public class TicTacToe {
	enum State {EMPTY, RED, BLACK}; //Aufzaehlung
    State[][] field;	//mehrdimensionales Array

    public TicTacToe() {
        field = new State[3][3];  //deklarierung von Mehrdimensionalem Feld
        for(int i=0; i<field.length; i++) {  // Loop durch Feld1
          for(int j=0; j<field[i].length; j++) { // Loop durch Feld2
            field[i][j]=State.EMPTY;  //Index von Feldern leer (solange)
          }
        }
    }

    boolean makeMove(int i, int j, State player) {
    	if(0<=i && j<this.field.length && 
    			0<=i && j<this.field[i].length && 
    			player!=State.EMPTY)
    		{
    			if(this.field[i][j]==State.EMPTY)
    			{
    				this.field[i][j]=player;
    				return true;
    			}
    		}
    		return false;
    	}
 

    public void print() {
        for(int i=0; i<field.length; i++) {  // Loop durch Feld1
            for(int j=0; j<field[i].length; j++) { // Loop durch Feld2
            	if(this.field[i][j]==State.EMPTY) {
            		System.out.print(" -");
            	}
            	else if(this.field[i][j]==State.RED) {
            		System.out.print(" x");
            	}
            	else if(this.field[i][j]==State.BLACK) {
            		System.out.print(" o");
            	}
            }
            System.out.println();
        }
        System.out.println();
    }
    
    boolean gewonnen(State player) {
    	if(player==State.EMPTY) return false;
    	for(int i = 0; i < this.field.length; i++) {
    		if(this.field[i][0]==player && this.field[i][1] == player && this.field[i][2]==player) {
    			return true;
    		}
    	}
    	for(int j = 0; j < this.field.length; j++) {
    		if(this.field[j][0]==player && this.field[j][1] == player && this.field[j][2]==player) {
    			return true;
    		}
    	}
    	if(this.field[2][0] == player && this.field[1][1] == player && this.field[0][2] == player) {
    		return true;
    	}
    	return false;
    }
    
    public void printResultat()
	{
		if(this.gewonnen(State.RED))
		{
			System.out.println("Rot hat gewonnen!!!");
		}
		else if(this.gewonnen(State.BLACK))
		{
			System.out.println("Schwarz hat gewonnen!!!");
		}
		else if(this.unentschieden())
		{
			System.out.println("Unentschieden!!!");
		}
	}
	
	public void makeRandomMove(State player)
	{
		if(player != State.EMPTY)
		{
			Random r = new Random();
			int row = r.nextInt(3);
			int col = r.nextInt(3);
			while(this.field[row][col]!=State.EMPTY)
			{
				row = r.nextInt(3);
				col = r.nextInt(3);
			}
			this.field[row][col]=player;
		}
	}
	
	public void spielen()
	{
		State player = State.RED;
		while(!(this.unentschieden() || this.gewonnen(State.RED) || this.gewonnen(State.BLACK)))
		{
			this.makeRandomMove(player);
			this.print();
			this.printResultat();
			if(player == State.RED)
			{
				player = State.BLACK;
			}
			else
			{
				player = State.RED;
			}
			
			// player = (player == State.RED) ? State.BLACK : State.RED;
		}
	}
    
    boolean gewonnen() {
    	return (gewonnen(State.BLACK) || gewonnen(State.RED));
    }
    
    boolean voll() {
    	for(int i = 0; i < this.field.length; i++) {
    		for(int j = 0; j < this.field.length; j++) {
    			if(this.field[i][j]==State.EMPTY) return false;
    		}
    	}
    	return true;
    }
    
    boolean unentschieden() {
    	return(this.voll() && !this.gewonnen());
    }
}
 