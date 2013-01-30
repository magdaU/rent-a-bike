package Dodatki;
import Rowery.Rower;


public class Blokada  extends Dodatki{
		Rower rower;
		
		public Blokada(Rower rower){
			this.rower=rower;
		}
		public String pobierzOpis(){
			return rower.pobierzOpis() + ", Blokada";
		}
		public double koszt(){
			return rower.koszt() + 8;
		}

	}

