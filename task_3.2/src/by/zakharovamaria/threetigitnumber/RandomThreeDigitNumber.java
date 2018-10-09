package by.zakharovamaria.threetigitnumber;
import java.util.Random;

public class RandomThreeDigitNumber {
	
	public static final int NUMBER_OF_DIGITS = 3;
	public static final int MAX_NUMBER = 999;
	public static final int MIN_NUMBER = 100;
	private static Random random = new Random();
	
	private int number;         // 3-ёхзначное число
	private int[] arrayOfDigits = new int[NUMBER_OF_DIGITS];    // массив для хранения цифр числа

	public RandomThreeDigitNumber() {
		this.number = random.nextInt(MAX_NUMBER-MIN_NUMBER) + MIN_NUMBER;      // рандомные числа в диапазоне [100; 999]
		this.createArrayOfDigits();
	}
	
	private void createArrayOfDigits() {       // заполнение массива цифрами числа
		int tmp = number;
		
		for(int i = 2; i >= 0; i--) {
			arrayOfDigits[i] = tmp % 10;
			tmp /= 10;
		}
	}
	
	public void printArray() {
		System.out.print("Array: ");
		
		for(int i = 0; i < arrayOfDigits.length; i++) {
			System.out.print(arrayOfDigits[i] + " ");
		}
		System.out.println(" ");
	}
		
	public int maxDigit() {                         // наибольшая цифра числа
		int maxValue = arrayOfDigits[0];
		
		for(int i = 0; i < arrayOfDigits.length; i++) {
			if(arrayOfDigits[i] > maxValue) {
				maxValue = arrayOfDigits[i]; 
			}
		}
		return maxValue;
	}
		
	public int sumOfDigits() {                    // сумма цифр числа
		int sum = 0;
		
		for(int i = 0; i < arrayOfDigits.length; i++) {
				sum += arrayOfDigits[i]; 			
		}
		return sum;
	}
	
	public int getNumber() {
		return number;
	}

}
