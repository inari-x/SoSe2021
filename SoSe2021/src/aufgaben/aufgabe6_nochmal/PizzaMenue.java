package aufgaben.aufgabe6_nochmal;

import java.util.*;

public class PizzaMenue {
	
	public static boolean existingPizza(Map<String,Double> menu, String pizza) {
		for(Map.Entry<String,Double> entry : menu.entrySet()) {
			if(entry.getKey().equals(pizza)) return true;
		}
		return false;
	}
	
	public static void printPrice(Map<String,Double> menu, String pizza) {
		if(existingPizza(menu, pizza)) {
			for(Map.Entry<String, Double> entry : menu.entrySet()) {
				if(entry.getKey().equals(pizza)) {
					System.out.printf("%-10s : %2.2f %n", entry.getKey(), entry.getValue());
				}
				else {
					System.out.printf("%-10s : Diese Pizza gibt es nicht%n", entry.getKey());
				}
			}
			System.out.println();
		}
	}
	
	public static void printMenu(Map<String,Double> menu) {
		if(menu.size() < 1) {
			System.out.printf("%n##################%n");
			System.out.printf("Das Menu enthaelt %d Pizzen.", menu.size());
			System.out.printf("%n##################%n%n");	
		}
		else {
			System.out.printf("Das Menu enthaelt %d Pizzen %n", menu.size());
			for(Map.Entry<String, Double> entry : menu.entrySet()) {
				System.out.printf("Pizza " + entry.getKey() + ": " +  entry.getValue() + "%n");
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> pizza = new HashMap<>();
		pizza.put("Marghertia", 7.00);
		pizza.put("Veggie", 7.50);
		pizza.put("Salami", 8.50);
		pizza.put("Schinken", 8.50);
		
		System.out.println(existingPizza(pizza, "Hawaii"));
		System.out.println(existingPizza(pizza, "Salami"));
		
		System.out.println();
		
		printPrice(pizza, "Veggie");
		printPrice(pizza, "Hawaii");
		
		
		
		
		
		
	}

}
