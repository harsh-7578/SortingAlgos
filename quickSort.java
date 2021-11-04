//Quick Sort
import java.util.Scanner;
class Sorting
{
    private static int partition(int a[],int si,int ei)
    {
        int pivot = a[si];
        int count=0;
        for(int i=si+1;i<=ei;i++)
        {
            if(a[i]<pivot)
            {
                count++;
            }
        }
        int pivotIndex=si+count;
        a[si]=a[pivotIndex];
        a[pivotIndex]=pivot;
        int i=si;
        int j=ei;
        while(i<j)
        {
            while(i<=pivotIndex && a[i]<pivot)
            {
                i++;
            }
            while(a[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
        
    }
    public static void quickSort(int a[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pivotpos=partition(a,si,ei);
        quickSort(a,si,pivotpos-1);
        quickSort(a,pivotpos+1,ei);
    }
    public static void quickSort(int a[])
    {
        quickSort(a,0,a.length-1);
    }
}

public class Main
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
		Sorting.quickSort(arr);
		for(int x:arr)
		{
			System.out.print(x + " ");
		}
		s.close();
		
	}
}