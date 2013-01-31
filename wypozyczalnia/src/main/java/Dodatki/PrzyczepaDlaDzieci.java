package Dodatki;
import Rowery.Rower;
import Service.IDodatki;

public class PrzyczepaDlaDzieci extends Dodatki implements IDodatki{
	
	Rower rower;
	private double koszt = 40.00;
	
	public PrzyczepaDlaDzieci(Rower rower){
		this.rower=rower;
	}
	public String pobierzOpis(){
		return rower.pobierzOpis() +"Przyczepa dla dzieci: " + (koszt()-rower.koszt()) + "\n" ;
	}
	public double koszt(){
		return rower.koszt() + koszt;
	}
	public void przymocowac() {
		// TODO Auto-generated method stub
		
	}
	public void odmocowac() {
		// TODO Auto-generated method stub
		
	}
	public void zamowic() {
		// TODO Auto-generated method stub
		
	}
	public void sprzedac() {
		// TODO Auto-generated method stub
		
	}

}
