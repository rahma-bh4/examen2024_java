package ds2023;
import java.time.LocalDate;
public class Billet implements Publiable {
	protected LocalDate datePub;
	protected String aut;
	public Billet(LocalDate datePub, String aut) {
		super();
		this.datePub = datePub;
		this.aut = aut;
	}
	@Override
	public String toString() {
		return "Billet [datePub=" + datePub + ", aut=" + aut + "]";
	}
	
public LocalDate getDatePublication()
{
	return datePub;
}

public String getAuteur()
{
	return this.aut;
}
	
}
