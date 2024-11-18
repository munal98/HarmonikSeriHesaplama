import java.util.Scanner;

public class HarmonikSeriHesaplama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N değerini Giriniz : ");
		int n =sc.nextInt();
		double result = 0;
		
		for (int i = 1; i <=n; i++) {
			result +=(1.0 / i);
		}
		//1.Döngü : 0 + 1/1 = 1;
		//2.Döngü : 1 + 1/2 = 1.5;
        System.out.println(result);
	}

}
