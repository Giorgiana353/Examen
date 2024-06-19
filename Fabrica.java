import java.util.ArrayList;
import java.util.List;

public class Fabrica {
	
	private List<Angajat>angajat;
	private List<Client>client;
	private List<Act>act;
	
	public Fabrica(List<Angajat> angajat, List<Client> client, List<Act> act) {
		super();
		this.angajat = new ArrayList<>();
		this.client = new ArrayList<>();
		this.act = new ArrayList<>();

	}
	
	

}
