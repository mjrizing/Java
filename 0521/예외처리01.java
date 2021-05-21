// 예외(Exception)처리
// 오류처리
// 오류: 컴파일상에서 발생, 실행(런타임)에서 발생
// 프로그램 수행중 발생된 오류에 대해서는 디버깅을 통해 수정해 나가야한다.
// 실행중에 발생한 오류는 피해가야 함(중간에 프로그램이 멈추지 않도록 조치.)
// throw란 현재 상황에서 발생한 오류정보를 던져준다는 개념.
// error는 컴퓨터자체에 문제가 생겨서 발생한 오류. (컴퓨터 시스템적인 문제)
// Exception은

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test6();
	}

	
	public static void test1() {
		//ArithmeticException Exception:클래스의 상속을 받아서 Arithmetic
		int number1 = 10, number2 = 0, result;
		result = number1 / number2;
		System.out.println(result);
		// 출력시 Exception in thread 오류발생
		
		
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
		//NullPointerException: s는 문자열을 가르키는 포인터. 객체가 존재x
		String s = null; //null로 초기화
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
		int number = Integer.parseInt(s);//parseInt메소드는 s를 정수로 바꿔주는 메소드.
		System.out.println(number);
	}
	
}
