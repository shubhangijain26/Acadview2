import java.util.Scanner;


public class stringInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
        sc.nextLine();
        String d=sc.next();
       
        int x=Integer.parseInt(c);
       int y= Integer.parseInt(d);
     if(x>y)
     {
    	 System.out.println(x+" is greater than "+y);
     }
     else
     {
    	 System.out.println(y+" is greater than "+x);
     }
     sc.close();
	}

}
