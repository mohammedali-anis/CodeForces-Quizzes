import java.util.Scanner;

public class George_and_Accommodation {

	Scanner in = new Scanner(System.in);
	int counter = 0;
	int n = in.nextInt();

	public void run() {
		if (n >= 1 && n <= 100) {
			int[] p = new int[n];
			int[] q = new int[n];

			for (int i = 0; i < n; i++) {

				p[i] = in.nextInt();
				q[i] = in.nextInt();
				if (q[i] - p[i] >= 2) {
					counter++;
				}
			} // Input

		}
		System.out.println(counter);
	}
}
