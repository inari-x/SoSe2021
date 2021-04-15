package klausur;

public class Welt {
	
	private Kontinent[] kontinente;
	
	public Welt(Kontinent[] kontinente) {
		this.kontinente = kontinente;
	}
	
	public Land[] getAlleLaender() {
		for (int i = 0; i < this.kontinente.length; i++) {
			
		}
	}
	
	public void printAlleLaender(Land[] alleLaender) {
		for (int i = 0; i < alleLaender.length; i++) {
			alleLaender.toString();
		}
	}
	
	public boolean enthaeltDoppel() {
		return this.kontinente.getName().equals(this.kontinente.getName());
	}
	
	public int groesstesLand() {
		int max = 0;
		for (int i = 0; i < kontinente.length; i++) {
			if(kontinente[i] > max[i]) {
				kontinente[i] = max[i];
			}
			kontinente = max;
		}
		return kontinente;
	}
	
	public Land[] alleLaenderGroesserAls(int groesse) {
		int vorkommen = 0
		for (int i = 0; i < kontinente.length; i++) {
			if(this.kontinenten.getGroesse > groesse) {
				vorkommen++;
				i++;
			}
		}
		Land[] kopie = new Land[vorkommen];
		for (int j = 0; j < kontinente.length; j++) {
			kontinente[0] =
		}
	}

}
