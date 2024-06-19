
public class Oferta extends Act {
	
	private double valoareTotala;
	private Client client;
	
	public Oferta(double valoareTotala, Client client) {
		super();
		this.valoareTotala = valoareTotala;
		this.client = client;
	}

	public double getValoareTotala() {
		return valoareTotala;
	}

	public Client getClient() {
		return client;
	}
	
	

}
