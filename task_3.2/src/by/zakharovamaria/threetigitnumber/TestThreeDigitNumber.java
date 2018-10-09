//Написать программу: выводящую на экран случайно сгенерированное трёхзначное натуральное число и
//                    1) его наибольшую цифру
//                    2) сумму его цифр

package by.zakharovamaria.threetigitnumber;

public class TestThreeDigitNumber {
	
	public static void main(String[] args) {
		
		RandomThreeDigitNumber a = new RandomThreeDigitNumber();

		System.out.println("Number: "+a.getNumber());
		System.out.println("Max digit: "+a.maxDigit());
		System.out.println("Sum of digits: "+a.sumOfDigits());
	}
}
