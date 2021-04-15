package uebungen.uebung6;

public class Konto {
	
	private double guthaben;
	private int pin;
	private double neuesGuthaben;
	private double dispogrenze;

	public Konto(int pPin) {
		pin = pPin;
		guthaben = 0.0;
		dispogrenze = -1000.0;
		
	
	}
	
	public void einzahlen(double betrag) {
		
		neuesGuthaben += (guthaben + betrag);
		
		System.out.printf("Es wurden "  + "%.2f " + "Euro eingezahlt. %n", neuesGuthaben);
	}
	
	public void kontoauszug(int pPin) {
		if(pPin == pin) {
			System.out.printf("Ihr aktuelles Guthaben betraegt " + "%.2f " + "Euro. %n", neuesGuthaben);
		}
		else {
			System.out.printf("Falsche PIN! %n");
		}
	}
	
	public void auszahlen(int pPin, double betrag) {
		if(pPin != pin) {
			System.out.printf("Falsche PIN! %n");
		}
		else {
			if(neuesGuthaben < betrag && betrag < dispogrenze)  {
				System.out.printf("Ihr Guthaben reicht nicht, um " + "%.2f " + "Euro auszuzahlen. %n", betrag);
			}
	
			if(neuesGuthaben >= betrag && betrag > dispogrenze) {
				neuesGuthaben += (guthaben - betrag);
				System.out.printf("Es wurden " + "%.2f " + "Euro ausgezahlt %n", betrag);
			}
			}
	}
	
	public void zinsenZahlen() {
		double DISPOZINSEN = 12.0;
		double GUTHABENZINSEN = 0.5;
		
		if(neuesGuthaben < 0) {
			neuesGuthaben -= (neuesGuthaben*DISPOZINSEN);
			System.out.printf("Ihnen wurden " + "%.2f " + "Euro Zinsen abgebucht.", (neuesGuthaben*DISPOZINSEN));
		}
		if(neuesGuthaben >= 0) {
			neuesGuthaben += (neuesGuthaben*GUTHABENZINSEN);
			System.out.printf("Ihnen wurden " + "%.2f " + "Euro Zinsen abgebucht.", (neuesGuthaben*GUTHABENZINSEN));
		}
	}
 }


