package cl.desafiolatam.experimental;
import java.util.Scanner;
public class SumaImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int suma =0;
		for (i=0;i<=n;i++) {
			if(i%2==1) {
				suma +=i;
			}
			
		}
		System.out.println(suma);
		sc.close();
	}

}
