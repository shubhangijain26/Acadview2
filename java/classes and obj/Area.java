class Rectangle
{
	float area,length=20,breadth=60;
	void CalculateArea()
	{
		area=length*breadth;
		System.out.println("Area is: "+area);
	}
	
};
public class Area {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.CalculateArea();
		

	}

}
