import java.util.Scanner;

public class The_Check_of_the_Point {

	public void run() {
		Scanner in = new Scanner(System.in);
		int a, x, y = 0;
		a = in.nextInt();
		x = in.nextInt();
		y = in.nextInt();

	   if ((x == a && y <= a && y >= 0)  || (x == 0 && y <= a && y >= 0) 
		  || (y == 0 && x <= a && x >= 0)|| (y == a && x <= x && x >= 0))
			System.out.println(1);
		else if (x > 0 && x < a && y > 0 && y < a)
			System.out.println(0);
		else
			System.out.println(2);
	}

}
