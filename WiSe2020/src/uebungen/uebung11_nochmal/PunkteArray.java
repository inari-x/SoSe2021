package uebungen.uebung11_nochmal;

import java.util.Random;

public class PunkteArray {
	
	private Punkt2D[] punkte;
	
	public PunkteArray(int anzahl) {
		this.punkte = new Punkt2D[anzahl];
	}
	
	public boolean contains(Punkt2D p) {
		for (int i = 0; i < this.punkte.length; i++) {
			if(this.punkte[i] != null && this.punkte[i].equals(p)) return true;
		}
		return false;
	}
	
	public void fillArray() {
		Random r = new Random();
		for (int i = 0; i < this.punkte.length; i++) {
			int x = r.nextInt(10);
			int y = r.nextInt(10);
			Punkt2D p = new Punkt2D(x,y);
			while(this.contains(p)) {
				x = r.nextInt(10);
				y = r.nextInt(10);
				p = new Punkt2D(x,y);
			}
			this.punkte[i] = p;
		}
	}
	
	@Override
	public String toString() {
		String s = "[ ";
        for(int index=0; index < this.punkte.length; index++)
        {
            if(index<this.punkte.length-1)
            {
                s += this.punkte[index].toString() + ", ";
            }
            else
            {
                s += this.punkte[index].toString();
            }
        }
        s += " ]";
        return s;
	}
	
	 public void print()
	    {
	        System.out.println(this.toString());
	    }

	 public Strecke[] createPolygon()
	    {
	        Strecke[] polygon = new Strecke[this.punkte.length];
	        for(int index=0; index < this.punkte.length-1; index++)
	        {
	            polygon[index] = new Strecke(this.punkte[index], this.punkte[index+1]);
	        }
	        int index = this.punkte.length-1;
	        polygon[index] = new Strecke(this.punkte[index], this.punkte[0]);
	        return polygon;
	    }

	    public void printStrecken()
	    {
	        Strecke[] polygon = this.createPolygon();
	        for(int index=0; index < polygon.length; index++)
	        {
	            polygon[index].print();
	        }
	        System.out.printf("Gesamtlaenge der Strecken : %7.4fcm %n", this.gesamtLaenge());
	        System.out.printf("am weitesten links        : %s %n", this.amWeitestenLinks().toString());
	        System.out.printf("am weitesten oben         : %s %n", this.amWeitestenOben().toString());
	        System.out.printf("laengste                  : %s %n", this.laengsteStrecke().toString());

	    }

	    public double gesamtLaenge()
	    {
	        Strecke[] polygon = this.createPolygon();
	        double gesamtLaenge = 0.0;
	        for(int index=0; index < polygon.length; index++)
	        {
	            gesamtLaenge += polygon[index].laenge();
	        }
	        return gesamtLaenge;
	    }

	    public Punkt2D amWeitestenLinks()
	    {
	        int indexLinks = 0;
	        for(int index=0; index < this.punkte.length-1; index++)
	        {
	            if(this.punkte[index].xIsSmaller(this.punkte[indexLinks]))
	            {
	                indexLinks = index;
	            }
	        }
	        return this.punkte[indexLinks];
	    }

	    public Punkt2D amWeitestenOben()
	    {
	        int indexOben = 0;
	        for(int index=0; index < this.punkte.length-1; index++)
	        {
	            if(this.punkte[index].yIsSmaller(this.punkte[indexOben]))
	            {
	                indexOben = index;
	            }
	        }
	        return this.punkte[indexOben];
	    }

	    public Strecke laengsteStrecke()
	    {
	        Strecke[] polygon = this.createPolygon();
	        int indexLaengste = 0;
	        for(int index=0; index < polygon.length; index++)
	        {
	            if(polygon[index].laenge() > polygon[indexLaengste].laenge())
	            {
	                indexLaengste = index;
	            }
	        }
	        return polygon[indexLaengste];
	    }
	
	
    
}
