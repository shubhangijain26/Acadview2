class abc
{
	public void print(String x)
	{
		System.out.println(x);
	}
	public void print(int a) 
	{ 
		System.out.println("this is an integer");
	}
	public void print(float a) 
	{ 
		System.out.println("this is a float");
	}
}
public class PrintOverride {

	public static void main(String[] args)
	{
		abc obj=new abc();
		obj.print(null);
		obj.print(10);
		obj.print(20.5f);
	}

}
