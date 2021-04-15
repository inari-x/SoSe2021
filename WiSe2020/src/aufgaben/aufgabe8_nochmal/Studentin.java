package aufgaben.aufgabe8_nochmal;

public class Studentin extends Mensch{
	private int semester;
	private String studiengang;
	
	public Studentin(String name, int alter, String studiengang) {
		super(name, alter);
		this.studiengang = studiengang;
		this.semester = 1;
	}
	
	@Override
	public String toString() {
		return "(" + this.getName() + ", " + this.getAlter() + ", " + this.studiengang + ", " + this.semester + ")";
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
