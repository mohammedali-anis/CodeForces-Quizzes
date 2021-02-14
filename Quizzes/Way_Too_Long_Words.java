import java.util.Scanner;

public class Way_Too_Long_Words {

	
	Scanner in = new Scanner(System.in);

	public void word() {

		int An = in.nextInt();
		if (An > 0 && An <=100) {
			String[] arr = new String[An];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.next().toLowerCase();
			}

			for (int i = 0; i < arr.length; i++) {

				char[] charArr = new char[arr.length];
				charArr = arr[i].toCharArray();

				if (arr[i].length() <= 100) {

					if (charArr.length > 10) {

						int x = charArr.length - 2;
						System.out.println(charArr[0] + "" + x + "" + charArr[charArr.length - 1]);
					} else
						System.out.println(charArr);
					

				}
				else
					System.err.println(">100");
			}
		}

	}
}
