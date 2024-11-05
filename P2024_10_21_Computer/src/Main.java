public class Main{
	public static void main(String[] args){ /*
}
         * Realizzare una classe Computer con i seguenti attributi
         * - Prezzo
         * - Peso
         * - Dimensioni (larghezza, altezza, profondità)
         * - Produttore
         * - Anno di produzione
         * 
         * Nel main creare degli oggetti di tipo Computer
         * e stampare il loro contenuto
         * 
         * NB: ricordate di utilizzare getter, setter e costruttore
         * generati da eclipse
         * 
         * Bonus: aggiungere un metodo alla classe Computer 
         * che stampi quanti oggetti (di tipo Computer) sono stati creati
         */

	Compiuter com1 = new Compiuter();
	com1.setAltezza(1.5);
	com1.setAnnoDiProduzione(2023);
	com1.setLarghezza(35.0);
	com1.setPeso(4.5);
	com1.setPrezzo(4500.0);
	com1.setProduttore("arche");
	com1.setProfondita(25.0);
	
	
	Compiuter com2 = new Compiuter(8730., 7.2, 60.,50,2.4, "intel", 1982);
	
	System.out.println(com1);
	System.out.println(com2);
	
	}
}
