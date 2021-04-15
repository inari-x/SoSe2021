package aufgaben.aufgabe8;

public class Studentin extends Mensch {
	
	private int semester;
	private String studiengang;
	
	public Studentin(String name, int alter, String studiengang) {
		
		super(name, alter);
		this.studiengang = studiengang;
		this.semester = 1;
		
	}
	
	@Override
	public String toString() {
		String s = "";
		s = String.format("(%s, %d, %s, %d) %n", this.getName(), this.getAlter(), this.studiengang, this.semester);
		
		return s;
	}

}
