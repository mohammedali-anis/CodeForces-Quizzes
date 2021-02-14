import java.util.Scanner;

public class Queue_at_the_School {

	Scanner in = new Scanner(System.in);

	int n = in.nextInt();
	int t = in.nextInt();
	String s = in.next();
	char swap;

	public void run() {
		char[] arr = new char[n];
		if (n >= 1 && n <= 50 && t >= 1 && t <= 50) {
			arr = s.toCharArray();

			for (int j = 0; j < t; j++) {
				for (int i = 0; i < n - 1; i++) {

					if (arr[i] == 'B' && arr[i + 1] == 'G') {
						swap = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = swap;
						i++;
					}
				}
			}
		} else
			System.err.println("Wrong Input !");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
