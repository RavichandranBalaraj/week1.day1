package week1.day2;

public class MyCaluclator {

	public static void main(String[] args) {
System.out.println(calculator.add(3, 5, 7));
System.out.println(calculator.sub(4, 5));
System.out.println(calculator.mul(45, 2));
System.out.println(calculator.div(432, 8));

	}

}
class calculator
{
	public static int add(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	public static int sub(int num1, int num2)
	{
		return num1-num2;
	}
	public static double mul(double num1, double num2)
	{
		return num1*num2;
	}
	public static float div(float num1, float num2)
	{
		return num1/num2;
	}
}