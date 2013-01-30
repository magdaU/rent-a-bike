package Dodatki;
import Rowery.Rower;


public class Licznik  extends Dodatki{
	Rower rower;
	
	public Licznik(Rower rower){
		this.rower=rower;
	}
	public String pobierzOpis(){
		return rower.pobierzOpis() + ", Licznik";
	}
	public double koszt(){
		return rower.koszt() + 15;
	}

}
