package uebungen.uebung9;

public class Speisekarte {

	private Pizza[] angebot;
	
	public Speisekarte()  {
		
		this.angebot = new Pizza[0];
	}
	
	public int getLength() {
		
		return this.angebot.length;
	}
	
	public void pizzaHinzufuegen(Pizza pizza) {
		
		Pizza[] copy = new Pizza[this.angebot.length + 1];
		
		for(int index = 0; index < this.angebot.length; index++) {
			copy[index] = this.angebot[index];
		}
		copy[copy.length - 1] = pizza;
		this.angebot = copy;
	}
	
	public boolean pizzaIstImAngebot(Pizza pizza) {
		for(int index = 0; index < this.angebot.length; index++) {
		
			if(this.angebot[index].equals(pizza)) {
				return true;
			}
		}
		return false;
	}
	
	public void pizzaLoeschen(Pizza pizza) {
		if(this.pizzaIstImAngebot(pizza)) {
			Pizza[] kopie = new Pizza[this.angebot.length - 1];
            int indexKopie = 0;
            for (int indexAngebot = 0; indexAngebot < this.angebot.length; indexAngebot++)
            {
                if(!this.angebot[indexAngebot].equals(pizza))
                {
                    kopie[indexKopie] = this.angebot[indexAngebot];
                    indexKopie++;
                }
            }
            this.angebot = kopie;
        }
    }
	
	 public Pizza getPizzaAtIndex(int index)
	    {
	        if(index>=0 && index<this.angebot.length)
	        {
	            return this.angebot[index];
	        }
	        else
	        {
	            return null;
	        }
	    }

	@Override
	public String toString() {
		String s = String.format("====== Speisekarte ======%n");
        for (int index = 0; index < this.angebot.length; index++)
        {
            s = s + String.format("%-15s %.2f Euro %n", 
                    this.angebot[index].getName(), this.angebot[index].getPreis());
        }
        return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
