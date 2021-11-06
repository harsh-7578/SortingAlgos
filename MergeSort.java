//Merge Sort
import java.util.Scanner;
class Sorting{
    private static void merge(int a[],int si,int ei)
    {
        int mid=(si+ei)/2;
        int i=si;
        int j=mid+1;
        int k=0;
        int tempArr[]=new int[ei-si+1];
        while(i<=mid && j<=ei)
        {
            if(a[i]<a[j])
            {
                tempArr[k]=a[i];
                i++;
                k++;
            }
            else{
                tempArr[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            tempArr[k]=a[i];
            i++;
            k++;
        }
        while(j<=ei)
        {
            tempArr[k]=a[j];
            j++;
            k++;
        }
        for(int index=0;index<tempArr.length;index++)
        {
            a[si+index]=tempArr[index];
        }
    }
    public static void mergeSort(int a[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(a,si,mid);
        mergeSort(a,mid+1,ei);
        merge(a,si,ei);
    }
  public static void mergeSort(int a[])
  {
      mergeSort(a,0,a.length-1);
  }
}
public class MergeSort
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
		Sorting.mergeSort(arr);
		for(int x:arr)
		{
			System.out.print(x + " ");
		}
		s.close();
		
	}
}
