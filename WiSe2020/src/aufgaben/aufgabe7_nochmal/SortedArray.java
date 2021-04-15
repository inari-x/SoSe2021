package aufgaben.aufgabe7_nochmal;

public class SortedArray {
	
	private int[] s;
	
	public SortedArray() {
		this.s = new int[0];
	}
	
	public SortedArray(int element) {
		this.s = new int[1];
		s[0] = element;
	}
	
	boolean contains(int element) {
		for (int i = 0; i < this.s.length; i++) {
			if(this.s[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	public boolean insert(int element) {
		if(this.contains(element)) return false;
		int[] kopie = new int[this.s.length + 1];
		int indexK = 0;
		int indexS = 0;
			while(indexS < this.s.length && indexS < element) {
				kopie[indexK] = this.s[indexS];
				indexK++;
				indexS++;
			}
			kopie[indexK] = element;
			indexK++;
		while(indexS < this.s.length) {
			kopie[indexK] = this.s[indexS];
			indexK++;
			indexS++;
		}
		this.s = kopie;
		return true;
	}
	
	public boolean delete(int element) {
		if(!this.contains(element)) return false;
		int[] kopie = new int[this.s.length - 1];
		int indexK = 0;
		int indexS = 0;
		while(indexS < this.s.length && this.s[indexS] != element) {
			kopie[indexK] = this.s[indexS];
			indexK++;
			indexS++;
		}
		indexS++;
		while(indexK < kopie.length) {
			kopie[indexK] = this.s[indexS];
			indexK++;
			indexS++;
		}
		this.s = kopie;
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
