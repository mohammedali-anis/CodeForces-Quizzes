import java.util.Scanner;

public class Word {

	Scanner in = new Scanner(System.in);
	int counterUP = 0;
	int counterDOWN = 0;

	public void run() {
		String s = in.next();
		if (s.length() >= 1 && s.length() <= 100) {
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == s.toUpperCase().charAt(i)) {
					counterUP++;

				} else if (s.charAt(i) == s.toLowerCase().charAt(i)) {
					counterDOWN++;
				}
			}

		} else
			System.err.println("Wrong s length !");

		if(counterUP>counterDOWN)
			System.out.println(s.toUpperCase());
		else
			System.out.println(s.toLowerCase());
	}
}
