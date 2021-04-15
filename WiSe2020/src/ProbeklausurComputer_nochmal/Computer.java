package ProbeklausurComputer_nochmal;

public class Computer {
	protected String hersteller;
	protected int ram;
	protected int platte;
	
	public Computer(String hersteller, int ram, int platte) {
		this.hersteller = hersteller;
		this.ram = ram;
		this.platte = platte;
	}
	
	public String getHersteller() {
		return this.hersteller;
	}

	public int getRam() {
		return this.ram;
	}

	public int getPlatte() {
		return this.platte;
	}

	public boolean gleicherHersteller(Computer c) {
		return this.hersteller == c.hersteller;
	}
	
	public boolean gleicherHersteller(String hersteller) {
		return this.hersteller.equals(hersteller);
	}
	
	@Override
	public String toString() {
		return this.hersteller + " mit " + this.ram + " RAM und " + this.platte + " SSD";
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
