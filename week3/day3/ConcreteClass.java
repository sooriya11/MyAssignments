package week3.day3;

public class ConcreteClass implements DataBaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteClass db = new ConcreteClass();
		db.connect();
		db.disconnect();
		db.executeUpdate();

	}

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("DataBase is Connected");

	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DataBase Is Disconneted");

	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("DataBase is updating");

	}

}
