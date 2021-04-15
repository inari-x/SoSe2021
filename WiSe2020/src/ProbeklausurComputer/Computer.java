package ProbeklausurComputer;

public class Computer {
	
	protected String hersteller;
	protected int ram;
	protected int platte;
	
	public String getHersteller()
    {
        return this.hersteller;
    }
    public int getRam()
    {
        return this.ram;
    }
    public int getPlatte()
    {
        return this.platte;
    }
	
	public Computer(String hersteller, int ram, int platte) {
		this.hersteller = hersteller;
		this.ram = ram;
		this.platte = platte;
	}
	
	public boolean gleicherHersteller(Computer c) {
		return this.hersteller.equals(c.hersteller);
	}
	
	public boolean gleicherHersteller(String hersteller) {
		return this.hersteller.equals(hersteller);
	}
	
	@Override
	public String toString() {
		String s = "";
		s = String.format("lenovo mit %d RAM und %d SSD%n", this.ram, this.platte);
		return s;
	}
	
	public void print() {
		System.out.print(this.toString());
	}

}
