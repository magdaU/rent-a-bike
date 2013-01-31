package Dodatki;
import Rowery.Rower;

public class KoszykPrzod extends Dodatki{
	Rower rower;
	private double koszt = 10.00;
	
	public KoszykPrzod(Rower rower){
		this.rower=rower;
	}
	public String pobierzOpis(){
		return rower.pobierzOpis() + "Koszyk z przodu: " + (koszt() - rower.koszt()) + "\n";
	}
	public double koszt(){
		return rower.koszt() + koszt;
	}

}
