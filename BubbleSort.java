
package sortingAlgorithms;

import java.util.*;

class Sorting {
public static void bubblesort(int a[])
{
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
}
}
public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int length=s.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<length;i++)
		{
			System.out.println("Enter Element : " + (i+1));
			arr[i]=s.nextInt();
		}
		System.out.println("Array before sorting");
		for(int x:arr)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Array after sorting");
		Sorting.bubblesort(arr);
		for(int x:arr)
		{
			System.out.print(x + " ");
		}
		s.close();
		
	}
}

