package Dodatki;
import Rowery.Rower;


public class Kask  extends Dodatki{
		Rower rower;
		private double koszt = 20.00;
		
		public Kask(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + "Kask: " + (koszt() - rower.koszt());
		}
		public double koszt(){
			return rower.koszt() + koszt;
		}
}


