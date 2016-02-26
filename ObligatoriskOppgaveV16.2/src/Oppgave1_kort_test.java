import java.util.ArrayList;

public class Oppgave1_kort_test {

	public static void main(String[] args) {
		
		ArrayList<Oppgave1_kort> kortArray = new ArrayList<>();
		
		Oppgave1_kort k1 = new Oppgave1_kort_ansatt("Ole Olsen", 1234, false);
		Oppgave1_kort k2 = new Oppgave1_kort_gjest("Marit Olsen", 9999, false);
		Oppgave1_kort k3 = k1.clone();
		Oppgave1_kort k4 = new Oppgave1_kort_ansatt("Jan Kristensen", 1234, false);
		Oppgave1_kort k5 = new Oppgave1_kort_ansatt("Gjermund Strøm", 1234, false);
		Oppgave1_kort k6 = new Oppgave1_kort_gjest("Kari Jenssen", 9999, false);
		Oppgave1_kort k7 = new Oppgave1_kort_gjest("Marit Pettersen", 9999, false);
		
		kortArray.add(k1);
		kortArray.add(k2);
		kortArray.add(k3);
		kortArray.add(k4);
		kortArray.add(k5);
		kortArray.add(k6);
		kortArray.add(k7);
		
		 /* for (Oppgave1_kort kort : kortArray) 
		  {             
		  System.out.println(kort);             
		  System.out.println("Kode 1234 er " + (kort.sjekkPIN(1234) ? "gyldig": "ugyldig"));             
		  System.out.println("Kode 9999 er " + (kort.sjekkPIN(9999) ? "gyldig": "ugyldig\n "));         
		  }*/
		  for(Oppgave1_kort kort : kortArray)
			  System.out.println("\n" + kort);
		  kortArray.sort(null);
		  System.out.println("SORT:");
		  for(Oppgave1_kort kort : kortArray)
			  System.out.println("\n" + kort);
	}
}
