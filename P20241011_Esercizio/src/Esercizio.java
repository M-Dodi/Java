
public class Esercizio {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		
		*Realizare una classe Compiuter con i seguenti
		*attributi(Prezzo, Peso, Dimensioni(larg,alt,prof)
		*Produttore
		*Anno di produzione
		*nel main creare degli oggetti di tipo Compiuter
		*e stampare il loro contenuto
		*usando getter e setter ecostruttore generati da eclipse
		*Bonus: aggungere un metodo che conta quanti oggetti 
		*di tipo Compiuter sono stati creati
		*/
	}
	public class Compiuter {
		
		private double prezzo;
		private double peso;
		private Dimensioni dimensioni;
		private String produttore;
		private int annoDiProduzione;
		private static int count=0;
		
		public Compiuter (double prezzo, double peso, Dimensioni dimensioni,
				String produttore, int annoDiProduzione) {
			
			this.prezzo = prezzo;
			this.peso = peso;
			this.dimensioni = dimensioni;
			this.produttore = produttore;
			this.annoDiProduzione = annoDiProduzione;
			coun++;
		
		}

		public static int getCount() {
			return count;
		}

		public double getPrezzo() {
			return prezzo;
		}

		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public Dimensioni getDimensioni() {
			return dimensioni;
		}

		public void setDimensioni(Dimensioni dimensioni) {
			this.dimensioni = dimensioni;
		}

		public String getProduttore() {
			return produttore;
		}

		public void setProduttore(String produttore) {
			this.produttore = produttore;
		}

		public int getAnnoDiProduzione() {
			return annoDiProduzione;
		}

		public void setAnnoDiProduzione(int annoDiProduzione) {
			this.annoDiProduzione = annoDiProduzione;
		}
		

	}
	
	
	
	
}
