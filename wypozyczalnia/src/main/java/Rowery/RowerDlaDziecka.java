package Rowery;

import Service.IRower;

public class RowerDlaDziecka extends Rower implements IRower {
	
	private double koszt = 70.00;

	public RowerDlaDziecka(){
		opis="Rower dla dziecka";
	}
	
	public double koszt(){
		return koszt;
	
	}

	public void wypozycz() {
		// TODO Auto-generated method stub
		
	}

	public void zwroc() {
		// TODO Auto-generated method stub
		
	}

	public void napraw() {
		// TODO Auto-generated method stub
		
	}

	public void zamow() {
		// TODO Auto-generated method stub
		
	}

	public void sprzedaj() {
		// TODO Auto-generated method stub
		
	}
}
