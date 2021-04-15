package uebungen.uebung10;

public class LotterieYear {
	
	private Lotterie[] lotterieYear;
	
	public LotterieYear() {
		final int WEEKS = 52;
		this.lotterieYear = new Lotterie[WEEKS];
		for(int index = 0; index < this.lotterieYear.length; index++) {
			this.lotterieYear[index] = new Lotterie();
			this.lotterieYear[index].drawing();
			this.lotterieYear[index].sort();
		}
	}
	
	public int nrOfNumber(int number) {
		int nrOfNumber = 0;
		for(int index = 0; index < this.lotterieYear.length; index++) {
			if(this.lotterieYear[index].contains(number)) {
				nrOfNumber++;
			}
		}
		return nrOfNumber;
	}
	
	public int[] frequency() {
		int[] frequency = new int[9];
		for(int index = 0; index < 9; index++) {
			int number = index +1;
			frequency[index] = this.nrOfNumber(number);
		}
		return frequency;
	}
	
	public void printFrequencyString() {
		int[] frequency = this.frequency();
		int summe = 0;
		System.out.print("[ ");
		for(int index = 0; index < frequency.length; index++) {
			summe += frequency[index];
			if(index < frequency.length - 1) {
			System.out.print(frequency[index]+ ", ");
			}
			else {
				System.out.print(frequency[index]);
			}
		}
		System.out.print(" ] ----> " + summe);
	}
	
	public void printFrequencyDiagram() {
		int[] frequency = this.frequency();
		for(int index = 0; index < frequency.length; index++) {
			System.out.print((index + 1) + " : ");
			for(int stars = 0; stars < frequency[index]; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public boolean containsEquals() {
		for(int index1 = 0; index1 < lotterieYear.length; index1++) {
			for(int index2 = index1 +1; index2 < lotterieYear.length; index2++) {
				if(this.lotterieYear[index1].equals(this.lotterieYear[index2])) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int index = 0; index < lotterieYear.length; index++) {
			s += String.format("%2d : %s %n", (index+1), this.lotterieYear[index].toString());
		}
		return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public Lotterie[] getArrayOfDoublets() {
		Lotterie[] loa = new Lotterie [2];
		for(int index1 = 0; index1 < lotterieYear.length; index1++) {
			for(int index2 = index1 +1; index2 < lotterieYear.length; index2++) {
				if(this.lotterieYear[index1].equals(this.lotterieYear[index2])) {
					loa[0] = this.lotterieYear[index1];
					loa[1] = this.lotterieYear[index2];
					return loa;
				}
			}
		}
		return loa;
	}
	
	
	
}
