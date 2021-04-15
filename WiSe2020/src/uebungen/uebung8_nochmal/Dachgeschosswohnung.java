package uebungen.uebung8_nochmal;

public class Dachgeschosswohnung extends Wohnung {

	public Dachgeschosswohnung(int qm, int anzZimmer, double qmMiete) {
		super(qm, anzZimmer, 5, qmMiete);
	}
	
	@Override
	public String toString() {
		String s = String.format("%d-Zimmer DG-Wohnung mit %3d qm in der %d. Etage. Monatliche Miete: %.2f Euro.", this.getAnzZimmer(), this.getQm(), this.getEtage(), this.gesamtMiete());
		return s;
	}
}
