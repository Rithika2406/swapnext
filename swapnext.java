import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    int n=S.nextInt();
	    int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=S.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
		    if(i%2==0)
		    {
		        int temp=arr[i];
		        arr[i]=arr[i+1];
		        arr[i+1]=temp;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}