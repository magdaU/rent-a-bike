public class Koszyk extends Dodatki{
	Rower rower;
	
	public Koszyk(Rower rower){
		this.rower=rower;
	}
	public String pobierzOpis(){
		return rower.pobierzOpis() + ", Koszyk";
	}
	public double koszt(){
		return rower.koszt() + 10;
	}

}
