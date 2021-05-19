package aufgaben.aufgabe5;

import java.util.*;

public class SetOperations {
	
	static Set<Integer> numbers1;
	static Set<Integer> numbers2;
	static Set<Integer> both;
	
	public static Set<Integer> createTreeSet() {
		Set<Integer> set = new TreeSet<>();
		set.addAll(numbers1);
		set.addAll(numbers2);
		set.addAll(both);
		return set;
	}
	
	public static void fill() {
		Random r = new Random();
		int random = r.nextInt(99)+1;
		Integer RandomObject = Integer.valueOf(random);
		for(Integer i : numbers1) {
			
			numbers1.add(RandomObject);
		}
		for(Integer i : numbers2) {
			numbers2.add(RandomObject);
		}
	}
	
	
	public static void fillBothUnion() {
		for(Integer i : both) {
			both.addAll(numbers1);
			both.addAll(numbers2);
		}
	}
	
	public static void fillBothIntersection() {
		for(Integer i : both) {
			fillBothUnion();
			both.retainAll(numbers1);
			both.retainAll(numbers2);
		}
	}
	
//	public static void fillBothDifference() {
//		numbers1.removeAll(numbers2);
//		for(Integer i : both) {
//			fillBothUnion();
//			both.addAll(numbers1.removeAll(numbers2));
//		}
//	}
	
	public static void printVereinigung() {
		char vereinigung = '\u222a';
		System.out.println("---------------------------------------------------------------");
		System.out.println("          A                    B                  A "+ vereinigung + " B       ");
		System.out.println("---------------------------------------------------------------");
		
		
		
	}
	
	public static void main(String[] args) {
		printVereinigung();
	}
	
	

}
