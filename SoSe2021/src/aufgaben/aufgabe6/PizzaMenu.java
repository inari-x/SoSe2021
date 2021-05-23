package aufgaben.aufgabe6;

import java.util.*;
import java.util.Map.Entry;

public class PizzaMenu {
	
	public static boolean existingPizza(Map<String,Double> menu, String pizza) {
		for(Map.Entry<String, Double> entry : menu.entrySet()) {
			if(entry.getKey().equals(pizza)) {
				return true;
			}
		}
		return false;
	}
	
	public static void printPrice(Map<String,Double> menu, String pizza) {
		if(existingPizza(menu, pizza)) {
			for(Map.Entry<String, Double> entry : menu.entrySet()) {
				if(entry.getKey().equals(pizza)) {
					System.out.printf("%10s: %2.2f Euro",entry.getKey(), entry.getValue());	
				}
			}
		}
		else {
			System.out.println("Diese Pizza gibt es nicht.");
		}
		System.out.println();
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
	
	public static void affordablePizza(Map<String,Double> menu, double maxPrice) { 
		System.out.printf("%nEingegebener Betrag: %.2f Euro.%n", maxPrice);
		int affordableCount = 0;
	
		for(Map.Entry<String, Double> entry : menu.entrySet()) {
			if(entry.getValue() < maxPrice) { //Auto-Boxing 
				System.out.printf("Moegliche Pizzen: " + entry.getKey() + "%n");
				affordableCount = affordableCount + 1;
			}
		}
		if(affordableCount == 0) {
				System.out.printf("Leider gibt es zu diesem Preis keine Pizza.%n%n");
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> menue = new HashMap<>();
		menue.put("Margherita", 7.00);
		menue.put("Veggie", 7.50);
		menue.put("Salami", 8.50);
		menue.put("Schinken", 8.50);
		
		System.out.println(existingPizza(menue, "Hawaii"));
		System.out.println(existingPizza(menue, "Veggie"));
		printPrice(menue, "Margherita");
		printPrice(menue, "Hawaii");
		
		Map<String, Double> menue2 = new HashMap<>();
		printMenu(menue2);
		printMenu(menue);
		
		menue.replace("Salami", 8.20);
		System.out.println();
		
		affordablePizza(menue, 4);
		affordablePizza(menue, 10);
		affordablePizza(menue, 8);
		
		menue.remove("Margherita");
		menue.remove("Veggie");
		menue.remove("Salami");
		menue.remove("Schinken");
		System.out.println(menue);
		
		menue.put("Verde", 7.00);
		menue.put("Hawaii", 8.20);
		menue.put("Tradizionale", 8.50);
		
		Map<String, Double> menue3 = new HashMap<>();
		menue3.putAll(menue);
		System.out.println(menue3);
		
	}

}
