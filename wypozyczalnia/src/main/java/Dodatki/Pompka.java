package Dodatki;
import Rowery.Rower;


public class Pompka   extends Dodatki{
		Rower rower;
		
		public Pompka(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Pompka";
		}
		public double koszt(){
			return rower.koszt() + 5;
		}
}

