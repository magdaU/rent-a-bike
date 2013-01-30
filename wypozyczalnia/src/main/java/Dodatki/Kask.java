package Dodatki;
import Rowery.Rower;


public class Kask  extends Dodatki{
		Rower rower;
		
		public Kask(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + "Kask: " + (koszt() - rower.koszt());
		}
		public double koszt(){
			return rower.koszt() + 20;
		}
}


