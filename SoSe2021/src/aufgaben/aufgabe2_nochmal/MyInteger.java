package aufgaben.aufgabe2_nochmal;

public class MyInteger {
	
	static int MAX_VALUE = Integer.MAX_VALUE;
	static int MIN_VALUE = Integer.MIN_VALUE;
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public MyInteger(String s) {
		this.value = parseInt(s);
	}

	 private static boolean isDigit(char c)
	    {
	        return (c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' ||
	                c=='6' || c=='7' || c=='8' || c=='9');
	    }

	    private static int charToInt(char c)
	    {
	        int asciivalue = c;
	        int intvalue = asciivalue-48; // 0 ist 048 bis 9 ist 057
	        return intvalue;
	    }
	    
	public static int parseInt(String s) throws IllegalArgumentException {
		boolean negative = false;
		if(s.length()==0) throw new IllegalArgumentException("leer");
		if(s.charAt(0)=='-') {
			s = s.substring(1);
			negative = true;
		}
		if(s.length()==0) throw new IllegalArgumentException("nur '+' bzw. '-' --> keine Zahl");
		while(s.charAt(0)=='0') {
			s = s.substring(1);
		}
		for(int i = 0; i <s.length(); i++) {
			if(!isDigit(s.charAt(i))) throw new IllegalArgumentException("keine Zahl");
		}
		int exponent = 0;
		int zahl = 0;
		for(int i = s.length()-1; i>= 0; i--) {
			zahl = zahl + charToInt(s.charAt(i))*(int)Math.pow(10, exponent);
		}
		if(negative) return -zahl;
		else return zahl;	
	}
	
	public int intValue() {
		return this.value;
	}
	
	public double doubleValue() {
		return this.value;
	}
	
	public static MyInteger valueOf(String s) throws IllegalArgumentException {
		return new MyInteger(s);
	}
	
	public static MyInteger valueOf(int value) {
		return new MyInteger(value);
	}

	@Override
    public boolean equals(Object other)
    {
        if(other == null) return false;
        if(this == other) return true; 
        if(this.getClass() != other.getClass()) return false;   

        MyInteger otherInt = (MyInteger)other;  
        return (this.value == otherInt.value); 
    }

    @Override
    public int hashCode()
    {
        return this.value;
    }

    @Override
    public String toString()
    {
        return value+"";
    }

    public static int compare(int x, int y)
    {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    public int compareTo(MyInteger otherMyInteger)
    {
        return compare(this.value, otherMyInteger.value);
    }
	

}
