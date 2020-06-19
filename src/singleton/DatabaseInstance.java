package singleton;

public class DatabaseInstance {
	
	
		private DatabaseInstance() {}

		public static DatabaseInstance getInstance() {
			return new DatabaseInstance();
					
		}
		public void connectDatabase() {
			System.out.println("Database is connected and ready to use");
		}
		

}
           