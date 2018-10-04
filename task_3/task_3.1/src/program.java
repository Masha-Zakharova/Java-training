// Написать программу, позволяющую получить массив чисел в строках и вернуть строку сумму этих чисел.


public class program {

	public static void main(String[] args) {
		
		MyArray arr = new MyArray();
		
		arr.setRandStrArray();
		arr.printArray();
		
		System.out.println("Sum: "+arr.sumStrArray());	
	}

}
