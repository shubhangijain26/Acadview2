import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] d=s.toCharArray();
		char[] e=new char[20];
		int i,j,len;
		len=s.length();
		for(i=0,j=len-1;i<len;i++,j--)
		{
			e[j]=d[i];
		}

		
		for(i=0;i<len;i++)
		{
			System.out.print(e[i]);
		}
    sc.close();
	}

}
