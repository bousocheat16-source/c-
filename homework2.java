package homework;
import java.util.Scanner;
import java.util.Locale;
public class homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("=====================================================");
		System.out.println("============== Welcome to our program ===============");
		System.out.println("======= Quadratic Solver of ax^2 + bx + c = 0 =======");
		System.out.println("=====================================================");
		double a, b, c;
		double x1 , x2;
		System.out.print("Input A: ");
		a = sc.nextDouble();
		System.out.print("Input B: ");
		b = sc.nextDouble();
		System.out.print("Input C: ");
		c = sc.nextDouble();
		double delta =  b*b - 4*a*c;
		System.out.println(delta);
		if (a == 0) {
			if (b != 0) {
				double x = -c/b;
				System.out.println("=====================================================");
				System.out.printf("          x = %f, is the only real solution            \n", x);
				System.out.println("=====================================================");
			} else if (c == 0) {
				System.out.println("=====================================================");
				System.out.println("                 Many real solution.");
				System.out.println("=====================================================");
			} else {
				System.out.println("=====================================================");
				System.out.println("                 Infinite solution.");
				System.out.println("=====================================================");
			}
			return;
		}
		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta))/ (2*a);
			x2 = (-b - Math.sqrt(delta))/ (2*a);
			System.out.println("=====================================================");
			System.out.printf("      root of the equation is x1 = %f%nx2 = %f        ", x1, x2);
			System.out.println("=====================================================");
		} else if (delta == 0) {
			x1 = -b/(2*a);
			System.out.println("=====================================================");
			System.out.println("                Solution is: "+ x1 + "               ");
			System.out.println("=====================================================");
		} else {
			System.out.println("=====================================================");
			System.out.println("            There is no real solution                ");
			System.out.println("=====================================================");
		}
		sc.close();
	}

}
