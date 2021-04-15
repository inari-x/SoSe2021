package uebungen.uebung4;

public class Uebung4 {

	public static void print(char[] ca) {
		
		System.out.print("[");
		for(int index = 0; index < ca.length-1; index++) { 
			System.out.print(ca[index] + ", ");
		}
		if(ca.length>0) {
		System.out.print(ca[ca.length-1]);
		System.out.println("]");
		}
	}

	public static void print(int [] ca) {
		
		System.out.print("[");
		for(int index = 0; index < ca.length-1; index++) {
			System.out.print(ca[index] + ", ");
		}
		System.out.print(ca[ca.length-1]);
		System.out.println("]");
	}


	public static char[] stringToCharArray(String s) {
		char[] stringArray = new char[s.length()];

		for(int index = 0; index < s.length(); index++) {
			stringArray[index] = s.charAt(index);	
		}
			return stringArray;
	}
	
	public static char[] filter(char[] carr, char filter) {
		int nrOfOccurrences = 0;
		for(int index = 0; index < carr.length; index++) {
			if(carr[index] == filter) {
				nrOfOccurrences++;
			}
		}
		int newLength = carr.length - nrOfOccurrences;
		char[] caNew = new char [newLength];
		int indexNewArr = 0;
		for(int index = 0; index < carr.length; index++) {
			if(carr[index] != filter) {
				caNew[indexNewArr] = carr[index];
				indexNewArr++;
			}
		}
		return caNew;
	}
	
	public static int[] minAndMax(int[] iarr) {
		int curMin = iarr[0];
		int curMax = iarr[0];
		for(int index = 0; index < iarr.length; index++) {
			if(iarr[index] < curMin) {
				curMin = iarr[index];
			}
			if(iarr[index] > curMax) {
				curMax = iarr[index];
			}
		}
		int[] ra = {curMin, curMax};
		return ra;
		
	}
	
	public static int[] reverse(int[] iarr) {
		int [] iaNew = new int[iarr.length];
		for(int index = 0; index < iaNew.length; index++) {
			iaNew[index] = iarr[iarr.length-1 -index];
		}
		return iaNew;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = 8;
		char[] letters = new char[length];
		int [] numbers = new int[length];
		letters[0] = 'a';
		letters[1] = 'b';
		letters[2] = 'c';
		letters[3] = 'a';
		letters[4] = 'c';
		letters[5] = 'a';
		letters[6] = 'b';
		letters[7] = 'c';
		
		numbers[0] = 1;
		
		String s1 = "Hallo!";
		char[] carr4 = stringToCharArray(s1);
		
		char[] carr5 = filter(letters, 'c');
		
	//	int[] iarr2 = minAndMax(iarr1);
		int[] iarr3 = {4};
		
		int[] iarr4 = reverse(numbers);
		
		
		
		System.out.println("--------------------1-------------------");
		System.out.println();
		print(letters); 
		
		System.out.println();
		System.out.println("--------------------2-------------------");
		System.out.println();
		print(numbers); 
		
		System.out.println();
		System.out.println("--------------------3-------------------");
		System.out.println();
		print(carr4);
		
		System.out.println();
		System.out.println("--------------------4-------------------");
		System.out.println();
		print(letters);
		print(carr5);
		
		System.out.println();
		System.out.println("--------------------5-------------------");
		System.out.println();
	//	print(iarr2);
		
		System.out.println();
		System.out.println("--------------------6-------------------");
		System.out.println();
		print(numbers);
	}

}
