class SharePrinter{
	synchronized void print(String text) {
		for(int i=0;i<text.length();i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
}

class WorkerThread extends Thread{
	SharePrinter p;
	String [] text;
	public WorkerThread(SharePrinter p, String [] text) {
		// TODO Auto-generated constructor stub
		this.p=p;
		this.text=text;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<text.length;i++)
			p.print(text[i]);
	}
}
public class SynchronizedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharePrinter p = new SharePrinter();
		String [] engText= {"wise men say", "only fools rush in", "But I can't help",
				"falling in love with you","Shall I stay?" ,
				"Would it be a sin?","If I can't help","falling in love with you"};
		String [] korText= {"���ع��� ��λ��� ������ �⵵��, ","�ϴ����� �����ϻ� �츮 ���� ����",
				"����ȭ ��õ�� ȭ������, ","���� ��� �������� ���� �����ϼ�","���� ���� �� �ҳ���, ö���� �θ� ��","�ٶ����� �Һ����� �츮 ����ϼ�.",
				"����ȭ ��õ�� ȭ������, ","���� ��� �������� ���� �����ϼ�"


		};
		
		Thread th1=new WorkerThread(p, engText);
		Thread th2=new WorkerThread(p, korText);
		
		th1.start();
		th2.start();
		


	}

}
