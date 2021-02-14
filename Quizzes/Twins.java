import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Twins {

	Scanner in = new Scanner(System.in);

	public void run() {

		int n = in.nextInt();
		int input = 0;
		int gesamt = 0;
		if (n >= 1 && n <= 100) {
			int sum = 0;
			Integer[] arr = new Integer[n];

			for (int i = 0; i < n; i++) {
				input = in.nextInt();
				if (input >= 1 && input <= 100) {
					arr[i] = input;
					sum = sum + arr[i];
				} else
					System.err.println("Wrong input");
			}

			Arrays.sort(arr, Collections.reverseOrder());

			for (int i = 0; i < arr.length; i++) {
				gesamt = gesamt + arr[i];

				if (gesamt > sum - gesamt) {
					System.out.println(i + 1);
					break;
				}
			}

		} else
			System.err.println("Wrong n !");
	}
}
