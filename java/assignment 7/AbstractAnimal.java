abstract class Animal{
	
	public String breed;
	public String color;
	public String name;
	public void speak()
	{
		System.out.println("Hello I am a animal");
	}
	abstract public void eat();
	
}
class Cat1 extends Animal
{
	void get(String z,String x,String y)
	{
		breed=x;
		color=y;
		name=z;
	}
	public void eat()
	{
		System.out.println("I am  "+name+" "+breed+" cat of "+color+" color and I eat frogs");
	}
}
class Dog1 extends Animal
{
	void get(String z,String x,String y)
	{
		breed=x;
		color=y;
		name=z;
	}
	public void eat()
	{
		System.out.println("I am "+name+" "+breed+" dog of "+color+" color and I eat bones");
	}
}
 public class AbstractAnimal {

	public static void main(String[] args) {
	
Dog1 d=new Dog1();
Cat1 c=new Cat1();
d.get("tuffy","pug","black");
d.speak();
d.eat();

c.get("kitty","russian blue", "white");
c.speak();
c.eat();
	}

}
