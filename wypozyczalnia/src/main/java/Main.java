public class Main {

	public static void main(String[] args) {
		System.out.println ("To jest wypozyczalnia pojazd�w");
		Rower r = new RowerDlaDziecka();
		r = new PrzyczepaDlaDzieci(r);
		r = new Koszyk(r);
		System.out.println(r.pobierzOpis());
		System.out.println(r.koszt());
	}

}
