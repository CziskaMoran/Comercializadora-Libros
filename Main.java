package ComercializadoraLibros;

public class Main {

   
    public static void main(String[] args) {
        Libro lbr1 = new Libro("20000 leguas de viaje submarino", 23);
	Libro lbr2 = new Libro("Vuelta al mundo en 80 dias", 26);
		
	CD Cd1 = new CD("ammesia", 16);
	CD Cd2 = new CD("world's faith", 15);

       
	System.out.println("USTED TIENE QUE CANCELAR POR EL LIBRO DE 20000 leguas de viaje submarino:" + lbr1.getValor1() +  "$");
	System.out.println("EL LIBRO Vuelta al mundo en 80 dias CUESTA : " + lbr2.getValor1() +  "$"); 
		
	System.out.println();
		
	System.out.println("EL VALOR DEL CD DE ammesia ES :" +  Cd1.getValorcd1() +  "$");
	System.out.println("EL VALOR DEL CD DE world's faith ES : "  + Cd2.getValorcd1() +  "$");
    }
    
}
