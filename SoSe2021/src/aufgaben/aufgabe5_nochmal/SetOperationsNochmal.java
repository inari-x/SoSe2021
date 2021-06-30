package aufgaben.aufgabe5_nochmal;

import java.util.*;

public class SetOperationsNochmal {
	Set<Integer> numbers1;
	Set<Integer> numbers2;
	Set<Integer> both;
	
	final static int UPPERBOUND = 100;
	
	public SetOperationsNochmal() {
		this.numbers1 = new TreeSet<>();
		this.numbers2 = new TreeSet<>();
		this.both = new TreeSet<>();
	}
	
	public void fill() {
		for (int i = 0; i < UPPERBOUND; i++) {
			Random r = new Random();
			this.numbers1.add(Integer.valueOf(r.nextInt(UPPERBOUND)));
			this.numbers2.add(Integer.valueOf(r.nextInt(UPPERBOUND)));
		}
	}
	
	public void fillBothUnion() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                        A "+'\u222a'+" B ");
		System.out.println("----------------------------------------------------------------------------");
		this.both.addAll(numbers1);
		this.both.addAll(numbers2);
	}
	
	public void fillBothIntersection() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                        A "+'\u2229'+" B ");
		System.out.println("----------------------------------------------------------------------------");
		this.both.clear();
		this.both.addAll(numbers1);
		this.both.retainAll(numbers2);
	}
	
	public void fillBothDifference() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                          A-B ");
		System.out.println("----------------------------------------------------------------------------");
		this.both.addAll(numbers1);
		this.both.removeAll(numbers2);
	}
}
