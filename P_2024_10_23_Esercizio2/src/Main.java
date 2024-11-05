
public class Main {

	public static void main(String[] args) {
		
		int [] vint;
		vint = new int[100];
		
		System.out.println(vint);
		
		for (int i=0; i<100; i++) {
		vint[i]=i+1;
		}
		
		for (int i=100; i>=0; i--) {
			
		vint[100-i]=i;
		StampaVint(vint);
		
		
		/*inserire in vint i numeri pari
		 * 
		 */
		for (int i1=0; i1<100; i1++) {
			vint[i1]=(i1+1)*2;
			}
		}
		/*
		 * iserire in vint i numeri disapari
		 */
		
		for (int i1=0; i1<100; i1++) {
			vint[i1]=(i1+1)*2-1;
			}
		/*
		 * Inserire in vdou la serie armonica
		
		for(int i=1; i<=100; i++) {
			double[] vdou;
			vdou[i-1]=1.0/i;
			}
		/*
		 * Inserire la seguente serie numerica
		 * 1,1,2,3,5,8
		 * dove il valore attuale è pari alla somma dei valori precedenti
		 * 
		 */
		vint[0]=1;
		vint[1]=1;
		for (int i=2; i<100; i++) {
			vint[i]= vint[i-1]+vint[i-2];
		}
		
		/*
		 * Inserire i numeri primi in sequenza
		 * Implementare il crivello di eratostene e stampare i
		 * primi 10000 numeri primi
		 */
		Eratostene(10000);
		
		
	}

	private static void Eratostene(int N, Object Factoriale) {
	
		boolean [] v = new boolean[1000000000];
		for(int i=2; i<v.length; i++) {
			if (v[i]==true) {
				System.out.println( i + "è un numero primo");
				
				for(int k=i+i; k<v.length; k+=i) {
					v[k]=false;
				}
				
		/*
		 * Stampare il fattoriale di un numero n
		 */
					
			
	private static int Fattoriale(int N) {
		int p=1;
		for (int i=2; i<=N; i++) {
			p = p*i;
			}
		return p;
			
	}
		
		

	private static void StampaVint(int[] vint) {
	
		for (int v:vint) {
			System.out.print(v + " ");
		System.out.println();	
		}
		
	}

}
