package aufgaben.aufgabe1;

import java.awt.datatransfer.SystemFlavorMap;

//*
//***
//*****
//*******
//*********
//***********
//*********
//*******
//*****
//***
//*

public class Aufgabe1_test {

	public static void printRhombusUnfilled (int upperHalf)
	{
		for(int colom = 0; colom <= upperHalf; colom++)
		{
			for(int space = 0; space <= upperHalf - colom; space++)
			{
				System.out.print(" ");
			}
				for(int row = 0; row <= colom - 1; row++)
			{
					if (row <= 0 ) { 
						System.out.print("*");
						}
					if (row >= colom -1)
					{
						System.out.print("*");
					}
					
					else {
						System.out.print("  "); 
					}
			}

				System.out.println();
		}
		for(int colom = upperHalf +1; colom >= 0; colom--)
		{
			for(int space = 0; space <= upperHalf - colom; space++)
			{
				System.out.print(" ");
			}
				for(int row = 0; row <= colom - 1; row++)
			{
					if (row <= 0) { 
						System.out.print("*");
						}
					
					if (row >= colom -1)
					{
						System.out.print("*");
					}
					else {
						System.out.print("  "); 
					}
			}
			
			System.out.println();
		}
	}
	
			
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRhombusUnfilled(5);
		
	}

}