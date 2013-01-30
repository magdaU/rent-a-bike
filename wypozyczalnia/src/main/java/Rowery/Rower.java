package Rowery;
public abstract class Rower {
	String opis = "Nieznany";
	
	public String pobierzOpis(){
		return opis + ": " + koszt() + "\n";
	}
	
	public abstract double koszt();
}

