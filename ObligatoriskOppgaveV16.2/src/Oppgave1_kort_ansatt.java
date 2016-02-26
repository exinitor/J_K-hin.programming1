import java.util.GregorianCalendar;

public class Oppgave1_kort_ansatt extends Oppgave1_kort implements Oppgave1_kort_konstanter, Cloneable {
	String forNavn;
	String etterNavn;
	String fulltNavn;
	private double kreditt = 1;
	private double timelønn = 1;
	private double bonus = 1;
	private GregorianCalendar ansettelsesDato = new GregorianCalendar(2000,2,22);
	
	public Oppgave1_kort_ansatt(String navn, int PIN, boolean aksesskode){
	super(navn, PIN, aksesskode);
	settFornavn(navn);
	settEtternavn(navn);
	fulltNavn = navn;
	}
	
	public boolean erKontortid(){
		GregorianCalendar date = new GregorianCalendar();
		if(date.HOUR_OF_DAY < 17 && date.HOUR_OF_DAY > 7)
			return true;
		return false;
	}
	
	@Override
	public boolean sjekkPIN(int PIN) {
		if(this.getPIN() == PIN)
			return true;
		return false;
	}
	@Override
	public boolean erSperret() {
		return false;
	}

	@Override
	public void settFornavn(String navn) {
		int mellomrom = navn.indexOf(' ');
		forNavn = navn.substring(0, mellomrom-1);
	}

	@Override
	public String hentFornavn() {
		return forNavn;
	}

	@Override
	public void settEtternavn(String navn) {
		int mellomrom = navn.indexOf(' ');
		etterNavn = navn.substring(mellomrom+1, navn.length()-1);
	}

	@Override
	public String hentEtternavn() {
		return etterNavn;
	}

	@Override
	public void settFulltnavn(String navn) {
		fulltNavn = forNavn + " " + etterNavn;
	}

	@Override
	public String hentFulltnavn() {
		return fulltNavn;
	}

	@Override
	public double beregnKreditt() {
		return kreditt * timelønn;
	}

	@Override
	public double beregnBonus() {
		GregorianCalendar iDag = new GregorianCalendar();
		return bonus /* *(ansettelsesDato - iDag)*/;
	}


	@Override
	public int compareTo(Oppgave1_kort k) {
		return super.compareTo(k);
	}

	@Override
	public Oppgave1_kort clone() {
		Oppgave1_kort_ansatt clone = new Oppgave1_kort_ansatt(this.getNavn(), this.getPIN(), this.erSperret());
		clone.ansettelsesDato.setTime(this.ansettelsesDato.getTime());
		return clone;
	}
	@Override
	public String toString(){
		return super.toString() + "\nKreditt: " + beregnKreditt() + "\nBonus: " + beregnBonus();
	}

}
