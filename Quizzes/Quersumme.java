package exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam {
	public static ArrayList<Integer> maxList;

	public static int[] max = new int[1001];

	public static int Quersumme(int x) {

		int number = x;

		String num = String.valueOf(x);

		char[] arr = num.toCharArray();

		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(arr.length);

		for (int i = 0; i < arr.length; i++) {

			list.add(Integer.valueOf(String.valueOf(arr[i])));
			sum = sum + list.get(i);
		}

		return sum;

	}

	public static int zw(int x) {

		String str = String.valueOf(Quersumme(x));
		int res = 0;
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			res = res + Integer.valueOf(String.valueOf(arr[i]));

		}

		return res;
	}

	public static int aufgabe6(int x) {

		String num = String.valueOf(x);

		char[] arr = num.toCharArray();

		int sum = 0;
		int res = 1;
		int mul = 1;
		ArrayList<Integer> list = new ArrayList<Integer>(arr.length);
		for (int i = 0; i < arr.length; i++) {

			list.add(Integer.valueOf(String.valueOf(arr[i])));
			mul = mul * list.get(i);

		}
		sum = Quersumme(x);
		res = sum + mul;

		return res;

	}

	public static int getIndexOfLargest(int[] array) {
		if (array == null || array.length == 0)
			return -1; // null or empty

		int largest = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[largest])
				largest = i;
		}
		return largest; // position of the first largest found
	}

	public static void main(String[] args) {

		System.out.println(Quersumme(786));

		System.out.println("---------------------------------");

		System.out.println(zw(79));

		System.out.println("---------------------------------");

		System.out.println(aufgabe6(79));

		System.out.println("---------------------------------");

		for (int i = 0; i < 1001; i++) {
			if (Quersumme(i) == 15) {
				System.out.println("Quersumme == 15");
				System.out.println(i);
			}
		}

		System.out.println("---------------------------------");

		for (int i = 0; i < 1001; i++) {
			if (Quersumme(i) % 7 == 0) {
				System.out.println("Viefach von 7");
				System.out.println(i);
			}
		}

		System.out.println("---------------------------------");

		for (int i = 0; i < 1001; i++) {
			if ((aufgabe6(i)) == i) {
				System.out.println("Aufgabe 6");
				System.out.println(i);
			}
		}

		System.out.println("---------------------------------");

		for (int i = 0; i < max.length; i++) {
			max[Quersumme(i)]++;

		}

		for (int i = 0; i < max.length; i++) {
			System.out.println("The number : " + i + " is repeted : " + max[Quersumme(i)]);

		}

		for (int i = 0; i < max.length; i++) {
			System.err.println(max[i]);

		}

		int maximun = max[getIndexOfLargest(max)];

		ArrayList<Integer> big = new ArrayList<Integer>();
		for (int i = 0; i < max.length; i++) {
			if (max[Quersumme(i)] == maximun)
				big.add(i);

		}

		System.out.println("The most repeted Numbers is : " + big);

	}
}
