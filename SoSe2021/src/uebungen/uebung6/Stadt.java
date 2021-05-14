package uebungen.uebung6;

import java.util.*;

public class Stadt {
	
	String name;
	List<Integer> bevoelkerung;
	float flaeche;
	
	public Stadt(String name, List<Integer> bevoelkerung, float flaeche) {
		this.name = name;
		this.bevoelkerung = bevoelkerung;
		this.flaeche = flaeche;
	}
	
	public void print() {
		System.out.println(this.name + "    " + this.flaeche + " km2 " + this.bevoelkerung + "  ");
		for(Integer i : this.bevoelkerung) {
			System.out.println(i);
		}
		
	}

}
