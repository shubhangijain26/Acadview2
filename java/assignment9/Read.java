
import java.io.*;


public class Read {

	public static void main(String[] args) {
		
		File f=new File("C:/Users/hp/Desktop/java/assignment9/abc.txt");
		
		try{
			FileOutputStream fout=new FileOutputStream(f);
			FileInputStream fin=new FileInputStream(f);
			
			String s="this is abc text file";
			
			char[] a=s.toCharArray();
			
			for(int i=0;i<s.length();i++)
			{
				fout.write(a[i]);
			}
			
			int i=fin.read();
			while(i!=-1)
			{
				System.out.println((char)i);
				i=fin.read();
			}
			 System.out.println("Path is:"+f.getPath());
			fout.close();
			fin.close();
		}
		catch(IOException e)
		{
    	 System.out.println(e);
		}

	}

}
