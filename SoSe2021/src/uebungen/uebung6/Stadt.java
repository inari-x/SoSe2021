package uebungen.uebung6;

import java.util.*;

public class Stadt implements Comparable {
	
	String name;
	List<Integer> bevoelkerung;
	float flaeche;
	
	public Stadt(String name, List<Integer> bevoelkerung, float flaeche) {
		this.name = name;
		this.bevoelkerung = bevoelkerung;
		this.flaeche = flaeche;
	}
	
	void print() {
		System.out.printf("%-15s %9.2f km2 ", this.name, this.flaeche);
		for(Integer el : this.bevoelkerung) {
			System.out.printf("%,10d", el); 
		}
		System.out.println();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if(this.getClass()!=o.getClass()) return false;
		
		Stadt stadt = (Stadt)o;
		
		return this.name.equals(stadt.name);
	}
	 
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public int compareTo(Object o) {
		Stadt stadt = (Stadt)o;
		return this.name.compareTo(stadt.name);
	}

}
