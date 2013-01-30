package Dodatki;
import Rowery.Rower;


public class FotelikRowerowy extends Dodatki{
		Rower rower;
		
		public FotelikRowerowy(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Fotelik rowerowy";
		}
		public double koszt(){
			return rower.koszt() + 25;
		}
}


