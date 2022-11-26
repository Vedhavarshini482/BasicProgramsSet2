import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char ch[] = str.toCharArray();
		char name = 'A';
		int large = 0;
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++)
				if (ch[j] == ch[i]) {
					count = count + 1;
					if (count > large)
						large = count;
				}
			if (count > 1) {

				if (ch[i] > name)
					name = ch[i];
			}
		}
		System.out
				.println("Maximum occuring alphabetically greater character : "
						+ name);
		System.out.println("Maximum no of duplicate characters :" + large);
	}
}