package Leader;

import java.util.Scanner;

public class leader
{
	
	void printLeaders(int arr[], int a)
	{
		for (int i = 0; i < a; i++)
		{
			int j;
			for (j = i + 1; j < a; j++)
			{
				if (arr[i] <=arr[j])
					break;
			}
			if (j == a) 
				System.out.print(arr[i] + ", ");
		}
	}

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		leader lead = new leader();
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		lead.printLeaders(arr, n);
	}
}
