package Dodatki;
import Rowery.Rower;


public class KolkaBoczne    extends Dodatki{
		Rower rower;
		
		public KolkaBoczne(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Kó³ka Boczne";
		}
		public double koszt(){
			return rower.koszt() + 8;
		}
}
