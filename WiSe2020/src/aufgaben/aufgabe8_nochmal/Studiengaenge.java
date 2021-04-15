package aufgaben.aufgabe8_nochmal;

import java.util.Random;

public class Studiengaenge {
	private Studentin[] fiw;
	private Studentin[] ai;
	
	public Studiengaenge(int fiwAnzahl, int aiAnzahl) {
		this.fiw = new Studentin[fiwAnzahl];
		this.ai = new Studentin[aiAnzahl];
	}
	
	public void immatrikulieren(int anzahl) {
		Random r = new Random();
		int indexFIW = 0;
		int indexAI = 0;
		
		for(int i = 1; i <= anzahl; i++) {
			int randomNumber = r.nextInt(3);
			if(randomNumber == 0) {
				if(indexFIW < this.fiw.length) {
					this.fiw[indexFIW] = new Studentin("S" + i, 20 + i, "FIW");
					indexFIW++;
				}
				else {
					System.out.println("FIW ist bereits voll.");
				}
			}
			else {
				if(indexAI < this.ai.length) {
					this.ai[indexAI] = new Studentin("S" + i, 20 + i, "AI");
					indexAI++;
				}
				else {
					System.out.println("AI ist bereits voll.");
				}
			}
		}
	}
	
	public void printFIW() {
		System.out.print("FIW : [");
        for (int index = 0; index < this.fiw.length; index++)
        {
            if(this.fiw[index]!=null)
            {
                System.out.print(this.fiw[index].toString() + " ");
            }
        }
        System.out.println("]");
	}
	
	public void printAI() {
		System.out.print("AI : [");
        for (int index = 0; index < this.ai.length; index++)
        {
            if(this.ai[index]!=null)
            {
                System.out.print(this.ai[index].toString() + " ");
            }
        }
        System.out.println("]");
	}
	
	public double durschnittsalterFIW() {
		int anzahl = 0;
		double summe = 0.0;
		for (int i = 0; i < this.fiw.length; i++) {
			if(this.fiw[i] != null)
			summe =this.fiw[i].getAlter();
			anzahl++;
		}
		return summe/anzahl;
	}
	
	public double durschnittsalterAI() {
		int anzahl = 0;
		double summe = 0.0;
		for (int i = 0; i < this.ai.length; i++) {
			if(this.ai[i] != null)
			summe =this.ai[i].getAlter();
			anzahl++;
		}
		return summe/anzahl;
	}
	
	public void printdurchschnittsalter() {
		System.out.println("Durchschnittsalter FIW: " + this.durschnittsalterFIW());
		System.out.println("Durschschnittsalter AI: " + this.durschnittsalterAI());
		if(this.durschnittsalterAI() < this.durschnittsalterFIW()) {
			System.out.println("AI ist im Durchschnitt juenger");
		}
		else if(this.durschnittsalterFIW() < this.durschnittsalterAI()) {
			System.out.println("FIW ist im Durchschnitt juenger");
		}
		else {
			System.out.println("FIW- und AI-Studierende sind im Durschschnitt gleich alt.");
		}
	}
	
	
}
			

