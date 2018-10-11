abstract class Animal{
	
	public String breed;
	public String color;
	
	abstract public void speak();
}
class Cat extends Animal
{
	void get(String x,String y)
	{
		breed=x;
		color=y;
	}
	public void speak()
	{
		System.out.println("Hello I am a "+breed+" cat of "+color+" color");
	}
}
class Dog extends Animal
{
	void get(String x,String y)
	{
		breed=x;
		color=y;
	}
	public void speak()
	{
		System.out.println("Hello I am a "+breed+" dog of "+color+" color");
	}
}
 public class AbstractAnimal {

	public static void main(String[] args) {
	
Dog d=new Dog();
Cat c=new Cat();
d.get("pug","black");
d.speak();

c.get("russian blue", "white");
c.speak();

	}

}
