import java.util.Scanner;

public class VowelsCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String input = scanner.nextLine();
		
		System.out.println(vowelsCheck(input));
	}

	public static boolean vowelsCheck(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}
