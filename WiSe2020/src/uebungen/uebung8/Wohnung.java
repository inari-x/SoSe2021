package uebungen.uebung8;

public class Wohnung {

	protected int qm;
	protected int anzZimmer;
	protected int etage;
	protected double qmMiete;
	
	
	public Wohnung(int qm, int anzZimmer, int etage, double qmMiete) {
		
		this.qm = qm;
		this.anzZimmer = anzZimmer;
		this.etage = etage;
		this.qmMiete = qmMiete;
	}
	
	public int getQm() {
		
		return this.qm;
	}
	
	public int getAnzZimmer() {
		
		return this.anzZimmer;
	}
	
	public int getEtage() {
		
		return this.etage;
	}
	
	public double getQmMiete() {
		
		return this.qmMiete;
	}
	
	
	public double gesamtMiete() {
		
		return this.qm * this.qmMiete;
	}
	
	public boolean billiger(Wohnung w) {
		boolean billig = false;
		if(this.gesamtMiete() < w.gesamtMiete()) {
			billig = true;
		}	
		return billig;
	}
	
	public boolean teurer(Wohnung w) {
		boolean teuer = false;
		if(this.gesamtMiete() > w.gesamtMiete()) {
			teuer = true;
		}
		return teuer;
	}
	
	public String toString() {
		String satz = "";
		if(this.etage == 0) {
			satz = String.format("%d-Zimmer Wohnung mit %d qm im Erdgeschoss. Monatliche Miete: %.2f Euro %n", this.anzZimmer, this.qm, this.gesamtMiete());
		}
		else {
			satz = String.format("%d-Zimmer Wohnung mit %d qm in der %d Etage. Monatliche Miete: %.2f Euro %n", this.anzZimmer, this.qm, this.etage, this.gesamtMiete());
			}
		return satz;
	}
	
	public void print() {
		
		System.out.print(toString());
	}
		
	
}
