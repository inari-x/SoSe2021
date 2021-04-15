package uebungen.uebung2;

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

    public void makeMove(int i, int j, State player) {
        if(field[i][j]==State.EMPTY && player!=State.EMPTY) {  
            field[i][j]=player; 
        }
    }

    public void print() {
    	
    		
        for(int i=0; i<field.length; i++) {  // Loop durch Feld1
            for(int j=0; j<field[i].length; j++) { // Loop durch Feld2
              // System.out.print( "[" + field[i][j] + "]" );  //Index von Feldern leer (solange)
            	switch(field[i][j]) {
	        		case EMPTY: System.out.print("[-]"); break;
	        		case RED:   System.out.print("[x]"); break;
	        		case BLACK: System.out.print("[o]"); break;
            	}
            	
            	//System.out.println();
              
            	// System.out.print( "[" + field[i][j] + "]" );  //Index von Feldern leer (solange)
            }
            System.out.println();
        
    	}
    }
    
//    public void print() {
//    	State s = State.EMPTY;
//    	switch(s) {
//    		case EMPTY: System.out.println("-"); break;
//    		case RED:   System.out.println("x"); break;
//    		case BLACK: System.out.println("o"); break;
//    	}
//    	System.out.println(s);
//    }
//    
    // step 1 - generate tic tac toe fields
    // begin loop
    // step 2 - generate a "move"
    // step 3 - case/switch if winner/undecided (how to calculate?)
    // reloop
    // end
    
//    public boolean gewonnen() {
//    	
//    }
}
