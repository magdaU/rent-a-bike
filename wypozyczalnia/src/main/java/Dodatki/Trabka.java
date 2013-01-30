package Dodatki;
import Rowery.Rower;


public class Trabka   extends Dodatki{
		Rower rower;
		
		public Trabka(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Trabka";
		}
		public double koszt(){
			return rower.koszt() + 5;
		}
}



