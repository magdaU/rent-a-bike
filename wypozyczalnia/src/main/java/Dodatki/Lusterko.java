package Dodatki;
import Rowery.Rower;


public class Lusterko  extends Dodatki{
		Rower rower;
		
		public Lusterko(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Lusterko";
		}
		public double koszt(){
			return rower.koszt() + 5;
		}
}
