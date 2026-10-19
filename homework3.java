package homework;
import java.util.Scanner;
import java.util.Arrays;
public class homework3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberArray[] = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter your number " + (i + 1) + ": ");
			numberArray[i] = scan.nextInt();
			if (numberArray[i] < min) {
				min = numberArray[i];
			} if (numberArray[i] > max) {
				max = numberArray[i];
			}
		}
		System.out.println("Among all these 5 numbers: Min is " + min + " and max is: "+ max + ".");
		scan.close();
	}

}
