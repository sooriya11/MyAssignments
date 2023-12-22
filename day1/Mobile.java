package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile = new Mobile();
		System.out.println("Mobile Informtion");
		System.out.println("************************");
		// iphone.makeCall("iphone15");
		mobile.makeCall();
		mobile.sendMessage();

	}

	public void makeCall() {
		String mobileModel = "IPhone15";
		float mobileWeight = 156.01f;
		System.out.println("Mobile Name:" + mobileModel);
		System.out.println("Mobile Name:" + mobileWeight);

	}

	public void sendMessage() {
		boolean isFullCharged = true;
		int mobileCost = 130000;
		System.out.println("Mobile Name:" + isFullCharged);
		System.out.println("Mobile Name:" + mobileCost);

	}

}
