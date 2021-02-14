import java.util.Scanner;

public class IQ_Test {
	Scanner in = new Scanner(System.in);
	int gerade;
	int ungerade;
		public void run() {
			int n = in.nextInt();
			if (n >= 3 && n <= 100) {
				int[] arr = new int[n];
				for (int i = 0; i < n; i++) {
					int input = in.nextInt();
					if (input >= 0 && input <= 100) {
						arr[i] = input;
					} else {
						System.err.println("Invalid input value >100 or <100");
					}
				} // For Input
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] % 2 == 0) {
						gerade++;
					} else {
						ungerade++;
					}
				}
				if (gerade > ungerade) {
					for (int i = 0; i < arr.length; i++) {
						if (arr[i] % 2 != 0) {
							System.out.println(i+1);
						}
					}
				} else if (gerade == ungerade) {
					System.out.println("No Output");
				} else {
					for (int i = 0; i < arr.length; i++) {
						if (arr[i] % 2 == 0) {
							System.out.println(i+1);
						}
					}
				}
			} else {
				System.err.println("Invalid n value <3 or <100");
			}
		}
	}