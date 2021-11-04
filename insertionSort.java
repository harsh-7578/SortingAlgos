import java.util.Scanner;
class Sorting
{
    public static void insertionSort(int a[])
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(a[j-1]>a[j])
                {
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Size Of Array : ");
        int length= s.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++)
        {
            System.out.println("Enter Element : " + (i+1));
            arr[i]=s.nextInt();
        }
        for(int x:arr)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        Sorting.insertionSort(arr);
        for(int x:arr)
        {
            System.out.print(x + " ");
        }
        
        
    }
}