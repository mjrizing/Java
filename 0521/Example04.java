import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

// GUI �������̽�
// GUI ��ü�� �����ϴ� ���
// 1. AWT
//  -�ü���� �����ϴ� �ڿ��� �̿��Ͽ� ������Ʈ�� ����
//	-���� �÷������� ���� ������Ʈ�� ����
//	-�÷����� ���ӵǹǷ� ������Ʈ�� �ٸ��� ���� �� �ִ�

// 2. Swing: 
//  -������Ʈ�� Java�� �ۼ�
//	-� �÷��������� �ϰ����� ȭ���� ����
//	-AWT���� �� ���� ������Ʈ�� ����
//	-AWT���� Ŭ���� �̸��� �ߺ��� ���ϱ� ���� ����Ŭ�������� �տ� J�� ����.
class Basicframe1 extends JFrame{ //JFrame�� ��ӹ���.
	
}

class Basicframe2 extends JFrame{
	
	public Basicframe2(){
		setTitle("�׽�Ʈ3"); // �̸��� ����
		setSize(500, 500); // �������� ũ��(�ȼ�����)
		setLocation(600, 200); // �������� ��ġ
		setResizable(false); // ũ������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X��ư�� ������ �� ���α׷��� ����.
		setVisible(true);// �������� ��Ÿ������
	}
}

class Basicframe3 extends JFrame{
	
	public Basicframe3() {
		setTitle("�׽�Ʈ4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X��ư�� ������ �� ���α׷��� ����.
		setVisible(true);// �������� ��Ÿ������
		//setSize;
		//setLocation(600, 200);
		
		// �������� ũ�⸦ DimensionŬ������ ��ü�� ����Ͽ� ũ�⸦ ����
		// Dimension Ŭ���� : ���� ���� ������ ������ ��ü
		// ����� �ػ�, ������ ũ�� �ڿ��� �����ϱ� ���ؼ� ����.
		Dimension mydim = new Dimension(500, 500);
		// �����ڸ� ���ؼ� ���� ���� ������ ����.
		// Dimension ������ �������� ũ�⸦ ����.
		setPreferredSize(mydim);
		pack();//pack�̶�� �޼ҵ带 �������� �Ἥ ������ ũ��� ����.
		
		// �������� ��ġ
		// �ڽ��� �ػ� ������ �������� �������� ��ġ�� ����.
		// �ػ��� ���� �����ͼ� ��ġ�� ����
		// Toolkit Ŭ������ Ȱ���Ͽ� ��ġ ������ ����
		// Toolkit Ŭ���� : �ڽ��� �ý��� �ڿ��� ������ ������ �� �ִ� Ŭ����.
		// ��Ʈ����, Ŀ���� ������, ȭ������, �̹��� �������� ��.
		// �� Ŭ������ ��κ��� ���� �޼���� ����
		Toolkit mykit = Toolkit.getDefaultToolkit();
		// ������ ������ �� �ִ� ��ü
		Dimension screen = mykit.getScreenSize();//dimension������ ����
		// ���� ȭ���� �ػ�
		System.out.println(screen);
		setPreferredSize(screen);
		pack();
		// ����: width, ����: height
		
		
		setLocation(screen.width / 2, screen.height / 2);
		// ���߾� ����
		
		// ������ ������ ����
		// �Ϲ��̹����� �ڿ����� ����ϱ� ���ؼ� toolkit ��ü�� Ȱ��
		Image icon = mykit.getImage("info.png");
		setIconImage(icon);// �������̹���!
	}
}

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.����Ŭ�������� JFrame�� ��ӹ޾� �����ϴ� ����� ����.
		// 2.JFrame�� ��� ���� Ŭ������ �����Ͽ� �����ϴ� ���. 
		test4();

	}
	
	public static void test1() {
		JFrame myframe = new JFrame("�׽�Ʈ1");
		myframe.setSize(500, 500); // �������� ũ��(�ȼ�����)
		myframe.setLocation(600, 200); // �������� ��ġ
		myframe.setVisible(true);
		
		
	}
	
	public static void test2() {
		// JFrame�� ��ӹ��� Ŭ������ �������� ����
		Basicframe1 myframe = new Basicframe1();
		myframe.setTitle("�׽�Ʈ2"); // �̸��� ����
		myframe.setSize(500, 500); // �������� ũ��(�ȼ�����)
		myframe.setLocation(600, 200); // �������� ��ġ
		myframe.setResizable(false); // ũ������ ����
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X��ư�� ������ �� ���α׷��� ����.
		myframe.setVisible(true);// �������� ��Ÿ������
		
		
	}
	
	public static void test4() {
		new Basicframe3();
	}
	

}
