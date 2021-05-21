import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

// GUI 인터페이스
// GUI 객체를 생성하는 방법
// 1. AWT
//  -운영체제가 제공하는 자원을 이용하여 컴포넌트를 생성
//	-여러 플랫폼에서 쉽게 컴포넌트를 제공
//	-플랫폼에 종속되므로 컴포넌트가 다르게 보일 수 있다

// 2. Swing: 
//  -컴포넌트가 Java로 작성
//	-어떤 플랫폼에서도 일괄적인 화면을 제공
//	-AWT보다 더 많은 컴포넌트를 제공
//	-AWT와의 클래스 이름의 중복을 피하기 위해 스윙클래스에는 앞에 J가 붙음.
class Basicframe1 extends JFrame{ //JFrame을 상속받음.
	
}

class Basicframe2 extends JFrame{
	
	public Basicframe2(){
		setTitle("테스트3"); // 이름을 지정
		setSize(500, 500); // 프레임의 크기(픽셀단위)
		setLocation(600, 200); // 프레임의 위치
		setResizable(false); // 크기조절 금지
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X버튼을 눌렀을 때 프로그램이 종료.
		setVisible(true);// 프레임을 나타내게함
	}
}

class Basicframe3 extends JFrame{
	
	public Basicframe3() {
		setTitle("테스트4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X버튼을 눌렀을 때 프로그램이 종료.
		setVisible(true);// 프레임을 나타내게함
		//setSize;
		//setLocation(600, 200);
		
		// 프레임의 크기를 Dimension클래스의 객체를 사용하여 크기를 지정
		// Dimension 클래스 : 폭과 높이 정보를 가지는 객체
		// 모니터 해상도, 윈도우 크기 자원을 관리하기 위해서 정의.
		Dimension mydim = new Dimension(500, 500);
		// 생성자를 통해서 가로 세로 정보를 저장.
		// Dimension 정보로 프레임의 크기를 결정.
		setPreferredSize(mydim);
		pack();//pack이라는 메소드를 마지막에 써서 지정된 크기로 설정.
		
		// 프레임의 위치
		// 자신의 해상도 정보를 기준으로 프레임의 위치를 결정.
		// 해상도의 정보 가져와서 위치를 결정
		// Toolkit 클래스를 활용하여 위치 정보를 얻어옴
		// Toolkit 클래스 : 자신의 시스템 자원의 정보에 접근할 수 있는 클래스.
		// 폰트정보, 커서의 사이즈, 화면정보, 이미지 가져오기 등.
		// 이 클래스는 대부분이 정적 메서드로 구성
		Toolkit mykit = Toolkit.getDefaultToolkit();
		// 정보를 접근할 수 있는 객체
		Dimension screen = mykit.getScreenSize();//dimension정보로 리턴
		// 현재 화면의 해상도
		System.out.println(screen);
		setPreferredSize(screen);
		pack();
		// 가로: width, 세로: height
		
		
		setLocation(screen.width / 2, screen.height / 2);
		// 정중앙 지정
		
		// 프레임 아이콘 지정
		// 일반이미지를 자원으로 사용하기 위해서 toolkit 객체를 활용
		Image icon = mykit.getImage("info.png");
		setIconImage(icon);// 아이콘이미지!
	}
}

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.메인클래스에서 JFrame을 상속받아 구현하는 방법도 있음.
		// 2.JFrame을 상속 받은 클래스를 정의하여 구현하는 방법. 
		test4();

	}
	
	public static void test1() {
		JFrame myframe = new JFrame("테스트1");
		myframe.setSize(500, 500); // 프레임의 크기(픽셀단위)
		myframe.setLocation(600, 200); // 프레임의 위치
		myframe.setVisible(true);
		
		
	}
	
	public static void test2() {
		// JFrame을 상속받은 클래스로 프레임을 생성
		Basicframe1 myframe = new Basicframe1();
		myframe.setTitle("테스트2"); // 이름을 지정
		myframe.setSize(500, 500); // 프레임의 크기(픽셀단위)
		myframe.setLocation(600, 200); // 프레임의 위치
		myframe.setResizable(false); // 크기조절 금지
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X버튼을 눌렀을 때 프로그램이 종료.
		myframe.setVisible(true);// 프레임을 나타내게함
		
		
	}
	
	public static void test4() {
		new Basicframe3();
	}
	

}
