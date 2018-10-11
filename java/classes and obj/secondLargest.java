import java.util.Scanner;


public class secondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	int arr[]=new int[11];
	int i,max=0,max2=0;
	for(i=0;i<10;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	
	max=arr[0];
	for(i=0;i<10;i++)
	{
		if(max<arr[i])
		{
			max=arr[i];
		}
	}

	max2=arr[0];
	for(i=0;i<10;i++)
	{
		if(max2<arr[i]&&arr[i]<max)
		{
			max2=arr[i];
		}
	}
	
	System.out.println("the second largest element is: "+max2);
      sc.close();
	}

}
