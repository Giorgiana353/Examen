import java.util.List;

public class Muncitor extends Angajat {
	
	private List<String>Responsabilitati;

	

	public Muncitor(String nume, String prenume, String functie, double salariu, int vechime,
			List<String> responsabilitati) {
		super(nume, prenume, functie, salariu, vechime);
		Responsabilitati = responsabilitati;
	}



	public void adaugaResponsabilitati(String r) {
		Responsabilitati.add(r);
	}
	
	
	
	

}
