import java.util.Scanner;

public class Soldier_and_Bananas {

	Scanner in = new Scanner(System.in);

	int k; // the price of one Banana
	int n; // how much he has $
	int w; // how many he wants to buy
	int total = 0;

	public void run() {

		k = in.nextInt();
		n = in.nextInt();
		w = in.nextInt();
		if (k >= 1 && k <= 1000 && w >= 1 && w <= 1000 && n >= 0 && n <= Math.pow(10, 9)) {

			for (int i = 1; i <= w; i++) {
				total = total + (i * k);
			}

		} else
			System.err.println("Wrong inputs");

		if (total <= n)
			System.out.println(0);
		else
			System.out.println(total - n);
	}
}
