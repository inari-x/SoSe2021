package uebungen.uebung11;

import java.util.Random;

public class Testklasse {

	public static void main(String[] args) {
		
		Punkt2D[] pa = new Punkt2D[3];
		Random r = new Random();
		int anz2D = 0;
		while(anz2D < 3) {
			int x = r.nextInt(10);
			int y = r.nextInt(10);
			int z = r.nextInt(10);
			Punkt3D p;
			if(z == 0) {
				pa[anz2D] = new Punkt2D(x, y);
				pa[anz2D].print();
				anz2D++;
			}
			else {
				p = new Punkt3D(x,y,z);
				p.print();
			}
			
		}
		
		 System.out.printf("%n%n-------------------- Strecke -----------------------%n%n");
	        Strecke s1 = new Strecke(pa[0], pa[1]);
	        Strecke s2 = new Strecke(pa[1], pa[2]);
	        Strecke s3 = new Strecke(pa[2], pa[0]);
	        s1.print();
	        s2.print();
	        s3.print();

	}
	

}
