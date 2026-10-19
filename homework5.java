package homework;
import java.util.Scanner;
public class homework5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Enter your number n: ");
		n = scan.nextInt();
		
		System.out.print("All prime numbers from 2 to "+ n + " are: ");
		for (int i =0 ; i < n; i++) {
			if(primeNum(i)) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}
	static boolean primeNum(int i) {
		if (i < 2) {
			return false;
		}
		for (int j = 2; j * j <= i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	} 
}
