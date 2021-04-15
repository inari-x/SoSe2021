package uebungen.uebung10_nochmal;

public class Testklasse {

	public static void main(String[] args) {
		for (int nummer = 0; nummer < 10; nummer++) {
			Lottery lo = new Lottery();
			lo.drawing();
			lo.print();
		}
		System.out.println();
		
		Lottery lo1 = new Lottery();
		lo1.drawing();
		Lottery lo2 = new Lottery();
		lo2.drawing();
		while(!lo1.equals(lo2)) {
			lo2.drawing();
		}
		lo1.print();
		lo2.print();
    
		LotteryYear ly = new LotteryYear();
		ly.printFrequencyString();
		ly.printFrequencyDiagram();
		
		if(ly.containsEquals()) {
			Lottery[] loa = ly.getArrayOfDoublets();
			loa[0].print();
			loa[1].print();
		}
		else {
			System.out.println("keine gleichen Ziehungen im Jahr.");
		}
	}
}


