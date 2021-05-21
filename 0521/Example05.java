import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 컴포넌트 : 버튼, 레이블, 라디오버튼, 체크박스 등
// 일반 컴포넌트
// 컨테이너 : 일반 컴포넌트나 컨테이너를 담을 수 있는 컴포넌트 (프레임, 패널)
// 레이아웃(배치관리자 : 컴포넌트의 배치방법)
// 기본적인 값은 default로 지정되어있음.

class LayoutFrame1 extends JFrame{
	public LayoutFrame1() {
		// TODO Auto-generated method stub
		setTitle("레이아웃 테스트1");
		setSize(500, 500);
		setLocationRelativeTo(null);
		//무조건 화면 정중앙에 위치하고싶을때
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class LayoutFrame2 extends JFrame{
	public LayoutFrame2() {
		// TODO Auto-generated method stub
		setTitle("레이아웃 테스트2");
		setSize(500, 500);
		setLocationRelativeTo(null);
		// 무조건 화면 정중앙에 위치하고싶을때
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Flow Layout : 컴포넌트를 순차적으로 배치
		FlowLayout flow1 = new FlowLayout();
		// 레이아웃을 프레임에 지정
		// 가로중앙정렬, 간격 hgap=5, vgap=5
		FlowLayout flow2 = new FlowLayout(FlowLayout.LEFT, 50, 50);
		// 왼쪽정렬
		setLayout(flow2);
		// flow1 혹은 flow2의 레이아웃을 지정
		
		
		JButton btnOK = new JButton("확인");
		this.add(btnOK);
		
		JButton btnCancel = new JButton("취소");
		this.add(btnCancel);
		
		
		setVisible(true);
	}
}


class LayoutFrame3 extends JFrame{
	public LayoutFrame3() {
		// TODO Auto-generated method stub
		setTitle("레이아웃 테스트3");
		setSize(500, 500);
		setLocationRelativeTo(null);
		// 무조건 화면 정중앙에 위치하고싶을때
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Border Layout : 컨테이너 공간을 동, 서, 남, 북 중앙
		BorderLayout border = new BorderLayout(20, 20);
		setLayout(border);
		
		// 컴포넌트를 동,서,남,북으로 지정.
		JButton btnOK = new JButton("확인");
		this.add(btnOK, BorderLayout.WEST);
		
		JButton btnCancel = new JButton("취소");
		this.add(btnCancel, BorderLayout.EAST);
		JButton btnA = new JButton("A");
		this.add(btnA, BorderLayout.NORTH);
		
		JButton btnB = new JButton("B");
		this.add(btnB, BorderLayout.SOUTH);
		
		JButton btnC = new JButton("C");
		this.add(btnC, BorderLayout.CENTER);
		
		setVisible(true);
	}
}
class LayoutFrame4 extends JFrame{
	public LayoutFrame4() {
		// TODO Auto-generated method stub
		setTitle("레이아웃 테스트4");
		setSize(500, 500);
		setLocationRelativeTo(null);
		//무조건 화면 정중앙에 위치하고싶을때
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Grid Layout : 컨테이너를 격자모양 (테이블)
		GridLayout grid = new GridLayout(3,6);
		setLayout(grid);
		
		JButton btnA = new JButton("A");
		this.add(btnA);
		
		JButton btnB = new JButton("B");
		this.add(btnB);
		
		JButton btnC = new JButton("C");
		this.add(btnC);
		
		JButton btnD = new JButton("D");
		this.add(btnD);
		
		JButton btnE = new JButton("E");
		this.add(btnE);
		
		setVisible(true);
		
	}

}

class LayoutFrame5 extends JFrame{
	public LayoutFrame5() {
		// TODO Auto-generated method stub
		setTitle("레이아웃 테스트5");
		setSize(500, 500);
		setLocationRelativeTo(null);
		// 무조건 화면 정중앙에 위치하고싶을때
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 배치관리자가 없는 경우
		// 개발자가 컴포넌트의 위치를 직접 지정
		setLayout(null);
		
		JButton btnA = new JButton("A");
		this.add(btnA);
		btnA.setSize(50,50);
		btnA.setLocation(100, 100);
		
		for(int count = 1; count <= 5; count++) {
			// 버튼의 이름은 문자열
			JButton btn = new JButton(Integer.toString(count));
			// Integer.toString 정수값을 문자열로 바꾸어주는것.
			btn.setSize(50, 50);
			btn.setLocation(count*50, count*50);
			this.add(btn);
		}
		
		setVisible(true);
		
	}
}


public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test5();
	}

	public static void test1() {
		LayoutFrame1 myframe = new LayoutFrame1();
		// 버튼의 정의 (JButton 클래스를 활용)
		JButton btnOK = new JButton("확인");
		// 생성자를 통해서 이름을 지정.
		myframe.add(btnOK);
		
		JButton btnCancel = new JButton("취소");
		// 생성자를 통해서 이름을 지정.
		myframe.add(btnCancel);
		
		myframe.setVisible(true);

		// 프레임의 기본 레이아웃은 Border Layout이기때문에 화면의 틀에 꽉차게 나옴.
		// 확인버튼 위에 취소버튼이 올라가버림 -> 배치관리자의 필요성!
		
	}
	
	public static void test2() {
		//Flow Layout
		new LayoutFrame2();
	}
	
	public static void test3() {
		//Border Layout
		new LayoutFrame3();
	}
	
	public static void test4() {
		//Border Layout
		new LayoutFrame4();
	}
	
	public static void test5() {
		//Border Layout
		new LayoutFrame5();
	}
	
}
