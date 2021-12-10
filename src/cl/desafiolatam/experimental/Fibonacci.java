package cl.desafiolatam.experimental;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		 
		int n = sc.nextInt();
		
		int i;
		int fSuma=0;
		int fPrevio=1;
		int fPrevioPrevio=0;
		
		if(n==0) {
			System.out.println(fPrevioPrevio);
		}
		else {
			System.out.println(fPrevioPrevio+" "+fPrevio);
	
			for(i=2;i<=n;i++) {
				fSuma = fPrevio + fPrevioPrevio;
				System.out.println(fSuma);
				fPrevioPrevio= fPrevio;
				fPrevio = fSuma;
				
			}
		}
		sc.close();
	}

}
