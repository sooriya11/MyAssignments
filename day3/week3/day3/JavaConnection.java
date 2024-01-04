package week3.day3;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
		

	}

}
