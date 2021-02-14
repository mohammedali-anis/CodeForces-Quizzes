import java.util.Scanner;

public class Taxi {

	public void run() {

		Scanner in = new Scanner(System.in);

		int total = 0;
		int total1 = 0;
		int total2=0;
		int total3=0;
		int count1 = 0, count2 = 0, count3 = 0;

		int n = in.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			if (arr[i] == 1)
				count1++;
			if (arr[i] == 2)
				count2++;
			if (arr[i] == 3)
				count3++;
			if (arr[i] == 4)
				total++;
		}

		if (count3 >= count1) {
			total1 = total1 + count3;
			if (count2 % 2 == 0)
				total1 = total1 + count2 / 2;
			else
				total1 = total1 + count2 / 2 + 1;
		} else {
			total2 = total2 + count3;
			count1 = count1 - count3;

			if (count2 % 2 == 0) {
				total2 = total2 + count2 / 2;
			} else {
				total2 = total2 + count2 / 2 + 1;
				count1 = count1 - 2;
			}

			if (count1 > 0) {
				if (count1 % 4 == 0)
					total3 = total3 + count1 / 4;
				else
					total3 = total3 + count1 / 4 + 1;
				
			}
			
		}
		System.out.println(total+total1+total2+total3);
	}

}
