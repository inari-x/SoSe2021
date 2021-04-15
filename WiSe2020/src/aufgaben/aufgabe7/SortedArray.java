package aufgaben.aufgabe7;

/* 
 * Katrin Malfent
 */

import java.util.Arrays;

public class SortedArray {
	
	private int[] s;
	
	public SortedArray() {
		
		this.s = new int[0];
	}
	
	public SortedArray(int element) {

		this.s = new int[1]; 
		s[0] = element;
	}
	
	public boolean contains(int element) {
		
		for(int index = 0; index < this.s.length; index++) {
			if(this.s[index] == element ) {
				return true;
			}
		}
		return false;
	}
	
	public boolean insert(int element) {  
		
		if( contains(element) ) {
			return false;
		}
		int[] neu = new int[this.s.length+1]; 
		int indexNeu = 0;
		int indexS = 0;
		while(indexS < this.s.length && this.s[indexS] < element) {
			neu[indexNeu] = this.s[indexS];
			indexNeu++;
			indexS++;
		}
		neu[indexNeu] = element;
		indexNeu++;
		
		while(indexS < this.s.length) {
			neu[indexNeu] = this.s[indexS];
			indexNeu++;
			indexS++;
		}
		this.s = neu;
		return true;
	}
	
	public boolean delete(int element) {
		
		if(!contains(element) ) {
			return false;
		}
		int[] neu = new int[this.s.length-1]; 
		int indexNeu = 0;
		int indexS = 0;
		
		while(indexS < s.length && !(s[indexS] == element)) {
			neu[indexNeu] = this.s[indexS];
			indexNeu++;
			indexS++;
		}
		indexS++;
		while(indexNeu < neu.length) {
			neu[indexNeu] = this.s[indexS];
			indexNeu++;
			indexS++;
		}
		this.s = neu;
		return true;
	}
	
	 public void print() {
		 
		 System.out.print("[");
		 
		 if(this.s.length > 0) {
			 for(int index = 0; index < this.s.length -1; index++) {
				System.out.print(this.s[index] + ", ");
			 }
			 System.out.println(this.s[this.s.length-1] + "]");
		 }
		 else {
			 System.out.println("]");
		 } 
	 }

}
