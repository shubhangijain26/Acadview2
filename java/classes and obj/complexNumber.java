class Complex
{
	int real;
	int imag;
	Complex(int x,int y)
	{
		real=x;
		imag=y;
	}
	void Display()
	{
		System.out.println("Complex number is: "+real+" + "+imag+"i");
	}
}
public class complexNumber {

	public static void main(String[] args) {
		Complex c=new Complex(10,2);
		c.Display();

	}

}
