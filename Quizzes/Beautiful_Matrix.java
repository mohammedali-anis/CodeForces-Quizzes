import java.util.Scanner;

public class Beautiful_Matrix {

	Scanner in = new Scanner(System.in);
	int x, y;
	
	public void run() {

		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = in.nextInt();
				if (arr[i][j] == 1) {
					x = i;
					y = j;
				}
			}
		}
		System.out.println(Math.abs(x - 2)+Math.abs(y - 2));
	}
}
