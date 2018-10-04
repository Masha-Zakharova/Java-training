/*Написать программу: выводящую на экран случайно сгенерированное трёхзначное натуральное число и
                      1) его наибольшую цифру
                      2) сумму его цифр
*/

public class Program {

	public static void main(String[] args) {
		
		ThreeDigits a = new ThreeDigits();

		System.out.println("Number: "+a.getNumber());
		System.out.println("Max digit: "+a.maxDigit());
		System.out.println("Sum of digits: "+a.sumOfDigits());
	}
}
