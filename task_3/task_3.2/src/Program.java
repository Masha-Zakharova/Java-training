/*�������� ���������: ��������� �� ����� �������� ��������������� ���������� ����������� ����� �
                      1) ��� ���������� �����
                      2) ����� ��� ����
*/

public class Program {

	public static void main(String[] args) {
		
		ThreeDigits a = new ThreeDigits();

		System.out.println("Number: "+a.getNumber());
		System.out.println("Max digit: "+a.maxDigit());
		System.out.println("Sum of digits: "+a.sumOfDigits());
	}
}
