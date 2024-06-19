import java.util.List;

public class Manager extends Angajat {
	
	private List<String>muncitori;

	public Manager(String nume, String prenume, String functie, double salariu, int vechime,
			List<String> muncitori) {
		super(nume, prenume, functie, salariu, vechime);
		this.muncitori = muncitori;
	}

	public void adaugaMuncitori(String m) {
	     muncitori.add(m);
	 }

}
