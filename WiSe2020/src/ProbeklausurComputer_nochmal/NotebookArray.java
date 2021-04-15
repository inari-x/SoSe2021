package ProbeklausurComputer_nochmal;

import java.util.Random;

public class NotebookArray {
	private Notebook[] notebooks;
	
	public NotebookArray(int anzahl) {
		this.notebooks = new Notebook[anzahl];
	}
	
	public void konfigurieren() {
		Random r = new Random();
		for (int i = 0; i < this.notebooks.length; i++) {
			while(this.notebooks[i] == null) {
				int zuf = r.nextInt(5);
				if(zuf == 0) this.notebooks[i] = new Notebook("lenovo", 8, 256, 13);
				if(zuf == 1) this.notebooks[i] = new Notebook("lenovo", 16, 512, 15);
				if(zuf == 2) this.notebooks[i] = new Notebook("apple", 4, 256, 13);
				if(zuf == 3) this.notebooks[i] = new Notebook("apple", 8, 512, 13);
				if(zuf == 4) this.notebooks[i] = new Notebook("dell", 8, 512, 15);
			}
		}
	}
	
	@Override
	public String toString() {
		String s = "[ " + this.notebooks.length + " : ";
		for (int i = 0; i < this.notebooks.length; i++) {
			if(i < this.notebooks.length - 1) {
				s += this.notebooks[i].toString() + ", ";
			}
			else {
				s += this.notebooks[i].toString();
			}
		}
		s += " ]";
		return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public NotebookArray getHersteller(String hersteller) {
		int vorkommen = 0;
		for (int i = 0; i < this.notebooks.length; i++) {
			if(this.notebooks[i].gleicherHersteller(hersteller)) {
				vorkommen++;
			}
		}
		NotebookArray na = new NotebookArray(vorkommen);
		int indexNA = 0;
		for (int i = 0; i < this.notebooks.length; i++) {
			if(this.notebooks[i].gleicherHersteller(hersteller)) {
				na.notebooks[indexNA] = this.notebooks[i];
				indexNA++;
			}
		}
		return na;
	}
	
	public void sortRamPlatte() {
		for(int bubble = 1; bubble < this.notebooks.length; bubble++) {
			for (int index = 0; index < notebooks.length - bubble; index++) {
				if(this.notebooks[index].getRam() > this.notebooks[index+1].getRam() || this.notebooks[index].getRam() == this.notebooks[index+1].getRam() && this.notebooks[index].getPlatte() > this.notebooks[index+1].getPlatte()) {
					Notebook tmp = this.notebooks[index];
					this.notebooks[index] = this.notebooks[index + 1];
					this.notebooks[index+1] = tmp;
				}
			}
		}
	}
		
}
