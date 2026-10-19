package homework;
import java.util.Scanner;
public class Homework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, sum = 0, count = 0;
		System.out.print("Please enter a number: ");
		num = scan.nextInt();
		while (num > 1000) {
			System.out.print("Invalid number. Please rewrite your number: ");
			num = scan.nextInt();
		}
		for (int k = 1000; k >= num; k--) {
			System.out.println(k + " ");
			sum += k;
			count++;
		}
		System.out.println("Sum of the number: " +sum);
		float average = sum / count;
		System.out.println("The average of the number: " +average);
		scan.close();
	}
}
