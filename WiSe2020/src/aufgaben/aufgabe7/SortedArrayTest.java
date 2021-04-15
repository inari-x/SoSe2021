package aufgaben.aufgabe7;

import java.util.Arrays;

public class SortedArrayTest {

	public static void main(String[] args) {
		
		System.out.printf("%n%n------------------------- Test a1 -----------------------------------%n%n");
		SortedArray a1 = new SortedArray();
		a1.print();
		a1.delete(5);       a1.print();
		a1.insert(5);       a1.print();
		a1.insert(7);       a1.print();
		a1.delete(5);       a1.print();
		a1.insert(6);       a1.print();
		a1.insert(4);       a1.print();
		a1.insert(8);       a1.print();
		a1.delete(8);       a1.print();
		a1.delete(6);       a1.print();
		
		

		System.out.printf("%n%n------------------------- Test a2 -----------------------------------%n%n");
		SortedArray a2 = new SortedArray(9);
		a2.print();
		a2.insert(5);       a2.print();
		a2.insert(9);       a2.print();
		a2.insert(5);       a2.print();
		a2.insert(4);       a2.print();
		a2.insert(4);       a2.print();
		a2.delete(5);       a2.print();
		a2.delete(9);       a2.print();
		a2.delete(4);       a2.print();
		a2.delete(4);       a2.print(); 
	}

}
