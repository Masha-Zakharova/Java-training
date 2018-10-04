import java.util.Random;


public class MyArray {

	
	private String[] strArr= new String[10];
	public String[] getStrArr() {
		return strArr;
	}
	public void setStrArr(String[] strArr) {
		this.strArr = strArr;
	}
	
	
	private int[] intArr = new int[getStrArr().length];
	
		
	public void setRandStrArray() {           
		for(int i=0; i<getStrArr().length; i++) {
			Random random = new Random();
			getStrArr() [i]= Integer.toString(random.nextInt(30));     // рандомные числа в диапазоне [0;30]
		}
	}
	
	
	public void printArray() {
		System.out.print("Array: ");
		for(int i=0; i<getStrArr().length; i++) {
			System.out.print(getStrArr()[i]+" ");
		}
		System.out.println(" ");
	}
	
	
	public String sumStrArray() {               // возвращает строку сумму чисел строкового массива strArr
		int sum = 0;
		for(int i=0; i<getStrArr().length; i++) {
			intArr[i]=Integer.parseInt(getStrArr()[i]);    // перезаписываем строковый массив в целочисленный
			sum += intArr[i];
		}
		return Integer.toString(sum);
	}
}
