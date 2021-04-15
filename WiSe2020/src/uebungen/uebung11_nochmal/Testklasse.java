package uebungen.uebung11_nochmal;

import java.util.Random;

public class Testklasse {

	public static void main(String[] args) {
		Punkt2D[] pa = new Punkt2D[3];
		Random r = new Random();
		int anzahl = 0;
		while(anzahl <3) {
			int x = r.nextInt(10);
			int y = r.nextInt(10);
			int z = r.nextInt(10);
			Punkt3D p;
			if(z == 0) {
				pa[anzahl] = new Punkt2D(x, y);
				pa[anzahl].print();
				anzahl++;
			}
			else {
				p = new Punkt3D(x,y,z);
				p.print();
			}
		}
		
		Strecke s1 = new Strecke(pa[0], pa[1]);
		Strecke s2 = new Strecke(pa[1], pa[2]);
		Strecke s3 = new Strecke(pa[2], pa[0]);
		s1.print();
		s2.print();
		s3.print();
		
		System.out.printf("%n%n------------------ PunkteArray ---------------------%n%n");
        PunkteArray parr = new PunkteArray(15);
        parr.fillArray();
        parr.print();
        parr.printStrecken();
	}
}