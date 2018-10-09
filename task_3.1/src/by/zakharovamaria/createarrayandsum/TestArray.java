// Написать программу, позволяющую получить массив чисел в строках и вернуть строку сумму этих чисел.

package by.zakharovamaria.createarrayandsum;

public class TestArray {

	public static void main(String[] args) {

		CreateArrayAndSum arr = new CreateArrayAndSum();		
		arr.generateRandomArray();
		arr.printArray();
			
		System.out.println("Integer sum: " + arr.sumIntArray());
		System.out.println("String sum: " + arr.sumStrArray());
	}
}
