public class PrzyczepaDlaDzieci extends Dodatki{
	Rower rower;
	
	public PrzyczepaDlaDzieci(Rower rower){
		this.rower=rower;
	}
	public String pobierzOpis(){
		return rower.pobierzOpis() + ", PrzyczepaDlaDzieci";
	}
	public double koszt(){
		return rower.koszt() + 40;
	}

}
