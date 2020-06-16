package oop.abstraction;

public class TestCar {
	public static void main(String[] args) {
		Car car = new Toyota();
		car.start();
		car.stop();
		
		Toyota corolla = new Toyota();
		corolla.drive();
		
		BMW carBMW = new BMW();
		carBMW.start();
		carBMW.stop();
		
		
		MotorCar motorCar = new Toyota();
		motorCar.hybridEngine();
		motorCar.engine();
		
		Vehicle vehicle = new Toyota();
		vehicle.oilEngine();
	}

}
