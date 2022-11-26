import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("Enter two String:");
		Scanner scanner = new Scanner(System.in);
		String letter1 = scanner.nextLine();
		String letter2 = scanner.nextLine();
		char ch1[] = letter1.toCharArray();
		char ch2[] = letter2.toCharArray();
		int num1[] = new int[ch1.length];
		int num2[] = new int[ch2.length];
		for (int i = 0; i < ch2.length; i++)
			num2[i] = ch2[i] - 'a' + 1;
		for (int i = 0; i < ch1.length; i++)
			num1[i] = ch1[i] - 'a' + 1;
		for (int i = 0; i < ch1.length; i++) {
			num1[i] = (num2[i] + num1[i]);
			if (num1[i] > 26)
				num1[i] = num1[i] - 26;
		}
		System.out.println("Encrypting String:");
		for (int i = 0; i < num1.length; i++) {
			num1[i] = num1[i] + 'a' - 1;
			String str = Character.toString((char) num1[i]);
			System.out.print(str);
		}
	}
}