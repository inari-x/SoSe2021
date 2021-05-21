package uebungen.uebung6;

import java.util.*;

public class StadtTest {
	
	public static Stadt[] staedte()
	{
	    Stadt[] staedte = new Stadt[6];
	    List<Integer> berlinBevoelkerung = new ArrayList<>();
	    berlinBevoelkerung.add(3382169);    
	    berlinBevoelkerung.add(3460725);    
	    berlinBevoelkerung.add(3574830);
	    staedte[0] = new Stadt("Berlin", berlinBevoelkerung, 891.68f);

	    List<Integer> hamburgBevoelkerung = new ArrayList<>();
	    hamburgBevoelkerung.add(1715392);   
	    hamburgBevoelkerung.add(1786448);   
	    hamburgBevoelkerung.add(1810438);   
	    staedte[1] = new Stadt("Hamburg", hamburgBevoelkerung, 755.22f);

	    List<Integer> muenchenBevoelkerung = new ArrayList<>();
	    muenchenBevoelkerung.add(1210223);  
	    muenchenBevoelkerung.add(1353186);  
	    muenchenBevoelkerung.add(1464301);
	    staedte[2] = new Stadt("Muenchen", muenchenBevoelkerung, 310.70f);

	    List<Integer> koelnBevoelkerung = new ArrayList<>();
	    koelnBevoelkerung.add(962884);  
	    koelnBevoelkerung.add(1007119); 
	    koelnBevoelkerung.add(1075935); 
	    staedte[3] = new Stadt("Koeln", koelnBevoelkerung, 405.02f);

	    List<Integer> frankfurtBevoelkerung = new ArrayList<>();
	    frankfurtBevoelkerung.add(648550);  
	    frankfurtBevoelkerung.add(679664);  
	    frankfurtBevoelkerung.add(736414);
	    staedte[4] = new Stadt("Frankfurt/Main", frankfurtBevoelkerung, 248.31f);

	    berlinBevoelkerung = new ArrayList<>();
	    berlinBevoelkerung.add(3382169);    
	    berlinBevoelkerung.add(3460725);    
	    berlinBevoelkerung.add(3574830);
	    staedte[5] = new Stadt("Berlin", berlinBevoelkerung, 891.68f);

	    return staedte;
	}       

	public static void main(String[] args) {
		
		System.out.printf("%n------------ Liste --------------%n");
		
		List<Stadt> staedteListe = new ArrayList<>();
		
		Stadt[] staedte = staedte();
		for(Stadt stadt : staedte) {
			staedteListe.add(stadt);
		}
		
		for(Stadt stadt : staedteListe) {
			stadt.print();
		}
		
		System.out.printf("%n------------ Menge --------------%n");
		
		Set<Stadt> staedteMenge1 = new HashSet<>();
		
		for(Stadt stadt : staedte()) {
			staedteMenge1.add(stadt);
		}
		
		for(Stadt stadt : staedteMenge1) {
			stadt.print();
		}
		
		Set<Stadt> staedteMenge2 = new TreeSet<>();
		
		System.out.printf("%n------------ Maps --------------%n");
		
		Map<Integer, Stadt> staedteMap = new HashMap<>();
		Integer number = 1;
		for(Stadt stadt : staedte()) {
			staedteMap.put(number, stadt);
			number++;
		}
		
		for(Map.Entry<Integer, Stadt> eintrag : staedteMap.entrySet()) {
			System.out.printf("%-3d", eintrag.getKey());
			Stadt stadt =eintrag.getValue();
			stadt.print();
		}
		
	}
	
}


