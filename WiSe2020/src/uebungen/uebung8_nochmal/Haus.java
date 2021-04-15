package uebungen.uebung8_nochmal;

import java.util.Random;

public class Haus {
	
	private Wohnung[] wohnungen;
	
	public Wohnung neueWohnung() {
		Random r = new Random();
			int qm = r.nextInt(5) * 20 + 20;
			int anzZimmer = r.nextInt(5) + 1;
			int etage = r.nextInt(6);
			double qmMiete = r.nextInt(10)*0.5 + 8.0;
			return new Wohnung(qm, anzZimmer, etage, qmMiete);
	}
	
	public Haus(int anzWohnungen) {
		this.wohnungen = new Wohnung[anzWohnungen];
		for (int i = 0; i < this.wohnungen.length; i++) {
			this.wohnungen[i] = this.neueWohnung();
		}
	}
	
	public void print() {
		System.out.println("Das Haus besteht aus: ");
		for (int i = 0; i < this.wohnungen.length; i++) {
			this.wohnungen[i].print();
		}
	}
	
	public Wohnung[] wohnungenInEtage(int etage) {
		int anzWohnungenInEtage = 0;
		for (int i = 0; i < this.wohnungen.length; i++) {
			if(this.wohnungen[i].getEtage()== etage) {
				anzWohnungenInEtage++;
			}
		}
		Wohnung[] wohnungenInEtage = new Wohnung[anzWohnungenInEtage];
		int indexW = 0;
		for (int i = 0; i < this.wohnungen.length; i++) {
			if(this.wohnungen[i].getEtage() == etage) {
				wohnungenInEtage[indexW] = this.wohnungen[i];
				indexW++;
			}
		}
		return wohnungenInEtage;
	}
	
	public void print(Wohnung[] warr) {
		for (int i = 0; i < warr.length; i++) {
			warr[i].print();
		}
	}
	
	public Wohnung teuersteWohnung() {
		int indexMax = 0;
		for (int i = 0; i < this.wohnungen.length; i++) {
			if(this.wohnungen[i].teuerer(this.wohnungen[indexMax])) {
				indexMax = i;
			}
		}
		return this.wohnungen[indexMax];
	}
	
	public double gesamtMieteHaus() {
		double summe = 0.0;
		for (int i = 0; i < this.wohnungen.length; i++) {
			summe += this.wohnungen[i].gesamtMiete();
		}
		return summe;
	}
	
	public void sortieren() {
		for(int bubble = 1; bubble < this.wohnungen.length; bubble++) {
			for (int index = 0; index < this.wohnungen.length - bubble; index++) {
				if(this.wohnungen[index].teuerer(this.wohnungen[index+1])) {
					Wohnung tmp = this.wohnungen[index];
					this.wohnungen[index] = this.wohnungen[index+1];
					this.wohnungen[index+1] = tmp;
				}
			}
		}
	}
	
}
