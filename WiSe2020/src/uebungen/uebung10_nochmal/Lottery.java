package uebungen.uebung10_nochmal;

import java.util.Random;

public class Lottery {
	private int[] drawingResults;
	
	public Lottery() {
		this.drawingResults = new int[5];
	}
	
	public boolean contains(int number) {
		for (int i = 0; i < this.drawingResults.length; i++) {
			if(this.drawingResults[i] == number) {
				return true;
			}
		}
		return false;
	}
	
	public void drawing() {
		Random r = new Random();
		for (int i = 0; i < this.drawingResults.length; i++) {
			int zufNummer = r.nextInt(9) + 1;
			while(this.contains(zufNummer)) {
				zufNummer = r.nextInt(9) +1;
			}
			this.drawingResults[i] = zufNummer;
		}
	}
	
	public void sort() {
		for(int bubble = 1; bubble < this.drawingResults.length; bubble++) {
			for (int index = 0; index < drawingResults.length - bubble; index++) {
				if(this.drawingResults[index] > this.drawingResults[index + 1]) {
					int tmp = this.drawingResults[index];
					this.drawingResults[index] = this.drawingResults[index+1];
					this.drawingResults[index+1] = tmp;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String s = "( ";
		this.sort();
		int index = 0;
		for (int number = 1; number < 10; number++) {
			if(index < 5 && this.drawingResults[index] == number) {
				s += this.drawingResults[index] + " ";
				index++;
			}
			else {
				s += "- ";
			}
		}
		s += " )";
		return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	@Override 
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this == o) return true;
		if(this.getClass() != o.getClass()) return false;
		Lottery lo = (Lottery)o;
		lo.sort();
		this.sort();
		for (int i = 0; i < this.drawingResults.length; i++) {
			if(this.drawingResults[i] != lo.drawingResults[i]) {
				return false;
			}
		}
		return true;
	}
	
}
