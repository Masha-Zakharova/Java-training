import java.util.Random;

public class ThreeDigits {

	
	private int number;         /* 3-ёхзначное число	*/
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;		
	}
	
	
	private int [] numArray = new int[3];    /* массив для хранения цифр числа*/
	public int [] getNumArray() {
		return numArray;
	}
	public void setNumArray(int [] numArray) {
		this.numArray = numArray;
	}
	
	
	public ThreeDigits() {
		this.randomNum();
		this.setArrayOfDigits();
	}
	
	
	public void randomNum() {
		Random random = new Random();
		setNumber((random.nextInt(899) + 100));   /* рандомные числа в диапазоне [100; 999]*/
	}
	
	
	public void setArrayOfDigits() {       /* заполнение массива цифрами числа */
		int number_1 = getNumber();
		for(int i=2; i>=0; i--) {
			getNumArray()[i] = number_1 % 10;
			number_1 /= 10;
		}
	}

	
	public void printArray() {
		System.out.print("Array: ");
		for(int i=0; i<getNumArray().length; i++) {
			System.out.print(getNumArray()[i]+" ");
		}
		System.out.println(" ");
	}
	
	
	public int maxDigit() {                         /* наибольшая цифра числа */
		int maxValue = getNumArray()[0];
		for(int i=0; i<getNumArray().length; i++) {
			if(getNumArray()[i] > maxValue)
				maxValue = getNumArray()[i]; 			
		}
		return maxValue;
	}
	
	
	public int sumOfDigits() {                    /* сумма цифр числа */
		int sum = 0;
		for(int i=0; i<getNumArray().length; i++) {
				sum += getNumArray()[i]; 			
		}
		return sum;
	}
}


