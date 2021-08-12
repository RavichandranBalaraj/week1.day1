package week1.day2;

public class MyCaluclator {

	public static void main(String[] args) {
		calculator calc=new calculator();
System.out.println(calc.add(3, 5, 7));
System.out.println(calc.sub(4, 5));
System.out.println(calc.mul(45, 2));
System.out.println(calc.div(432, 8));

	}

}
class calculator
{
	public int add(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	public int sub(int num1, int num2)
	{
		return num1-num2;
	}
	public double mul(double num1, double num2)
	{
		return num1*num2;
	}
	public float div(float num1, float num2)
	{
		return num1/num2;
	}
}