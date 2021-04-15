package aufgaben.aufgabe7_nochmal2;

public class SortedArray {
	
	private int[] s;
	
	public SortedArray() {
		this.s = new int[0];
	}
	
	public SortedArray(int element) {
		this.s = new int[1];
		s[0] = element;
	}
	
	private boolean contains(int element) {
		for (int i = 0; i < this.s.length; i++) {
			if(s[i] == element) return true;
		}
		return false;
	}
	
	public boolean insert(int element) {
		if(contains(element)) return false;
		
			int[] kopie = new int[this.s.length + 1];
			int index = 0;
			int indexS = 0;
			while(indexS < this.s.length && this.s[indexS] < element) {
				kopie[index] = this.s[indexS];
				index++;
				indexS++;
			}
			kopie[index] = element;
			index++;
			while(indexS < this.s.length) {
				kopie[index] = this.s[indexS];
				index++;
				indexS++;
			}
		this.s = kopie;
		return true;
	} 
	
	public boolean delete(int element) {
		if(!contains(element)) return false;
		
		int[] kopie = new int[this.s.length - 1];
		int indexK = 0;
		int indexS = 0;
		while(indexS < this.s.length && !(s[indexS] == element)) {
			kopie[indexK] = this.s[indexS];
			indexK++;
			indexS++;
		}
		indexS++;
		while(indexK < kopie.length) {
			kopie[indexK] = this.s[indexS];
			indexS++;
			indexK++;
		}
		this.s = kopie;
		return true;
	}
	
	public void print() {
		if(s.length==0) {
            System.out.println("[ ]");
        }
        else {
            System.out.print("[ ");
            for(int i=0; i<s.length-1; i++)
                System.out.print(s[i] + ", ");
            System.out.println(s[s.length-1] + " ]");
       	}
	}	
}