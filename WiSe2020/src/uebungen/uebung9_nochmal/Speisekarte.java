package uebungen.uebung9_nochmal;

public class Speisekarte {
	private Pizza[] angebot;
	
	public Speisekarte() {
		this.angebot = new Pizza[0];
	}
	
	public void pizzaHinzufuegen(Pizza pizza) {
		Pizza[] kopie = new Pizza[this.angebot.length + 1];
		for (int i = 0; i < this.angebot.length; i++) {
			kopie[i] = this.angebot[i];
		}
		kopie[kopie.length - 1] = pizza;
		this.angebot = kopie;
	}
	
	public int getLength() {
		return this.angebot.length;
	}
	
	public boolean pizzaIstImAngebot(Pizza pizza) {
		for (int i = 0; i < this.angebot.length; i++) {
			if(this.angebot[i].equals(pizza)) return true;
		}
		return false;
	}
	
	public void pizzaLoeschen(Pizza pizza) {
		if(this.pizzaIstImAngebot(pizza)) {
			Pizza[] kopie = new Pizza[this.angebot.length -1];
			int indexK = 0;
			for (int indexA = 0; indexA < this.angebot.length; indexA++) {
				if(!this.angebot[indexA].equals(pizza)) {
					kopie[indexK] = this.angebot[indexA];
					indexK++;
				}
			}
		this.angebot = kopie;
		}
	}
	
	public Pizza getPizzaAtIndex(int index) {
		if(index >= 0 && index < this.angebot.length) {
			return this.angebot[index];
		}
		else {
			return null;
		}
	}
	
	@Override
	public String toString() {
		String s = " ===== Speisekarte =====";
		for(int index = 0; index < this.angebot.length; index++) {
			s = s+ String.format("%-15s %.2f Euro %n", this.angebot[index].getName(), this.angebot[index].getPreis());
		}
		return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
