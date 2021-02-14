import java.util.Scanner;

public class Team {

	Scanner in = new Scanner(System.in);
	int count = 0;
	int result;

	public void run() {

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {

			int[] a = new int[3];
			for (int j = 0; j < a.length; j++) {
				a[j] = in.nextInt();
				if (a[j] == 1) {
					count++;
				}
			}
			
			if (count > 1) {
				count = 0;
				result++;
			} 
				count = 0;

		}

		System.out.println(result);
	}

}
