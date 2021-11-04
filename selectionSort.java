import java.util.Scanner;
class Sorting
{
    public static void selectionSort(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    int temp=a[i];
                    a[i]=a[j];
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
        Sorting.selectionSort(arr);
        for(int x:arr)
        {
            System.out.print(x + " ");
        }
        
        
    }
}