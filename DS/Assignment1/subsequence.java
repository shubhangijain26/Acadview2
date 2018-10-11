import java.util.*;

public class StringSubsequence {

	public static void sequence(String s,String str){
		
		if(str.length()<0)
			
			return;
		
		System.out.print(s+" ");
		
		for(int i=0; i<str.length(); i++){
		
			sequence(s+str.charAt(i), str.substring(i+1, str.length()));
		}
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		sequence("",s);
		
		sc.close();

	}

}