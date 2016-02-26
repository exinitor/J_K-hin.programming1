import java.util.Calendar;
import java.util.GregorianCalendar;

public class Oppgave1_kort_gjest extends Oppgave1_kort implements Cloneable {
	
	private GregorianCalendar utgår;
	
	public Oppgave1_kort_gjest(String navn, int PIN, boolean aksesskode){
		super(navn, PIN, aksesskode);
		utgår = new GregorianCalendar();
		utgår.add(Calendar.DAY_OF_MONTH, 7);	
	}
	
	@Override
	public boolean sjekkPIN(int PIN) {
		if(PIN == 9999)
			return true;
		return false;
	}

	@Override
	public boolean erSperret() {
		GregorianCalendar tid = new GregorianCalendar();
		if(tid.compareTo(utgår) >= 0)
			return true;
		return false;
	}

	@Override
	public int compareTo(Oppgave1_kort k) {
		return super.compareTo(k);
	}
	@Override
	public Oppgave1_kort clone() {
		Oppgave1_kort_gjest clone = new Oppgave1_kort_gjest(this.getNavn(), this.getPIN(), this.erSperret());
		clone.utgår.setTime(this.utgår.getTime());
		return clone;
	}
	@Override
	public String toString(){
		return super.toString() + " " + utgår.getTime();
	}

}
