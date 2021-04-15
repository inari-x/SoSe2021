package klausur;

import java.util.Formatter;

public class Kontinent {
	
	private Land[] laender;
	private char kontinent;
	
	public Kontinent(char kontinent, int anzahlLaender) {
		this.kontinent = kontinent;
		this.laender = new Land[anzahlLaender];
		for (int i = 0; i < this.laender.length; i++) {
			this.laender[i] = new Land();
		}
	}
	
	public int getAnzLaender() {
		return this.laender.length;
	}
	
	public Land[] getLaender() {
		return this.laender;
	}
	
	public Land getLandAtIndex(int index) {
		if(index < this.laender.length && index >= 0) {
				return this.laender[index];
		}
		else {
			return null;
		}
	}
	
//	public int[] getSummen() {
//		int summeEinwohner = 0;
//		int[] iarr = new int[2];
//		for (int i = 0; i < this.laender.length; i++) {
//			summeEinwohner += this.laender[i].getEinwohner();
//		}
//		this.laender[0] = summeEinwohner;
//		
//		return iarr;
//	}
	
//	@Override
//	public String toString() {
//	String s = "Kontinent a ";		
//	s+= "-----------------------------";
//	for (int i = 0; i < this.laender.length; i++) {
//		s += this.laender[i].toString();
//	}
//	System.out.println("Summen: %3d : %3d", getSummen());
//	return s;
//	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public void sort(int nach) {
		for(int bubble = 1; bubble < this.laender.length; bubble++) {
			for (int index = 0; index < this.laender.length-bubble; index++) {
				if(nach > 0) {
					if(this.laender[index].getGroesse() > this.laender[index+1].getGroesse()) {
						Land tmp = this.laender[index];
						this.laender[index] = this.laender[index+1];
						this.laender[index+1] = tmp;
					}
					if(nach > 1) {
						if(this.laender[index].getEinwohner() > this.laender[index+1].getEinwohner()) {
							Land tmp = this.laender[index];
							this.laender[index] = this.laender[index+1];
							this.laender[index+1] = tmp;
						}
					}
					if(nach > 2) {
						if(this.laender[index].ewDichte() > this.laender[index+1].ewDichte()) {
							Land tmp = this.laender[index];
							this.laender[index] = this.laender[index+1];
							this.laender[index+1] = tmp;
						}
					}
				}
			}
		}
	}

}
