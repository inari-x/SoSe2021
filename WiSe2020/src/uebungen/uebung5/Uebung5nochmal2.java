package uebungen.uebung5;

import java.util.Random;


public class Uebung5nochmal2 {
	
	public static int throwDice() {
		Random wuerfel = new Random();
		int wurf = wuerfel.nextInt(6) +1;
		return wurf;
	}
	
	public static void printThrow(int cast) {
		
		System.out.printf("Es wurde eine %d gewuerfelt %n", cast);
	}
	
	public static int[] insertIntoStatistics(int[] statistics, int cast) {
	for(int index = 0; index < statistics.length; index++) {
			
			if(cast - 1 == index) {
				statistics[index]++;
			}
		}
		return statistics;
	}
	
	public static void printStatistics(int[] statistics) {
		System.out.print("[ ");
		for(int index = 0; index < statistics.length; index++) {

			
			System.out.printf("(%d " + "x " + (index+1) + ") ", statistics[index]);
			
		}
		System.out.printf(" ]%n");
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] statistics = new int[6]; 
		
		
		System.out.printf("%n%n------------------- Test throwDice and printThrow -------------------%n%n");
		for(int index=0; index<10; index++)
		{
		    int cast = throwDice();
		    printThrow(cast);
		}
		
		System.out.printf("%n%n------------------ Test insert- and printStatistics -----------------%n%n");
		for(int index=0; index<100; index++)
		{
		    int cast = throwDice();
		    statistics = insertIntoStatistics(statistics, cast);
		}
		printStatistics(statistics); 
	}

}
