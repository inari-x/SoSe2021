package aufgaben.aufgabe3;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("    START");
		Solitaire game = new Solitaire();
		
		System.out.println();
		game.print();
		System.out.println();
		int zug=1;
		
		while(game.moveFirstPossible())
		{
			System.err.println("Nachdem "+zug+"en Zug:");
			System.out.println();
			zug++;
			game.print();
		}
		System.out.println("Kein moeglicher Zug");
	}


}
