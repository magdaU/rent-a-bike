package Dodatki;
import Rowery.Rower;


public class KoszykTyl   extends Dodatki{
		Rower rower;
		
		public KoszykTyl(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Koszyk z Ty³u";
		}
		public double koszt(){
			return rower.koszt() + 20;
		}
}


