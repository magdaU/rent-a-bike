package Dodatki;
import Rowery.Rower;


public class Lampka   extends Dodatki{
		Rower rower;
		
		public Lampka(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Lampka";
		}
		public double koszt(){
			return rower.koszt() + 5;
		}
}



