import java.util.Scanner;

public class Elephant {

	Scanner in = new Scanner(System.in);

	public void run() {
		int n = in.nextInt();
		if (n % 5 == 0)
			System.out.println(n / 5);
		else
			System.out.println((n / 5) + 1);
	}
}
