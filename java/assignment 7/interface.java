interface Animals
{
	void speak();
	void eat();
}
class Dog implements Animals
{
	public void speak()
	{
		System.out.println("I am a dog");
	}
	public void eat()
	{
		System.out.println("I eat pedeigree");
	}
}
class Cat implements Animals
{
	public void speak()
	{
		System.out.println("I am a cat");
	}
	public void eat()
	{
		System.out.println("I eat fish");
	}
}

public class ab {

	public static void main(String[] args) {
	Dog d=new Dog();
	Cat c=new Cat();
	
	d.speak();
	d.eat();
	c.speak();
	c.eat();

	}

}
