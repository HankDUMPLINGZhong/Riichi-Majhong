package PointCalculator;
import java.util.Scanner;
public class testInput {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//��ӡ��������Ҫ�������û�����
		System.out.println("�밴��˵�������������:");
		System.out.println("�밴����Ͳ�������硢�۵�˳����������ʱ��13�����ͣ�");
		System.out.println("���ж�-1����-2����-3����-4����-1����-2����-3��");
		System.out.println("ÿ����������Ϻ��밴����-m��Ͳ-s����-s����-w����-h����ĸ��β");
		System.out.println("Ϊ�˼������,������������ǰ����,Ȼ����������¶����,�м���'|'����");
		System.out.println("ʾ����123m456p789s111w3h�����Ƶ����Ժ���������롣");
		System.out.println("�����������������������ͣ�");
		Scanner sc=new Scanner(System.in);
		//����û�����������
		String ting=sc.next();
		String hand=null;
		String table=null;
		if (ting.contains("|")) {
			hand=ting.substring(0,ting.indexOf("|"));
			table=ting.substring(ting.indexOf("|")+1);
		}else {
			hand=ting;
		}
		/*
		System.out.println(hand);
		System.out.println(table);
		*/
		String[][] menQian=new String[2][20];
		String[][] fuLu=new String[2][20];		
		if (table!=null) {
			menQian=Storage.menQianSplit(hand);
		    fuLu=Storage.fuLuSplit(table);
		}else {
			menQian=Storage.menQianSplit(hand);
		}
		//�����ǲ��Դ�ӡ
		/*
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=19;j++) {
				if (menQian[i][j]!=null) {
				    System.out.print(menQian[i][j]);
				}
			}
			System.out.println("");
		}
	    for(int i=0;i<=1;i++) {
			for(int j=0;j<=19;j++) {
				if (fuLu[i][j]!=null) {
				    System.out.print(fuLu[i][j]);
				}
			}
			System.out.println("");
		}
		*/
	    System.out.println("���������������������ٺ͵���,��ʽ��֮ǰ������һ��:");
	    System.out.println("e.g.����5m,�ٺ�3s");
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		int status=0;
		//��¼״̬
		if(input.contains("����")) {
			status=1;
		}else {
			status=2;
		}
		//���������ٺ��ƴ�������
		int hePosition=0;
		for(int i=0;i<=19;i++) {
				if (menQian[0][i]==null) {
						menQian[0][i]=input.substring(1,2);
						menQian[1][i]=input.substring(2);
						hePosition=i;
						break;
				}
		}
		int fuLuPosition=0;
		for(int i=0;i<=19;i++) {
			if(fuLu[0][i]==null) {
				fuLuPosition=i-1;
				break;
			}
		}
		//������λ
		int position=0;
		while(true){
		       System.out.println("ׯ��������2,�м�������1:");
			   Scanner inputPosition=new Scanner(System.in);		        
		       if (inputPosition.hasNextInt()) {
		           position=inputPosition.nextInt(); 
		           if(!(position==2||position==1)) {
		    	       System.out.println("��Ч����,�����ԡ�");
		    	       continue;
		           }else {
		               break;
		           }
		       }else {
		        	System.out.println("��Ч���룬�����ԡ�.");
	            	continue;
		        }		        
		}     	 
		//����
	}
}
