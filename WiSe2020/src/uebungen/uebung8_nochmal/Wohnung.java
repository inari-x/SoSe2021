package uebungen.uebung8_nochmal;

public class Wohnung {
	private int qm;
	private int anzZimmer;
	private int etage;
	private double qmMiete;
	
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
		return this.qm*this.qmMiete;
	}
	
	public boolean billiger(Wohnung w) {
		return (this.gesamtMiete() < w.gesamtMiete());
	}
	
	public boolean teuerer(Wohnung w) {
		return (this.gesamtMiete() > w.gesamtMiete());
	}
	
	
	public String toString() {
		String s = " ";
		if(this.etage > 0) {
			s = String.format("%d-Zimmer Wohnung mit %2d qm in der %d. Etage. Monatliche Miete: %.2f Euro.",this.anzZimmer, this.qm, this.etage, this.gesamtMiete());
		}
		else {
			s = String.format("%d-Zimmer Wohnung mit %2d qm im Erdgeschoss. Monatliche Miete: %.2f Euro.",this.anzZimmer, this.qm, this.gesamtMiete());
		}
		return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
		
	
	
	

}
