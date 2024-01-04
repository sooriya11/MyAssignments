package week3.day3;

public class MySqlConnection implements DbConnection {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Db Conneted ");

	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("db Disconneted");

	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Db Updated");

	}

	public void executeQuery() {
		System.out.println("Db Executed");

	}

}
