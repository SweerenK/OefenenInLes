package week2.maandag;

public class Oefening2 {

	public static void main(String[] args) {
		Bord bord = new Bord();
		Glas glas = new Glas();
		Bestek bestek = new Bestek();
		Kunstenaar kunstenaar = new Kunstenaar();
		Object p = kunstenaar.maken(glas);
		//Bord bordje = (Bord) p;
		Glas glaasje = (Glas) p;
		//bordje.rollen();
		glaasje.rollen();
		
		kunstenaar.maken(bord);
		kunstenaar.maken(bestek);
		kunstenaar.maken(glas);
	}
}

interface Rondvormig{
	void rollen();
}

abstract class Keukengerei{
	abstract void afwassen();
	
}

class Bord extends Keukengerei implements Rondvormig{
	void afwassen() {
		System.out.println("Bord in vaatwasser");
	}
	
	public void rollen(){
		System.out.println("Het bord rolt.");
	}
}

class Glas extends Keukengerei implements Rondvormig{
	void afwassen() {
		System.out.println("Glas op de hand");
	}
	public void rollen(){
		System.out.println("Het glas rolt.");
	}
}

class Bestek extends Keukengerei{
	void afwassen() {
		System.out.println("Bestek weggooien");
	}
}

class Voetbal implements Rondvormig{
		public void rollen(){
			System.out.println("De bal rolt.");
		}
}


class Kunstenaar{
	 Object maken(Object o) {
		 if(o instanceof Rondvormig) {
			 System.out.println("Ja");
			 return o; 
		 }else {
			 System.out.println("Nee");
			 return null;
		 }
	}
}