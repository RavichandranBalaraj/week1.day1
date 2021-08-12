package week1.day1;

public class SumofDigits {

	public static void main(String[] args) {
		int number = 437;
		int digit;
		int sum = 0;
		while (number > 0) {
			digit = (number % 10);
			sum=sum + digit;//sum+=digit
			number = (number / 10);//number/=10
		}
		System.out.println("sum of digits:" + sum);
	}

}
