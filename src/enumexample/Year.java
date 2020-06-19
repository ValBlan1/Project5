package enumexample;

public class Year {
	
	
	
	public Month month;
	
	public Year() {}
	public Year(Month month) {
		this.month= month;
	}
	
	public void taskToDo(Month month) {
		this.month = month;
		switch(month) {
		case January:
			System.out.println("New Year");
		break;
		case Febrary:
			System.out.println("Valentine's Day");
		break;
		case March:
			System.out.println("St. Patrick's Day");
		break;
		
		case April:
			System.out.println("World Heritage Month");
		break;
		case May:
			System.out.println("Mother's Day");
		break;
		case June:
			System.out.println("Fathe's Day");
		break;
		case July:
			System.out.println("Happy 4th");
		break;
		case August:
			System.out.println("Friendship Month");
		break;
		case September:
			System.out.println("End of Summer");
		break;
		
		case Octuber:
			System.out.println("Hallowen");
		break;
		case November:
			System.out.println("Thanksgiving");
		break;
		case December:
			System.out.println("Christmas");
		break;
		
		default:
			System.out.println("not a valid month");
		break;
		
		
		
		}
	}

}
