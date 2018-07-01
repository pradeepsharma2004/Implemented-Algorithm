import java.util.*;
public class InsertionSort
{
	public void Insertion(int a[])
	{
		int i=0,key,n=a.length;
		for(int j=1;j<n;j++)
		{
			key=a[j];
			i=j-1;
			while(i>=0 && a[i]>key)
			{
				a[i+1]=a[i];
				i--;
			}
			a[i+1]=key;
		}
	
		for(int k=0;k<n;k++)
		{
			System.out.print(a[k]+"   ");
		}
	
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		InsertionSort is=new InsertionSort();
		
		System.out.println("Enter Size of array");
		
		int len=sc.nextInt();
		int arr[]=new int[len];
		
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		is.Insertion(arr);
	}

}
