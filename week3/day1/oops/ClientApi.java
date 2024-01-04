package week3.day1.oops;

public class ClientApi {
	
	public void sendRequest(String endpoint) {
		System.out.println("Sending Request :"+ endpoint);
		
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Sending Request :"+ endpoint);
		System.out.println("Sending RequestBody :"+ requestBody);
		System.out.println(" Request verify :"+ requestStatus);
	}
	
	public static void main(String[] args) {
		ClientApi api = new ClientApi();
		api.sendRequest("apipheny.io");
		api.sendRequest("apipheny.io", "POST /api/2.2/auth/signin HTTP/1.1: ", false);
	}

}
