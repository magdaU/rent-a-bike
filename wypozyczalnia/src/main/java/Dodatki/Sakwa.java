package Dodatki;
import Rowery.Rower;


public class Sakwa   extends Dodatki{
		Rower rower;
		
		public Sakwa(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Sakwa";
		}
		public double koszt(){
			return rower.koszt() + 20;
		}
}


