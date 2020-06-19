package oop.polymorphism;

public class TestLandCalculatro {

	public static void main(String[] args) {
		
		
		LandCalculator cal1 = new LandCalculator();
		cal1.areaOfLand(3, 5);
		int triangle = cal1.areaOfLand(3, 4, 5);
		System.out.println("Triangle Size"+ triangle);
		
		int rectangle = cal1.areaOfLand(3, 4, 5, 7);
		System.out.println("rectangle Size of Land Cal "+ rectangle);
		
		ModernCalculator mCal1 = new ModernCalculator();
		int rectangleOfModerCalculator = mCal1.areaOfLand(3, 4, 5, 7);
		System.out.println("rectangle Size of Modern Cal "+ rectangleOfModerCalculator);

	}

}
