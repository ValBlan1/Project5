package oop.abstraction;

public class Toyota extends MotorCar implements Car {

	public void shape() {
		System.out.println("Every car must have fixed size");
	}
	
	public void start() {	
		System.out.println("The car will have motor engine and you can use the to turn it on");
	}

	public void stop() {
		System.out.println("You should be able to stop the car whenever need to. So we will implement manual break system");
		
		
	}
	
	public void drive() {
		System.out.println("Driving Toyota car");
	}


	public void hybridEngine() {
		System.out.println("developing hybrid engine");
		
		
	}
	public void oilEngine() {
		System.out.println("developing Engine that runs Oil & Gas");
	}
	

}
