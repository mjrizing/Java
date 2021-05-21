import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// ������Ʈ : ��ư, ���̺�, ������ư, üũ�ڽ� ��
// �Ϲ� ������Ʈ
// �����̳� : �Ϲ� ������Ʈ�� �����̳ʸ� ���� �� �ִ� ������Ʈ (������, �г�)
// ���̾ƿ�(��ġ������ : ������Ʈ�� ��ġ���)
// �⺻���� ���� default�� �����Ǿ�����.

class LayoutFrame1 extends JFrame{
	public LayoutFrame1() {
		// TODO Auto-generated method stub
		setTitle("���̾ƿ� �׽�Ʈ1");
		setSize(500, 500);
		setLocationRelativeTo(null);
		//������ ȭ�� ���߾ӿ� ��ġ�ϰ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class LayoutFrame2 extends JFrame{
	public LayoutFrame2() {
		// TODO Auto-generated method stub
		setTitle("���̾ƿ� �׽�Ʈ2");
		setSize(500, 500);
		setLocationRelativeTo(null);
		// ������ ȭ�� ���߾ӿ� ��ġ�ϰ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Flow Layout : ������Ʈ�� ���������� ��ġ
		FlowLayout flow1 = new FlowLayout();
		// ���̾ƿ��� �����ӿ� ����
		// �����߾�����, ���� hgap=5, vgap=5
		FlowLayout flow2 = new FlowLayout(FlowLayout.LEFT, 50, 50);
		// ��������
		setLayout(flow2);
		// flow1 Ȥ�� flow2�� ���̾ƿ��� ����
		
		
		JButton btnOK = new JButton("Ȯ��");
		this.add(btnOK);
		
		JButton btnCancel = new JButton("���");
		this.add(btnCancel);
		
		
		setVisible(true);
	}
}


class LayoutFrame3 extends JFrame{
	public LayoutFrame3() {
		// TODO Auto-generated method stub
		setTitle("���̾ƿ� �׽�Ʈ3");
		setSize(500, 500);
		setLocationRelativeTo(null);
		// ������ ȭ�� ���߾ӿ� ��ġ�ϰ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Border Layout : �����̳� ������ ��, ��, ��, �� �߾�
		BorderLayout border = new BorderLayout(20, 20);
		setLayout(border);
		
		// ������Ʈ�� ��,��,��,������ ����.
		JButton btnOK = new JButton("Ȯ��");
		this.add(btnOK, BorderLayout.WEST);
		
		JButton btnCancel = new JButton("���");
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
		setTitle("���̾ƿ� �׽�Ʈ4");
		setSize(500, 500);
		setLocationRelativeTo(null);
		//������ ȭ�� ���߾ӿ� ��ġ�ϰ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Grid Layout : �����̳ʸ� ���ڸ�� (���̺�)
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
		setTitle("���̾ƿ� �׽�Ʈ5");
		setSize(500, 500);
		setLocationRelativeTo(null);
		// ������ ȭ�� ���߾ӿ� ��ġ�ϰ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ��ġ�����ڰ� ���� ���
		// �����ڰ� ������Ʈ�� ��ġ�� ���� ����
		setLayout(null);
		
		JButton btnA = new JButton("A");
		this.add(btnA);
		btnA.setSize(50,50);
		btnA.setLocation(100, 100);
		
		for(int count = 1; count <= 5; count++) {
			// ��ư�� �̸��� ���ڿ�
			JButton btn = new JButton(Integer.toString(count));
			// Integer.toString �������� ���ڿ��� �ٲپ��ִ°�.
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
		// ��ư�� ���� (JButton Ŭ������ Ȱ��)
		JButton btnOK = new JButton("Ȯ��");
		// �����ڸ� ���ؼ� �̸��� ����.
		myframe.add(btnOK);
		
		JButton btnCancel = new JButton("���");
		// �����ڸ� ���ؼ� �̸��� ����.
		myframe.add(btnCancel);
		
		myframe.setVisible(true);

		// �������� �⺻ ���̾ƿ��� Border Layout�̱⶧���� ȭ���� Ʋ�� ������ ����.
		// Ȯ�ι�ư ���� ��ҹ�ư�� �ö󰡹��� -> ��ġ�������� �ʿ伺!
		
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
