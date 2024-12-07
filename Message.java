package ds2023;

import java.time.LocalDate;

public class Message extends Billet {
	private String cont;

	public Message(LocalDate datePub, String aut, String cont) {
		super(datePub, aut);
		this.cont = cont;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}
	
	

	
}
