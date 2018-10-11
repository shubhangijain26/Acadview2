class Demo
{
	int a=70;
	void show()
	{
		System.out.println("value of a is: "+a);
	}
}
class Demo2 extends Demo
{
	
	void show()
	{
		System.out.println("hello");
	}
	void display()
	{
	super.show();
	}
}
public class invokeInstance {

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.display();

	}

}
