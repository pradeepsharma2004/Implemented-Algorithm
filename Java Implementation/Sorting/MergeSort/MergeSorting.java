import java.util.Scanner;

public class MergeSorting
{
	public void Merge(int a[],int beg,int mid,int end)
	{
		MergeSorting ms=new MergeSorting();
		int n1,n2,k=beg;
		n1=mid-beg+1;
		n2=end-mid;
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for(int i=0;i<n1;++i)
		{
			L[i]=a[beg+i];
		}

		for(int j=0;j<n2;++j)
		{
			R[j]=a[mid+j+1];
		}
		
		int i=0,j=0;
		
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				a[k]=L[i];
				i++;
			}
			else
			{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
			while(j<n2)
			{
				a[k]=R[j];
				j++;
				k++;
			}
			
	}
	
	public void Merge_Sort(int ar[],int p,int r)
	{
		
		if(p<r)
		{
			int q=(p+r)/2;
			Merge_Sort(ar,p,q);
			Merge_Sort(ar,q+1,r);
			Merge(ar,p,q,r);
		}	
	}
	
	public void PrintArray(int arr[])
	{
		int n= arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		MergeSorting ms=new MergeSorting();
		
		System.out.println("Enter Size of array");
		
		int len=sc.nextInt();
		int arr[]=new int[len];
		
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		ms.PrintArray(arr);
		System.out.println();
		ms.Merge_Sort(arr, 0, arr.length-1);
		ms.PrintArray(arr);
	}

}
