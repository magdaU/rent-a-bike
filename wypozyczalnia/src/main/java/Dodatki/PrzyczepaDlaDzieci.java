package Dodatki;
import Rowery.Rower;

public class PrzyczepaDlaDzieci extends Dodatki{
	Rower rower;
	
	public PrzyczepaDlaDzieci(Rower rower){
		this.rower=rower;
	}
	public String pobierzOpis(){
		return rower.pobierzOpis() +"Przyczepa dla dzieci: " + (koszt()-rower.koszt()) + "\n" ;
	}
	public double koszt(){
		return rower.koszt() + 40;
	}

}
