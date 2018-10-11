
public class Pattern1 {

	public static void main(String[] args)
	{
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
