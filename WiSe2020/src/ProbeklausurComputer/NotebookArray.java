package ProbeklausurComputer;

import java.util.Random;

public class NotebookArray {
	
	private Notebook[] notebooks;
	
	public NotebookArray(int anzahl) {
		this.notebooks = new Notebook[anzahl];
	}
	
	public void konfigurieren() {
		
		Random r = new Random();
		for(int index = 0; index < this.notebooks.length; index++) {
			int auswahl = r.nextInt(5);
			if(auswahl == 0) new Notebook("lenovo", 8, 256, 13);
			if(auswahl == 1) new Notebook("lenovo", 16, 512, 15);
			if(auswahl == 2) new Notebook("apple", 4, 256, 13); 
			if(auswahl == 3) new Notebook("apple", 8, 512, 13);
			if(auswahl == 4) new Notebook("dell", 8, 512, 15);
			
			this.notebooks[index] = switch(auswahl) {
		     	case 0 -> new Notebook("lenovo", 8, 256, 13); 
		        case 1 ->  new Notebook("lenovo", 16, 512, 15); 
		        case 2 ->  new Notebook("apple", 4, 256, 13); 
		        case 3 ->  new Notebook("apple", 8, 512, 13); 
		        case 4 ->  new Notebook("dell", 8, 512, 15); 
		        default -> null;
		   };
		}
	
		
	}
	
	@Override
	public String toString() {
		String s = "[ " + this.notebooks.length + " : ";
		for(int index = 0; index < this.notebooks.length; index++) {
			if(index < this.notebooks.length -1) {
				s += this.notebooks[index].toString() + ", ";
			}
			else {
				s += this.notebooks[index].toString();
			}
		}
		s += " ]";
		return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public NotebookArray getHersteller(String hersteller) {
		int anzahl = 0;
		for(int index = 0; index < this.notebooks.length; index++) {
			if(this.notebooks[index].gleicherHersteller(hersteller)) {
				anzahl++;
			}
		}
		NotebookArray na = new NotebookArray(anzahl);
		int indexNA = 0;
		for(int index = 0; index < this.notebooks.length; index++) {
			if(this.notebooks[index].gleicherHersteller(hersteller)) {
				na.notebooks[indexNA++] = this.notebooks[index];
			}
		}
		return na;
	}
	
	 public void sortRamPlatte() {
	    for(int bubble=0; bubble<this.notebooks.length-1; bubble++) {
	       for(int i=0; i<this.notebooks.length-1-bubble; i++)  {
	           if((this.notebooks[i].getRam()>this.notebooks[i+1].getRam()) ||
	               (this.notebooks[i].getRam()==this.notebooks[i+1].getRam() && 
	               this.notebooks[i].getPlatte()>this.notebooks[i+1].getPlatte())) {
	               Notebook temp = this.notebooks[i];
	               this.notebooks[i] = this.notebooks[i+1];
	               this.notebooks[i+1] = temp;
	               }
	          }
	    }
	}
}
