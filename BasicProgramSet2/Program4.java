public class Program4 {

	public static void main(String[] args) {
		int num = 3;
		int k;
		for (int i = 1; i <= num + 1; i++) {
			if (i == 1)
				System.out.print("*");
			else {
				for (int j = 1; j <= num; j++)
					if (j == 1 || j == num)
						System.out.print("*");
					else {
						for (k = 1; k < i; k++)
							System.out.print(k);
						for (int l = k - 1; l > 1; l--)
							System.out.print(l - 1);
					}
			}
			System.out.print("\n");
		}
		for (int i = num; i >= 1; i--) {
			if (i == 1)
				System.out.print("*");
			else {
				for (int j = 1; j <= num; j++)
					if (j == 1 || j == num)
						System.out.print("*");
					else {
						for (k = 1; k < i; k++)
							System.out.print(k);
						for (int l = k - 1; l > 1; l--)
							System.out.print(l - 1);
					}
				System.out.print("\n");
			}
		}
	}
}