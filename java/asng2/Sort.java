


public class Sort {

	public static void main(String[] args) {
		int a[]=new int[12],temp;
		int i,j;
		a[0]=1;
		a[1]=1;
		a[2]=1;
		a[3]=1;
		a[4]=0;
		a[5]=0;
		a[6]=1;
		a[7]=0;
		for(i=0;i<8;i++)
		{
			for(j=0;j<8-i-1;j++)
			{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
		}
		System.out.println("Sorted array is:");
		for(i=0;i<8;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
