//provjera prime brojeva 


public class ProstiBrojevi {

   public static void main(String[] args) {
      
	int broj=TextIO.getInt();
	int i=2;
	int brojac=0;
	boolean jeprost= true;	
	while (i<broj){
		if (broj%i==0){
			jeprost =false;
			brojac++;
			System.out.println("Dosta smo vrtili");
			break;
		}
		i++;
	}
	if (jeprost == false) {
		System.out.println("Broj nije prost");
	}
	else
		System.out.println("Broj je prost");
   }
}