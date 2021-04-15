package probeklausur_power;

public class Power {
	
	private int base;
	private int exp;
	
	public int getBase() {
		
		return this.base;
	}
	
	public int getExp() {
		
		return this.exp;
	}
	
	public Power(int base, int exp) {
		
		this.base = base;
		this.exp = exp;
	}
	
	public double getValue() {
		
		double value = 1.0;
		if(exp >= 0) {
			for(int i = 1; i <= this.exp; i++) {
				value *= this.base;
			}
		}
		else {
			for(int i = 1; i <= -this.exp; i++) {
				value *= this.base;
			}
			value = 1.0/value;
		}
		return value;
	}
	
	@Override
	public String toString() {
		return "("+this.base+","+this.exp+")";
	}
	
	public void print() {
		System.out.println(this.toString());
	}

}
