package ProbeklausurComputer;

public class Notebook extends Computer {
	
	protected int monitor;
	
	public Notebook(String hersteller, int ram, int platte, int monitor) {
		
		super(hersteller, ram, platte);
		this.monitor = monitor;
	}
	
	@Override
	public String toString() {
		String s = "";
		s = String.format("(%s, %d, %d, %d)%n", this.getHersteller(), this.getRam(), this.getPlatte(), this.monitor);
		return s;
	}
}
