package uebungen.uebung7;

import java.util.*;

public class Stadt implements Comparable<Stadt> {
	 	String name;
	    List<Integer> bevoelkerung;
	    float flaeche;

	 public Stadt(String name, List<Integer> bevoelkerung, float flaeche) {
		 super();
	     this.name = name;
	     this.bevoelkerung = bevoelkerung;
	     this.flaeche = flaeche;
	 }

	 void print() {
	     System.out.printf("%-15s %9.2f km2 ", name, flaeche);
	     for(Integer i : bevoelkerung) {
	        System.out.printf("%,12d", i);
	     }
	     System.out.println();
	 }

	 @Override
	 public boolean equals(Object o) {
	     if(o==null) return false;
	     if(o==this) return true;
	     if(this.getClass()!=o.getClass()) return false;

	     Stadt other = (Stadt)o;
	     return (this.name.equals(other.name));
	 }

	 @Override
	 public int hashCode() {
	    return this.name.hashCode();
	 }
	 
	
//	@Override
//	public int compareTo(Stadt o) {
//		return this.name.compareTo(o.name);
//	}
	 
//	@Override
//	public int compareTo(Stadt o) {
//		return o.name.compareTo(this.name);
//	}
	 
	 
	//nimmt koeln raus und ich weiss nicht wieso
	@Override
	public int compareTo(Stadt o) {
		if(this.flaeche < o.flaeche) {
			return 1;
		}
		else if(this.flaeche > o.flaeche) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	

}
