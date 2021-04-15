package video.vererbung;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Viereck v1 = new Viereck(10, 20, 30, 40);
		v1.print();
		
		Viereck v2 = new Viereck(15, 20, 25, 20);
		v2.print();
		
		Rechteck r1 = new Rechteck(10, 20);
		r1.print();
		System.out.println("Umfang  : " + r1.umfang());
		System.out.println("Flächeninhalt  : " + r1.flaecheninhalt());
		
		Quadrat q1 = new Quadrat(15);
		q1.print();
		
		System.out.printf("%n%n----------------------Objekte der Klassen----------------------------%n%n");
		
		System.out.println(v1.getClass());
		System.out.println(r1.getClass());
		System.out.println(q1.getClass());
		
		Viereck v3 = new Rechteck(15, 25);
		System.out.println(v3.getClass());
		v3 = new Quadrat(18);
		System.out.println(v3.getClass());
		
		Viereck[] va = new Viereck[3];
		va[0] = new Viereck(11, 21, 31, 41);
		va[1] = new Rechteck(11, 21);
		va[2] = new Quadrat(11);
		
		for(int index = 0; index < va.length; index++) {
			va[index].print();
			System.out.println(va[index].getClass());
		}
		
		((Quadrat)v3).flaecheninhalt();
//		Quadrat q2 = (Quadrat)v3; 
//		System.out.println(q2.flaecheninhalt());
		
		Rechteck q2 = (Rechteck)v3;
		System.out.println(q2.flaecheninhalt());
		
		Object o = new Quadrat(15);
		System.out.println(o.getClass());
		
		if(o instanceof Object) {
			System.out.println("Object");
		}
		if(o instanceof Quadrat) {
			System.out.println("Quadrat");
		}
		if(o instanceof Viereck) {
			System.out.println("Viereck");
		}
		if(o instanceof Rechteck) {
			System.out.println("Rechteck");
		}
		
		//Unterscheidung zwischen Compilertyp und Laufzeit
		
		System.out.printf("%n%n----------------------toString----------------------------%n%n");
		
		System.out.println(v1.toString());
		
		System.out.printf("%n%n----------------------equals----------------------------%n%n");
		
		Viereck v4 = new Viereck(10, 20, 30, 40);
		Viereck v5 = new Viereck(10, 20, 30, 40);
		
		System.out.println("v4 gleich v5? " + (v4 == v5));
		Viereck v6 = v4;
		System.out.println("v5 gleich v6? " + (v4 == v6));
		v4.print();
		v5.print();
		v6 = null;
		
		Viereck v7;   //null
		v4.equals("hallo");
		
		System.out.println("v4 gleich v5? " + v4.equals(v5));
		
		
		
		
		
		
		
	}

}
