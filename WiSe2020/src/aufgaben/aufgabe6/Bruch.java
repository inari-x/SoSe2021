package aufgaben.aufgabe6;

public class Bruch {
	
	private int zaehler;
	private int nenner;

	public Bruch() {
		zaehler = 1;
		nenner = 1;
	}
	
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	public Bruch plus(Bruch b) {
		int gleicherNenner = this.nenner * b.nenner;
		
		int gleicherZaehler1 = this.zaehler * b.nenner;
		int gleicherZaehler2 = b.zaehler * this.nenner;
		
		int neuZaehler = gleicherZaehler1 + gleicherZaehler2;
		
		Bruch simplified = new Bruch(neuZaehler, gleicherNenner);
		while(neuZaehler % 2 == 0 && gleicherNenner % 2 == 0) {
			
			neuZaehler = neuZaehler / 2;
			gleicherNenner = gleicherNenner / 2;
			simplified = new Bruch (neuZaehler, gleicherNenner);
		}
		//	System.out.println(this  + " + " + b + " = " + Simplified);
		
		return simplified;
		
		
	}
	
	public Bruch minus(Bruch b) {
		int gleicherNenner = this.nenner * b.nenner;
		
		int gleicherZaehler1 = this.zaehler * b.nenner;
		int gleicherZaehler2 = b.zaehler * this.nenner;
		
		int neuZaehler = gleicherZaehler1 - gleicherZaehler2;
		
		Bruch simplified = new Bruch(neuZaehler, gleicherNenner);
		while(neuZaehler % 2 == 0 && gleicherNenner % 2 == 0) {
			
			neuZaehler = neuZaehler / 2;
			gleicherNenner = gleicherNenner / 2;
			simplified = new Bruch (neuZaehler, gleicherNenner);
		}
		//	System.out.println(this  + " + " + b + " = " + simplified);
		
		return simplified;
	}
	
	public Bruch mal(Bruch b) {
		int gleicherNenner = this.nenner * b.nenner;
		
		int gleicherZaehler = this.zaehler * b.zaehler;
		
		Bruch simplified = new Bruch(gleicherZaehler, gleicherNenner);
		
		while(gleicherZaehler % 2 == 0 && gleicherNenner % 2 == 0) {
			
			gleicherZaehler = gleicherZaehler / 2;
			gleicherNenner = gleicherNenner / 2;
			simplified = new Bruch (gleicherZaehler, gleicherNenner);
		}
		//	System.out.println(this  + " + " + b + " = " + simplified);
		
		return simplified;
	}
	
	public Bruch geteilt(Bruch b) {
		int gleicherNenner = this.nenner * b.zaehler;
		
		int gleicherZaehler = this.zaehler * b.nenner;
		
		Bruch simplified = new Bruch(gleicherZaehler, gleicherNenner);
		
		while(gleicherZaehler % 2 == 0 && gleicherNenner % 2 == 0) {
			
			gleicherZaehler = gleicherZaehler / 2;
			gleicherNenner = gleicherNenner / 2;
			simplified = new Bruch (gleicherZaehler, gleicherNenner);
		}
		
		return simplified;
	}
	
	public Bruch kuerzen() {

		Bruch simplified = new Bruch(zaehler, nenner);
		while(zaehler != nenner) {
			if(zaehler > nenner) {
				zaehler = zaehler - nenner;
			}
			else {
				nenner = nenner - zaehler;
			}
		}
		return simplified;
		
	}
	
	public String toString() {
		
		return this.zaehler + "/" + this.nenner ;
	}
	
	public boolean istGroesser(Bruch b) {
		boolean gross = false;
		if((this.zaehler%this.nenner) > (b.zaehler%b.nenner)) {
			gross = true;
		}
		return gross;
	}
	
	public boolean istKleiner(Bruch b) {
		boolean kleiner = false;
		if((this.zaehler%this.nenner) < (b.zaehler%b.nenner)) {
			kleiner = true;
		}
		return kleiner;
	}
	
	public boolean istGleich(Bruch b) {
		boolean gleich = false;
		if((this.zaehler%this.nenner) == (b.zaehler%b.nenner)) {
			gleich = true;
		}
		return gleich;
	}
	
	
}
