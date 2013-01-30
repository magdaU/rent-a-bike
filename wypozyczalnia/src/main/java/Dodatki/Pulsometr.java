package Dodatki;
import Rowery.Rower;


public class Pulsometr extends Dodatki{
		Rower rower;
		
		public Pulsometr(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Pulsometr";
		}
		public double koszt(){
			return rower.koszt() + 35;
		}
}



