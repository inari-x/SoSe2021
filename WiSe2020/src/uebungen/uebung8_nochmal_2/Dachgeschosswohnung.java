package uebungen.uebung8_nochmal_2;

public class Dachgeschosswohnung extends Wohnung{
	
	 public Dachgeschosswohnung(int qm, int anzZimmer, double qmMiete)
	    {
	        super(qm, anzZimmer, 5, qmMiete);   // Konstruktor Wohnung
	    }

	    @Override
	    public String toString()
	    {
	        String s= "";
	        s = String.format("%d-Zimmer Wohnung mit %d qm in der %d. Etage. Monatliche Miete: %.2f Euro", 
	                this.getAnzZimmer(), this.getQm(), this.getEtage(), this.gesamtMiete() );
	        return s;
	    }
}
