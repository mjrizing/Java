// 예외처리 : Try ~ catch ~ (finally) 3가지를 묶어서 처리
// Try : 예외가 발생할 수 있는 코드들
// catch : 예외를 처리하는 코드
// finally : 예외와 상관없이 처리하는 문장


public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3();
	}

	public static void test1() {
		int number1 = 10, number2 = 0, result = 0;
		
		try {
			result = number1 / number2;//잠재적 예외발생 가능
			
		}catch(ArithmeticException exp){ //발생할 예외를 명시
			System.out.println(exp);
			//결과값으로 ArithmeticException출력.
		}finally {
			System.out.println(result);
		}
	}
	public static void test2(){
		int a[] = {10, 20, 30};
		try {
			a[4] = 40;
				
		}catch(ArrayIndexOutOfBoundsException exp) {
				System.out.println("배열 접근에 문제가 있습니다.");
		}
	}
		
	public static void test3() {
		int[] div = {2,0,3,0,4};
		int number = 10;
		
		for(int count = 0; count < 7; count++) {
			try {int result = number / div[count];
				
			}catch(ArithmeticException exp) {
				System.out.println("0으로 나누었어요.");
				
			}catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println("배열의 법위를 벗어남");
		}
		}
	}
}
