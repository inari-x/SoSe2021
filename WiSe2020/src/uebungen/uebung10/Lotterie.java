package uebungen.uebung10;

import java.util.Random;

public class Lotterie {
	
	private int[] drawingResults;
	
	public Lotterie() {
		
		this.drawingResults = new int[5];
	}
	
	public boolean contains(int number) {
		
		for(int index = 0; index <= this.drawingResults.length -1; index++) {
			if(this.drawingResults[index] == number) {
				return true;
			}
		}
		return false;
	}
	
	public void drawing() {
		Random r = new Random();
		for(int index = 0; index < this.drawingResults.length; index++) {
		int zufZahl = r.nextInt(9)+1;
		
		while(this.contains(zufZahl)) {
			zufZahl = r.nextInt(9)+1;
			}
		this.drawingResults[index] = zufZahl;
		}
	}
	
	
	public void sort() {
		for(int bubble = 1; bubble < drawingResults.length; bubble++) {
			for(int index = 0; index < drawingResults.length - bubble; index++) {
				if(this.drawingResults[index] > this.drawingResults[index+1]) {
					int tmp = this.drawingResults[index];
					this.drawingResults[index] = drawingResults[index+1];
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
		for(int number = 1; number < 10; number++) {
		
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
		
		Lotterie lo = (Lotterie)o; //in CompilerTyp konvertiert (Object gemacht)
		lo.sort();
		this.sort();
		for(int index = 0; index < this.drawingResults.length; index++) {
			if(this.drawingResults[index] != lo.drawingResults[index]) {
				return false;
			}
		}
		return true;
	}
	
	

}
