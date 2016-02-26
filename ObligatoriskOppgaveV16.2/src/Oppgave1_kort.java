
public abstract class Oppgave1_kort implements Comparable<Oppgave1_kort>, Cloneable{
	
	private String navn;
	private int PIN;
	private static int kortNummer;
	private boolean aksesskode = false;
	private static int antallKort = 0;
	
	public Oppgave1_kort(){
		
	}
	public Oppgave1_kort(String newNavn, int newPIN, boolean newAksesskode){
		navn = newNavn;
		PIN = newPIN;
		kortNummer = antallKort + 1;
		aksesskode = newAksesskode;
		antallKort++;
		
	}
	public String getNavn(){
		return navn;
	}
	public boolean isSperret(){
		return this.aksesskode;
	}
	@Override
	public String toString(){
		return navn + " " + getPIN() + " " + kortNummer + " " + aksesskode;
	}
	public abstract boolean sjekkPIN(int PIN);
	
	public abstract boolean erSperret();
	
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int PIN) {
		PIN = PIN;
	}
	@Override
	public int compareTo (Oppgave1_kort k){
		String navn1 = this.navn;
		String navn2 = k.navn;
		int mellomrom1 = navn1.indexOf(' ');
		int mellomrom2 = navn2.indexOf(' ');
		String etterNavn1 = navn1.substring(mellomrom1+1, navn1.length()-1);
		String etterNavn2 = navn2.substring(mellomrom2+1, navn2.length()-1);
		String forNavn1 = navn1.substring(0, mellomrom1-1);
		String forNavn2 = navn2.substring(0, mellomrom2-1);
		if (etterNavn1.compareTo(etterNavn2) != 0)
			return etterNavn1.compareTo(etterNavn2);
		else
			return forNavn1.compareTo(forNavn2);
	}
	@Override
	public abstract Oppgave1_kort clone();
}
