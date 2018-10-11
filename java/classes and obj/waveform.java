import java.util.Scanner;


public class waveform {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[11];
		int i,temp=0;
		for(i=1;i<=10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
		}
		for(i=1;i<=10;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
