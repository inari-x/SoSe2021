package aufgaben.aufgabe6_nochmal;


public class Bruch {
	
	private int zaehler;
	private int nenner;
	
	public Bruch() {
		this.zaehler = 1;
		this.nenner = 1;
	}

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	public Bruch plus(Bruch b) {
		int gleicherNenner = this.nenner*b.nenner;
		int gleicherZaehler1 = this.zaehler*b.zaehler;
		int gleicherZaehler2 = b.zaehler*this.zaehler;
		int neuerZaehler = gleicherZaehler1 + gleicherZaehler2;
		Bruch simplified = new Bruch(neuerZaehler, gleicherNenner);
		while(neuerZaehler % 2 == 0 && gleicherNenner % 2 == 0) {
			
			neuerZaehler = neuerZaehler / 2;
			gleicherNenner = gleicherNenner / 2;
			simplified = new Bruch (neuerZaehler, gleicherNenner);
		}
		return simplified;
	}
	
	public Bruch minus(Bruch b) {
		int gleicherNenner = this.nenner*b.nenner;
		int gleicherZaehler1 = this.zaehler*b.zaehler;
		int gleicherZaehler2 = b.zaehler*this.zaehler;
		int neuerZaehler = gleicherZaehler1 - gleicherZaehler2;
		Bruch simplified = new Bruch(neuerZaehler, gleicherNenner);
		while(neuerZaehler % 2 == 0 && gleicherNenner % 2 == 0) {
			
			neuerZaehler = neuerZaehler / 2;
			gleicherNenner = gleicherNenner / 2;
			simplified = new Bruch (neuerZaehler, gleicherNenner);
		}
		return simplified;
	}
	
	public Bruch mal(Bruch b) {
		int gleicherNenner = this.nenner*b.nenner;
		int gleicherZaehler1 = this.zaehler*b.zaehler;
		int gleicherZaehler2 = b.zaehler*this.zaehler;
		int neuerZaehler = gleicherZaehler1 * gleicherZaehler2;
		Bruch simplified = new Bruch(neuerZaehler, gleicherNenner);
		while(neuerZaehler % 2 == 0 && gleicherNenner % 2 == 0) {
			
			neuerZaehler = neuerZaehler / 2;
			gleicherNenner = gleicherNenner / 2;
			simplified = new Bruch (neuerZaehler, gleicherNenner);
		}
		return simplified;
	}
	
	public Bruch geteilt(Bruch b) {
		int gleicherNenner = this.nenner*b.nenner;
		int gleicherZaehler1 = this.zaehler*b.zaehler;
		int gleicherZaehler2 = b.zaehler*this.zaehler;
		int neuerZaehler = gleicherZaehler1 / gleicherZaehler2;
		Bruch simplified = new Bruch(neuerZaehler, gleicherNenner);
		while(neuerZaehler % 2 == 0 && gleicherNenner % 2 == 0) {
			
			neuerZaehler = neuerZaehler / 2;
			gleicherNenner = gleicherNenner / 2;
			simplified = new Bruch (neuerZaehler, gleicherNenner);
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
