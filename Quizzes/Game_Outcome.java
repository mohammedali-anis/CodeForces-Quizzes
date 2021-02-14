import java.util.Scanner;

public class Game_Outcome {
	Scanner in = new Scanner(System.in);
	int n;
	int input;
	int xSum;
	int ySum;
	int result;
	public void run() {
		n = in.nextInt();
		if (n >= 1 && n <= 30) {
			int[][] arr = new int[n][n];
			int[] c = new int[n];
			int[] r = new int[n];
			// For input the value
			for (int x = 0; x < arr.length; x++) {
				for (int y = 0; y < arr.length; y++) {
					input = in.nextInt();
					if (input >= 1 && input <= 100) {
						arr[x][y] = input;
					} else
						System.err.println("Unvalid input value");
				}
			} // for the Input value's For
			for (int x = 0; x < arr.length; x++) {
				for (int y = 0; y < arr.length; y++) {
					xSum = xSum + arr[x][y];
					ySum = ySum + arr[y][x];
				}
				r[x] = xSum;
				xSum = 0;
				c[x] = ySum;
				ySum = 0;
			}
			for (int i = 0; i < r.length; i++) {
				for (int j = 0; j < c.length; j++) {
					if (c[i] > r[j]) {
						result++;
					}
				}
			}
		} else {
			System.err.println("Unvalid n value");
		}
		System.out.println(result);
	}// for Method
}// for Class