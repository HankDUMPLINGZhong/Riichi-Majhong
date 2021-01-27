package PointCalculator;
import java.util.Scanner;
public class testInput {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//打印和牌牌型要求引导用户输入
		System.out.println("请按照说明输入和牌牌型:");
		System.out.println("请按照万、筒、索、风、役的顺序输入听牌时的13张牌型，");
		System.out.println("其中东-1，南-2，西-3，北-4，白-1，发-2，中-3，");
		System.out.println("每种牌输入完毕后请按照万-m，筒-s，索-s，风-w，役-h的字母结尾");
		System.out.println("为了计算符数,请先输入您门前的牌,然后输入您副露的牌,中间以'|'隔开");
		System.out.println("示例：123m456p789s111w3h，听牌的中稍后会请您输入。");
		System.out.println("现在请您输入您的听牌牌型：");
		Scanner sc=new Scanner(System.in);
		//获得用户的听牌牌型
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
		//以下是测试打印
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
	    System.out.println("现在请您输入您自摸或荣和的牌,格式与之前的输入一致:");
	    System.out.println("e.g.自摸5m,荣和3s");
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		int status=0;
		//记录状态
		if(input.contains("自摸")) {
			status=1;
		}else {
			status=2;
		}
		//将自摸或荣和牌存入数组
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
		//输入座位
		int position=0;
		while(true){
		       System.out.println("庄家请输入2,闲家请输入1:");
			   Scanner inputPosition=new Scanner(System.in);		        
		       if (inputPosition.hasNextInt()) {
		           position=inputPosition.nextInt(); 
		           if(!(position==2||position==1)) {
		    	       System.out.println("无效输入,请重试。");
		    	       continue;
		           }else {
		               break;
		           }
		       }else {
		        	System.out.println("无效输入，请重试。.");
	            	continue;
		        }		        
		}     	 
		//计算
	}
}
