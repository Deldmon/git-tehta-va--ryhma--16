
public class Tehtava {

	public static void main(String[] args) {
		
		Tietokone t1 = new Tietokone();
		
		t1.nayttoPaalle();
		t1.setMuisti(32);
		t1.tulostaTiedot();
	}

} // Mainin loppu 

class Tietokone{
	
	String merkki = "Acer";
	String malli = "FQZ71D";
	private int muisti =0;
	boolean paalla = true;
	
	public int getMuisti() {
		return muisti;
	}

	public void setMuisti(int muisti) {
		this.muisti = muisti;
	}

	public void nayttoPaalle() {
		if(paalla == true)
			System.out.println("Näyttö on päällä");
	}
	
	public void tulostaTiedot() {
		System.out.println("Merkki on: " + merkki);
		System.out.println("Malli on: " + malli);
		System.out.println("Muistin maara: " + muisti);

		
	}
}

class Naytto extends Tietokone{
	
	
}