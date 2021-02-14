import java.util.Scanner;

public class Football {

	Scanner in = new Scanner(System.in);
	String s;
	int counter1;
	int counter0;
	boolean one;
	boolean zero;

	public void run() {
		s = in.next();
		char[] arr = new char[s.length()];
		arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				counter1++;
				if (counter1 >= 7)
					one = true;
			} else
				counter1 = 0;
		} // for checking if the 7s 1 together

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				counter0++;
				if (counter0 >= 7)
					zero = true;
			} else
				counter0 = 0;
		} // for checking if the 7s 0 together

		if (one == true || zero == true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
