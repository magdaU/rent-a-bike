package Start;
import Dodatki.Kask;
import Dodatki.KoszykPrzod;
import Dodatki.PrzyczepaDlaDzieci;
import Rowery.Rower;
import Rowery.RowerDlaDziecka;

public class Main {

	public static void main(String[] args) {
		System.out.println ("RACHUNEK");
		Rower r = new RowerDlaDziecka();
		r = new PrzyczepaDlaDzieci(r);
		r = new KoszykPrzod(r);
		r = new Kask(r);
		System.out.println(r.pobierzOpis());
		System.out.println("SUMA DO ZAPLATY: " +  r.koszt());
	}

}
