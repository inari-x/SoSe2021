package uebungen.uebung2;

import uebungen.uebung2.TicTacToe.State;

public class TicTacToe_nochmal {
	
	    enum State {EMPTY, RED, BLACK};
	    State[][] field;

	    public TicTacToe_nochmal() {
	       field = new State[3][3];
	        for(int i=0; i<field.length; i++) {
	          for(int j=0; j<field[i].length; j++) {
	            field[i][j]=State.EMPTY;
	          }
	        }
	    }

	    public void makeMove(int i, int j, State player) {
	        if(field[i][j]==State.EMPTY && player!=State.EMPTY) { 
	            field[i][j]=player;
	        }
	    }
	    
	    public void print() {
	    	for (int i = 0; i < field.length; i++) {
	    		for (int j = 0; j < field[i].length; j++) {
					if(this.field[i][j] == State.EMPTY) {
						System.out.print(" -");
					}
					else if(this.field[i][j] == State.BLACK) {
						System.out.print(" o");
					}
					else if(this.field[i][j] == State.RED) {
						System.out.print(" x");
					}
				}
	    		System.out.println();
			}
	    	System.out.println();
	    }
	    
	    boolean gewonnen(State player) {
	    	if(player==State.EMPTY) return false;
	    	for (int i = 0; i < this.field.length; i++) {
	    		if(this.field[i][0]==player && this.field[i][1]==player && this.field[i][2]==player) {
	    			return true;
	    		}
			}
	    	for (int j = 0; j < this.field.length; j++) {
				if(this.field[j][0]==player && this.field[j][1]==player && this.field[j][2]==player) {
	    			return true;
				}
			}
	    	if(this.field[2][0]==player && this.field[1][1]==player && this.field[0][2]==player) {
	    		return true;
			}
	    	return false;
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
	 
