package uebungen.uebung10_nochmal;

public class LotteryYear {
	private Lottery[] lotteryYear;
	
	public LotteryYear() {
		final int WEEKS = 52;
		this.lotteryYear = new Lottery[WEEKS];
		for (int i = 0; i < this.lotteryYear.length; i++) {
			this.lotteryYear[i] = new Lottery();
			this.lotteryYear[i].drawing();
			this.lotteryYear[i].sort();
		}
	}
	
	public int nrOfNumber(int number) {
		int nrOfOccurrences = 0;
		for (int i = 0; i < this.lotteryYear.length; i++) {
			if(this.lotteryYear[i].contains(number)) {
				nrOfOccurrences++;
			}
		}
		return nrOfOccurrences;
	}
	
	public int[] frequency() {
		int[] frequency = new int[9];
		for (int i = 0; i < frequency.length; i++) {
			int number = i+1;
			frequency[i] = this.nrOfNumber(number);
			
		}
		return frequency;
	}
	
	public void printFrequencyString() {
		int[] frequency = this.frequency();
		int summe = 0;
		 System.out.print("[ ");
		for (int i = 0; i < frequency.length; i++) {
			summe += frequency[i];
			if(i < frequency.length) {
				System.out.print(frequency[i] + ", ");
			}
			else {
				System.out.print(frequency[i]);
			}
		}
		System.out.println(" ] --> " + summe);
	}
	
	 public void printFrequencyDiagram() {
		 int[] frequency = this.frequency();
		 for (int i = 0; i < frequency.length; i++) {
			System.out.print((i + 1)+ " : ");
			for (int stars = 0; stars < frequency[i]; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	 }
	 
	 public boolean containsEquals() {
		 for (int index1 = 0; index1 < this.lotteryYear.length; index1++) {
			 for (int index2 = 0; index2 < lotteryYear.length; index2++) {
				if(this.lotteryYear[index1].equals(this.lotteryYear[index2])) {
					return true;
				}
			}
			
		}
		 return false;	 	 
	 }
	 
	 @Override
	    public String toString()
	    {
	        String s = "";
	        for (int index = 0; index < lotteryYear.length; index++)
	        {
	            s += String.format("%2d : %s %n", (index+1), this.lotteryYear[index].toString());
	        }
	        return s;
	    }

	    public void print()
	    {
	        System.out.println(this.toString());
	    }
	    
	    public Lottery[] getArrayOfDoublets() {
	    	Lottery[] loa = new Lottery[2];
	    	for (int index1 = 0; index1 < this.lotteryYear.length; index1++) {
				for (int index2 = 0; index2 < this.lotteryYear.length; index2++) {
					if(this.lotteryYear[index1].equals(this.lotteryYear[index2])) {
						loa[0] = this.lotteryYear[index1];
						loa[1] = this.lotteryYear[index2];
						return loa;
					}
				}
			}
	    	return loa;
	    }

}
