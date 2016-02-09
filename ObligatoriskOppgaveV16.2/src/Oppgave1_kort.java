
public abstract class Oppgave1_kort {
	
	private String fNavn;
	private String eNavn;
	private int PIN;
	private int kortNummer;
	private boolean aksesskode = false;
	
	public Oppgave1_kort(){
		
	}
	public Oppgave1_kort(String newFNavn, String newENavn, int newPIN, int newKortNummer, boolean newAksesskode){
		fNavn = newFNavn;
		eNavn = newENavn;
		PIN = newPIN;
		kortNummer = newKortNummer;
		aksesskode = newAksesskode;
		
	}
	public String getNavn(){
		return fNavn + " " + eNavn;
	}
	public boolean isSperret(){
		return this.aksesskode;
	}
	@Override
	public String toString(){
		return fNavn + " " + eNavn + " " + PIN + " " + kortNummer + " " + aksesskode;
	}
	public abstract boolean sjekkPIN(int PIN);
	
}
