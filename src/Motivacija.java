
public class Motivacija {

	public static void main(String[] args) {
		System.out.println("Pocetni broj");
		int kraj=TextIO.getlnInt();
		System.out.println("Do kojeg broja broji");
		int brojac=TextIO.getlnInt();
		int suma=0;
/**		System.out.println(brojac);//unazad brojanje
		while (brojac!=0){
			brojac--;
			System.out.println(brojac);
		}*/
		while (kraj<=brojac){
					System.out.println(kraj);
					suma=suma+kraj;			//redbrojeva
				kraj++;
			
		}	
		System.out.println("A zbir svih je: "+ suma);
	}
			
}
	
