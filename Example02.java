// ����ó�� : Try ~ catch ~ (finally) 3������ ��� ó��
// Try : ���ܰ� �߻��� �� �ִ� �ڵ��
// catch : ���ܸ� ó���ϴ� �ڵ�
// finally : ���ܿ� ������� ó���ϴ� ����


public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3();
	}

	public static void test1() {
		int number1 = 10, number2 = 0, result = 0;
		
		try {
			result = number1 / number2;//������ ���ܹ߻� ����
			
		}catch(ArithmeticException exp){ //�߻��� ���ܸ� ���
			System.out.println(exp);
			//��������� ArithmeticException���.
		}finally {
			System.out.println(result);
		}
	}
	public static void test2(){
		int a[] = {10, 20, 30};
		try {
			a[4] = 40;
				
		}catch(ArrayIndexOutOfBoundsException exp) {
				System.out.println("�迭 ���ٿ� ������ �ֽ��ϴ�.");
		}
	}
		
	public static void test3() {
		int[] div = {2,0,3,0,4};
		int number = 10;
		
		for(int count = 0; count < 7; count++) {
			try {int result = number / div[count];
				
			}catch(ArithmeticException exp) {
				System.out.println("0���� ���������.");
				
			}catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println("�迭�� ������ ���");
		}
		}
	}
}
