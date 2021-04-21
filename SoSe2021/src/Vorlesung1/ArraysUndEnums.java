package Vorlesung1;

public class ArraysUndEnums {
	
	enum Weekday { MO, DI, MI, DO, FR, SA, SO }; //kann auch ausgelagert werden ueber neues package new enum
	
	public static void printDay(int day) {
		switch(day) {
			case 0 : System.out.println("Montag"); break;
			case 1 : System.out.println("Dienstag"); break;
			case 2 : System.out.println("Mittwoch"); break;
			case 3 : System.out.println("Donnerstag"); break;
			case 4 : System.out.println("Freitag"); break;
			case 5 : System.out.println("Samstag"); break;
			case 6 : System.out.println("Sonntag"); break;
			default: System.out.println("kein Tag");
		}
	}
	
	public static void printDay(Weekday day) {
		switch(day) {
			case MO : System.out.println("Montag"); break;
			case DI : System.out.println("Dienstag"); break;
			case MI : System.out.println("Mittwoch"); break;
			case DO : System.out.println("Donnerstag"); break;
			case FR : System.out.println("Freitag"); break;
			case SA : System.out.println("Samstag"); break;
			case SO : System.out.println("Sonntag"); break;
			default: System.out.println("kein Tag");
		}
	}
	
	public static void printDay(String day) {
		switch(day) {
			case "Mo" : System.out.println("Montag"); break;
			case "Di" : System.out.println("Dienstag"); break;
			case "Mi" : System.out.println("Mittwoch"); break;
			case "Do" : System.out.println("Donnerstag"); break;
			case "Fr" : System.out.println("Freitag"); break;
			case "Sa" : System.out.println("Samstag"); break;
			case "So" : System.out.println("Sonntag"); break;
			default: System.out.println("kein Tag");
		}
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mdIntArray = new int[3][4];
		
		for(int i=0; i < mdIntArray.length; i++) {
			for(int j=0; j < mdIntArray[i].length; j++) {
				mdIntArray[i][j] = i * j;
			}
		}
		
		for(int i=0; i < mdIntArray.length; i++) {
			System.out.print(i + ": ");
			for(int j=0; j < mdIntArray[i].length; j++) {
				mdIntArray[i][j] = i * j;
				System.out.print(mdIntArray[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		String[][] mdStringArray = new String[3][4];
		
		for(int i=0; i < mdStringArray.length; i++) {
			for(int j=0; j < mdStringArray[i].length; j++) {
				mdStringArray[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for(int i=0; i < mdStringArray.length; i++) {
			System.out.print(i + ": ");
			for(int j=0; j < mdStringArray[i].length; j++) {
				
				System.out.print(mdStringArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		printDay(1);
		printDay(120);
		printDay("Mo");
		printDay("hallo");
		printDay(Weekday.SA);
		
	}

}
