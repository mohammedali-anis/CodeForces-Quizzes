import java.util.Scanner;

public class Voting_for_Photos {
	Scanner in = new Scanner(System.in);

	public void run() {

		int n;
		int[] arr = new int[1001];
		int[] arr2 = new int[1000001];
		n = in.nextInt();

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			arr2[arr[i]]++;
		}

		int b = 0;
		for (int j = 0; j < n; j++) {
			if (arr2[arr[j]] > b)
				b = arr2[arr[j]];
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			arr2[arr[i]]++;
			if (arr2[arr[i]] == b) {
				System.out.println(arr[i]);
				break;
			}
		}

	}
}