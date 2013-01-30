package Dodatki;
import Rowery.Rower;


public class Dzwonek  extends Dodatki{
		Rower rower;
		
		public Dzwonek(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", dzwonek";
		}
		public double koszt(){
			return rower.koszt() + 5;
		}
}



