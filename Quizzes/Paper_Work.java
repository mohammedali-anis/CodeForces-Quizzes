


import java.util.Scanner;

public class Paper_Work {
	Scanner in = new Scanner(System.in);
	int input;
	int counterP;
	int counterN;
	int folder = 1;

	public void run() {
		int n = in.nextInt();
		int[] arr = new int[n];
		if (n >= 1 && n <= 100) {
			for (int i = 0; i < n; i++) {
				input = in.nextInt();
				if (input >= -100 && input <= 100) {
					arr[i] = input;
				} else {
					System.err.println("Invalid Input");
				}
			} // end For Input
		} else {
			System.err.println("Invalid n");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				counterP++;
			} else if (arr[i] < 0) {
				counterN++;
				if (counterN > 2) {
					folder = folder + 1;
					counterN = 1;
				}
			}
		} // end for checking the total counter of the folder !
		System.out.println(folder);

		int sum = 0;
		int negativ = 0;
		int postive = 0;
		int temp = 0;
		int rest = 0;
		int eksik = 0;
		int arti = 0;
		int tempI=0;
		int flag=0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negativ++;
				if (negativ == 3) {
					flag=1;
					sum = i;
					System.out.print((sum - temp) + " ");
					temp = sum;
					negativ = 1;
					rest = temp - n;
					sum = 0;
				} else if (negativ == n) {
					flag=2;
					sum = i;
					System.out.print((sum - temp) + " ");
					temp = sum;
					negativ = 1;
					rest = temp - n;
					sum = 0;
				}

			} else if (arr[i] >= 0) {
				flag=3;
				postive++;
				if (postive == n) {
					System.out.println(n);
				}
			}
		}

		for (int i = 0; i < arr.length; i++ ) {
			if (arr[i] < 0) {
				eksik++;
			}
			if (arr[i] >= 0) {
				arti++;
			}
			tempI=i;
			
		}
		if (eksik!=3 && flag!=1 && flag !=2 && flag!=3 ) {
			System.out.print(eksik + arti);
		}

		if (rest < 0)
			System.out.println(Math.abs(rest));

	}// for method
}