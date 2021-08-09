package week1.day2;

public class MyMobile {
	public void makeCall()
	{
		System.out.println("makecall");
	}
	public void sendMsg() {
		
		System.out.println("sendMsg");
		}
	private void payBill() {
		System.out.println("payBill");
	}
	public static void main(String[] args) {
		MyMobile obj =new MyMobile();
		obj.makeCall();
		obj.sendMsg();
	}


}
