package homework;
import java.util.Scanner;
public class homework4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int date, month, year;
		scan.useDelimiter("[-\\s]+");
		System.out.print("Enter your date (year-month-date): ");
		year = scan.nextInt();
		month = scan.nextInt();
		date = scan.nextInt();
		if (ValidDate(date, month, year)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		scan.close();
	}

	static boolean ValidDate (int date, int month, int year) {
		if (year < 1) {
			return false;
		}
		if (month < 1 || month > 12) {
			return false;
		}
		return date >= 1 && date <= dateInMonth(year, month);
		}
	
	static int dateInMonth(int year, int month) {
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} if (month == 2) {
			return LeapYear(year) ? 29 : 28;
		}
		return 31;
	}
	static boolean LeapYear (int year) {
		return (year % 400 == 0) || (year % 4 ==0 && year % 100 != 0);
	}

}


