package week3.day3;

abstract class CanaraBank implements Payments {
    public void recordPaymentDetails() {
    	System.out.println("Payemnt details record");
    }
    	
    public void cashOnDelivery() {
        System.out.println("Amazon: Processing Cash on Delivery payment");
    }

    public void upiPayments() {
        System.out.println("Amazon: Processing UPI payment");
    }

    public void cardPayments() {
        System.out.println("Amazon: Processing Card payment");
    }

    public void internetBanking() {
        System.out.println("Amazon: Processing Internet Banking payment");
    }

  
    
}

