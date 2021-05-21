// ����(Exception)ó��
// ����ó��
// ����: �����ϻ󿡼� �߻�, ����(��Ÿ��)���� �߻�
// ���α׷� ������ �߻��� ������ ���ؼ��� ������� ���� ������ �������Ѵ�.
// �����߿� �߻��� ������ ���ذ��� ��(�߰��� ���α׷��� ������ �ʵ��� ��ġ.)
// throw�� ���� ��Ȳ���� �߻��� ���������� �����شٴ� ����.
// error�� ��ǻ����ü�� ������ ���ܼ� �߻��� ����. (��ǻ�� �ý������� ����)
// Exception��

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test6();
	}

	
	public static void test1() {
		//ArithmeticException Exception:Ŭ������ ����� �޾Ƽ� Arithmetic
		int number1 = 10, number2 = 0, result;
		result = number1 / number2;
		System.out.println(result);
		// ��½� Exception in thread �����߻�
		
		
	}
	
	public static void test2() {
		//ArrayIndexOutOfBoundsException: 
		int a[] = {10, 20, 30};
		a[4] = 40;
		
	}
	
	public static void test3() {
		//StringIndexOutOfBoundsException:
		String s = "Hello";
		char ch = s.charAt(5);
		System.out.println(ch);
	}
	
	public static void test4() {
		//NullPointerException: s�� ���ڿ��� ����Ű�� ������. ��ü�� ����x
		String s = null; //null�� �ʱ�ȭ
		int len = s.length();
		System.out.println(len);
	}
	
	public static void test5() {
		//ClassCastException
		Object number = new Integer(100);
		System.out.println((char)number);
	}
	
	public static void test6() {
		//NumberFormatException
		String s = "Hello";
		int number = Integer.parseInt(s);//parseInt�޼ҵ�� s�� ������ �ٲ��ִ� �޼ҵ�.
		System.out.println(number);
	}
	
}
