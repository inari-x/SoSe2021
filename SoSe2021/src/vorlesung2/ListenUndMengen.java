package vorlesung2;

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;

//oder :

import java.util.*;

/*
 * Collections: aehnlich wie Arrays, viele Elemente speichern
 * keine feste Laenge
 * Wie koennen nur Referenztypen speichern (also nicht int, boolean, char, double, ...)
 * Elemente  verschiedenen Typs speicherbar --> gar nicht gut, deshalb Typisieren
 * Arten von Collections: List (wie Arrays), Set (Mengen, keine Doppelungen), Stack, Queue
 * Map (2-spaltige Tabellen, Schluessel-/Werte-Paare
 */


public class ListenUndMengen {
	
	public static void main(String[] args) {
		//Mengen Set
		
		Set<String> set1 = new HashSet<>();  //Typ Set (menge) //<> typisierung //bei Hashset <> sage ich nur dass es typisiert ist
		Set<String> set2 = new TreeSet<>();
		
		String s1 = "erster";
		String s2 = "zweiter";
		String s3 = "dritter";
		String s4 = "zweiter";
		
		Integer i1 = 1;
		
		System.out.println(set1.add(s1));
		System.out.println(set1.add(s2));
		System.out.println(set1.add(s3));
		System.out.println(set1.add(s4));
		//System.out.println(set1.add(i1)); auskommentiert weil nur Strings aufgenommen werden
		//warunung bei collection nicht typisiert
		
		
		
		System.out.println(set1.size());
		
		Iterator it = set1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		for(String element : set1) {
			System.out.println(element);
		}
		
		System.out.println(set1.remove("erster"));
		System.out.println(set1.remove("vierter"));
		
		System.out.println();
		
		for(String element : set1) {
			System.out.println(element);
		}
		
//		int[] arr = new int[10];
//		for (int e : arr) //funktioniert auch fuer arrays
		
		System.out.printf("%n%n------------Listen-----------%n%n");
		
		
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new LinkedList<>();
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		
		for(String s : l1) {
			System.out.println(s);
		}
		
		
		System.out.println(l1.size());
		
		System.out.println(l1.remove("zweiter"));
		System.out.println(l1.remove("vierter"));
		
		for(String s : l1) {
			System.out.println(s);
		}
		
		
		System.out.println();
		System.out.println("geloescht : " + l1.remove(1));

		for(String s : l1) {
			System.out.println(s);
		}
		
		
		System.out.println();
		
		l2.add("neu");
		l2.add("alt");
		
		for(String s : l2) {
			System.out.println(s);
		}
		
		
		System.out.println();
		
		l1.addAll(l2);
		
		for(String s : l1) {
			System.out.println(s);
		}
		
		
		System.out.println();
		
		l1.removeAll(l2);
		
		for(String s : l1) {
			System.out.println(s);
		}
		
	}

}
