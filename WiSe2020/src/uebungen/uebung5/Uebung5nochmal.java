package uebungen.uebung5;

import java.util.Random;

public class Uebung5nochmal {
	
	public static int throwDice() {
		Random wurf = new Random();
		int würfe = wurf.nextInt(6)+1;
		
		return würfe;
	}
	
	public static void printThrow(int cast) {
		System.out.printf("Es wurde eine %d gewürfelt %n", cast);
	}
	
	public static int[] insertIntoStatistics(int[] statistics, int cast) {
		for(int index = 0; index < statistics.length; index++) {
			if(cast -1 == index) {
				statistics[index]++;
			}
		}
		
		return statistics;
	}
	
	public static void printStatistics(int[] statistics) {
		System.out.print("[ ");
		for(int index = 0; index < statistics.length; index++) {
			System.out.printf("(%d " + " x " + (index +1) + "), ", statistics[index]);
			for( index = 0; index < statistics.length -1; index++) {
				System.out.printf("(%d " + " x " + (index +1) + ") ", statistics[index]);
			}
		}
		
		System.out.print(" ]");
	}
	
	public static int sumOfStatistics(int[] statistics) {
		int finalSum = 0;
		for(int index = 0; index < statistics.length; index++) {
			finalSum += ((index + 1) * statistics[index]);
		}
		return finalSum;
	}
	
	public static int throwDiceUntilTarget(int target, int[] statistics) {
		int rollcount = 0;
		for(int index = 0; index < target; index++) {
			int wurf = throwDice();
			if(sumOfStatistics(statistics) <= target) {
				printThrow(wurf);
				insertIntoStatistics(statistics, wurf);
				sumOfStatistics(statistics);
				rollcount++;
			}
		}
		return rollcount;
	}

	public static void main(String[] args) {
		
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
		
		System.out.printf("%n%n--------------------- Test sumOfStatistics --------------------------%n%n");
		printStatistics(statistics);
		int sumTest = sumOfStatistics(statistics);
		System.out.println("Summe = " + sumTest);
		
		System.out.printf("%n%n------------------- Test throwDiceUntilTarget -----------------------%n%n");
		statistics = new int[6];    // altes Array war schon befuellt 
		final int TARGET = 100;
		int tries = throwDiceUntilTarget(TARGET, statistics);
		printStatistics(statistics);
		int sum = sumOfStatistics(statistics);
		System.out.println("Es wurden " + tries + " Versuche benötigt, um " + sum + " Punkte zu erzielen.");

	}

}
