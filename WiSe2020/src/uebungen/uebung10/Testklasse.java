package uebungen.uebung10;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%n%n----------------------Lotterie in Schleife -----------------------%n%n");
		for(int index = 0; index < 10; index++) {
			Lotterie lo = new Lotterie();
			lo.drawing();
			lo.print();
		}
		
		System.out.printf("%n%n----------------------Lotterie equals -----------------------%n%n");
		Lotterie lo1 = new Lotterie();
		lo1.drawing();
		Lotterie lo2 = new Lotterie();
		lo2.drawing();
		while(!lo1.equals(lo2)) {
			lo2.drawing();
		}
		lo1.print();
		lo2.print();
		
		System.out.printf("%n%n----------------------Lotterie equals -----------------------%n%n");
		LotterieYear ly = new LotterieYear();
		ly.printFrequencyString();
		System.out.println();
		ly.printFrequencyDiagram();
		
		ly.print();
		
		Lotterie[] loa = ly.getArrayOfDoublets();
		loa[0].print();
		loa[1].print();
		
	}

}
