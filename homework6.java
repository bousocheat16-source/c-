package homework;
import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] subjects = {"Math", "English", "Physics", "Programming"};
		int[] scores = new int[4];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;

		System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
		for (int i = 0; i < 4; i++) {
			scores[i] = scan.nextInt();
			sum += scores[i];
			if (scores[i] > max) max = scores[i];
			if (scores[i] < min) min = scores[i];
		}

		double average = sum / 4.0;

		System.out.println("Max score is: " + max + " (" + courses(subjects, scores, max) + ").");
		System.out.println("Min score is: " + min + " (" + courses(subjects, scores, min) + ").");
		System.out.printf("Average score of this student is: %.2f%n", average);
		scan.close();
	}

	static String courses(String[] subjects, int[] scores, int target) {
		String result = "";
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == target) {
				if (count > 0) {
					result += " and ";
				}
				result += subjects[i];
				count++;
			}
		}
		return result + (count == 1 ? " course" : " courses");
	}
}


