import java.util.Scanner;

public class Chat_Order {

	Scanner in = new Scanner(System.in);

	public void run() {
		int n = in.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != "" && arr[i].equals(arr[j])) {
					arr[i] = "";
				}
			}
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != "")
				System.out.println(arr[i]);
		}

	}

}
