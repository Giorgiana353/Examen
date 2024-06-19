
public class Angajat {

	private String nume;
	private String prenume;
	private String functie;
	private double salariu;
	private int vechime;
	
	public Angajat(String nume, String prenume, String functie, double salariu, int vechime) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.functie = functie;
		this.salariu = salariu;
		this.vechime = vechime;
	}
	
	public String numeComplet() {
		
		return nume + prenume;
	}
	
	public double calculeazaSalariu() {
		
		return salariu + 0.1 * vechime;
	}
	
	
}
