package aufgaben.aufgabe8;

/*
 * @Katrin Malfent
 */

public class Mensch {
	
	private String name;
	private int alter;
	
	public Mensch(String name, int alter) {
		
		this.name = name;
		this.alter = alter;
		
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public int getAlter() {
		
		return this.alter;
	}
	
	public int geburtstag() {
		
		return alter++;
	}
	
	public String toString() {
		String s = "";
		s = String.format("%s ist %d Jahre alt.%n", this.name, this.alter);
		
		return s;
	}
	
	public void print() {
		
		System.out.print(toString());
	}

}
