import java.util.Scanner;

public class Next_Round {
	Scanner in = new Scanner(System.in);
	static int temp = 200; // just a big number has been used for the sorting
	public void run() {
		int n = in.nextInt(); // number of Players
		int k = in.nextInt(); // The Index of the Players that's mean the score of the player k
		int count = 0;
		int input = 0;
		
		
		if (n >= 1 && n <= 50 && n >= k) {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				input = in.nextInt();
				if (input >= 0 && input <= 100 && input <= temp) {
					temp = input;
					arr[i] = input;
				} else 
					System.err.println("Wrong Input not Descending or over the range ...");
			}

			for (int i = 0; i < arr.length; i++) {
				if ((arr[i] >= arr[k - 1]) && arr[i] > 0) {
					count++;
				}
			}
		} else {
			System.err.println("Wrong Size !");
		}
		System.out.println(count);
	}
}