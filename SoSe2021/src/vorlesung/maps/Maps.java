package vorlesung.maps;

import java.util.*;

public class Maps {

	public static void main(String[] args) {
		/*
		 * in Maps speichern wir schluessel werte paare
		 * schluessel sind eindeutig
		 * werte koennen sich doppeln, wertetyp V
		 * statt add(), addAll() hier put(), putAll()
		 */
		
		Map<String, Integer> mapA = new HashMap<>(); 
		mapA.put("A", 1);
		mapA.put("B", 2);
		mapA.put("C", 3);
		
		/*
		 * ein einzelnes Schluessel-Werte-Paar ist vom Typ Map.Entry
		 * typisiert: Map.Entry<K,V>
		 * unser Beispiel: Map.Entry<String, Integer>
		 */
		
		/*
		 * leider nicht iterator(), sondern entrySet()
		 * entrySet() erzeugt eine Set von lauter Schluessel-Werte-Paaren
		 */
		
		Set<Map.Entry<String, Integer>> allEntriesFromMapA = mapA.entrySet();
		
		for(Map.Entry<String, Integer> entry : allEntriesFromMapA) {
			System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());	
		}
		
		//funktioniert anstatt forschleife auch mit Iterator (weil es durch Set laeuft)
		Iterator<Map.Entry<String, Integer>> it = allEntriesFromMapA.iterator();
		System.out.println();
		
		//geht auch so
		for(Map.Entry<String, Integer> entry : mapA.entrySet()) {
			System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());
		}
		
		System.out.println();
		System.out.println(mapA.containsKey("B"));
		System.out.println(mapA.containsKey("D"));
		
		System.out.println(allEntriesFromMapA.size());
		System.out.println(mapA.get("B"));
		System.out.println();
		
		Set<String> allKeys = mapA.keySet();
		for(String key : allKeys) {
			System.out.println("key : " + key);
		}
		
		System.out.println();
		
		mapA.put("B", 5);
		for(Map.Entry<String, Integer> entry : mapA.entrySet()) {
			System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());
		}
		
		System.out.printf("%n%n-----MapB-----%n%n");
		
		Map<String, Integer> mapB = new HashMap<>();
		mapB.put("B", 6);
		mapB.put("D", 7);
		
		for(Map.Entry<String, Integer> entry : mapB.entrySet()) {
			System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());
		}
		
		System.out.printf("%n%n----mapA mapB----%n%n");
		
		mapA.putAll(mapB);
		mapA.put("B", 5);
		for(Map.Entry<String, Integer> entry : mapA.entrySet()) {
			System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());
		}
		
		System.out.printf("%n%n----mapB mapA----%n%n");
		
		mapB.putAll(mapA);
		mapA.put("B", 5);
		for(Map.Entry<String, Integer> entry : mapB.entrySet()) {
			System.out.println("Schluessel : " + entry.getKey() + " Wert : " + entry.getValue());
		}
		
		System.out.printf("%n%n----alle Werte von Map A----%n%n");
		
		
		
		
		
	}

}
