
abstract class Vehicle{
	 abstract void start();

	void stop(){
		System.out.println("vehicle has stopped");
	};
}
class TwoWheeler extends Vehicle{
	void start(){
		System.out.println("two-wheeler is started");
	}
}

class FourWheeler extends Vehicle{
	void start(){
		System.out.println("four-wheeler is started");
	}
} 

public class Details {

	public static void main(String[] args) {
		TwoWheeler t= new TwoWheeler();
		t.start();
		t.stop();
		FourWheeler f= new FourWheeler();
		f.start();
		f.stop();
	}
}
