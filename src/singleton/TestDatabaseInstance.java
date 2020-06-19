package singleton;

public class TestDatabaseInstance {

	public static void main(String[] args) {
		DatabaseInstance dataBaseInstance = DatabaseInstance.getInstance();
		dataBaseInstance.connectDatabase();

	}

}
