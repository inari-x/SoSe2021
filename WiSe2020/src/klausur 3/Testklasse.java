package klausur;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int nummer = 1; nummer <= 10; nummer++) {
			Land l = new Land();
			l.print();
		}
		System.out.println();
		Land l = new Land();
		l.print();
		
		Land lo = new Land();
		int nrOfOccurrences = 0;
		while(!l.equals(lo)) {
			nrOfOccurrences++;
			if(l.equals(lo)) {
				l.print();
				lo.print();
				System.out.printf("%d andere Laender erzeugt", nrOfOccurrences);
			}
			
		}
		
		Land l1 = new Land();
		Land l2 = new Land();
		l1.istGroesser(l2);
		l1.hatMehrEinwohner(l2);
		l1.nameIstGroesser(l2);
		System.out.printf("l1 groesser als l2 ?      :",l1.istGroesser(l2));
		System.out.printf("l1 mehr Einwohner l2 ?      :",l1.hatMehrEinwohner(l2));
		System.out.printf("l1 lexikografisch groesser l2 ?      :",l1.nameIstGroesser(l2));
		
		
		
//		Kontinent[] kontinent = new Kontinent[5];
//		for (int i = 0; i < kontinent.length; i++) {
//			Kontinent k = new Kontintent("a", 7);
//			kontinent[i] = new Kontintent("a", 7);
//			kontinent[i] = new Kontintent("a", 7);
//			kontinent[i] = new Kontintent("a", 7);
//			kontinent[i] = new Kontintent("a", 7);
//			
//		}
//		k.print();
//		k.sortiere(0);
//		k.print();
//		k.sortiere(1);
//		k.print();
//		k.sortiere(2);
//		k.print();
//		k.sortiere(3);
//		k.print();
		
		
	}

}
