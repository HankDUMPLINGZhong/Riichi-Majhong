package MainCalculator;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		System.out.println("�밴����Ͳ�������硢�۵�˳���������ʱ��14�����ͣ�");
		System.out.println("���ж�-1����-2����-3����-4����-1����-2����-3��");
		System.out.println("ÿ����������Ϻ��밴����-m��Ͳ-s����-s����-w����-h����ĸ��β");
		System.out.println("ʾ����123m456p789s111w33h");
		System.out.println("�������������������ͣ�");
		Scanner sc=new Scanner(System.in);
		String ron=sc.next();
		sc.close();
		System.out.println("����������˻��������ƣ�e.g.����3m/�ٺ�5s��");
		Scanner cardRon=new Scanner(System.in);
		String endStatus=cardRon.next();
		boolean status=false;
		if (endStatus.contains("����")) {
			status=true;
		}
		String card=endStatus.substring(2);
		cardRon.close();
		System.out.println("�����볡��(��-1����-2����-3����-4):");
		Scanner chang=new Scanner(System.in);
		int gameWind=chang.nextInt();
		chang.close();
		System.out.println("�����볡��(��-1����-2����-3����-4):");
		Scanner zi=new Scanner(System.in);
		int selfWind=zi.nextInt();
		zi.close();
		storage hand=new storage(ron,selfWind,gameWind,status);
	}

}
