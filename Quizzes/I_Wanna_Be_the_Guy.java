import java.util.Scanner;

public class I_Wanna_Be_the_Guy {

	Scanner sc = new Scanner(System.in);
	
	
	

	public void run() {
		
		int n = sc.nextInt();
		int p, q;
		int ctr = 0;
		int[] a = new int[n];
		boolean guy = true;
		
		for(int i = 0; i < n; i++)
		{
			a[i] = 0;
		}
		
		p = sc.nextInt();
		for(int j = 0; j < p; j++)
		{
			a[sc.nextInt()-1]++;
		}
		
		q = sc.nextInt();
		for(int j = 0; j < q; j++)
		{
			a[sc.nextInt()-1]++;
		}
		
		for(int i = 0; i < n; i++)
		{
			if(a[i] == 0)
			{
				guy = false; 
				break;
			}
		}
			
		if(guy == true)
		{
			System.out.println("I become the guy.");
		}
		else
		{
			System.out.println("Oh, my keyboard!");
		}

	}

}
