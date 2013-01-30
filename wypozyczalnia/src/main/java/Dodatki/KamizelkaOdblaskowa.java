package Dodatki;
import Rowery.Rower;


public class KamizelkaOdblaskowa   extends Dodatki{
		Rower rower;
		
		public KamizelkaOdblaskowa(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Kamizelka Odblaskowa";
		}
		public double koszt(){
			return rower.koszt() + 2;
		}
}


