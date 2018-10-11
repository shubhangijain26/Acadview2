class Demo
{
	int a;
	Demo()
	{
		a=10;
	}
	Demo(int a)
	{
		this();
	}
	void show()
	{
		System.out.println("value of a is: "+a);
	}
}

public class callConstructor {

	public static void main(String[] args) {
		
Demo d=new Demo(50);
d.show();
	}

}
