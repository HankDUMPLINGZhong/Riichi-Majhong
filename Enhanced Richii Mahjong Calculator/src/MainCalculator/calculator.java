package MainCalculator;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		System.out.println("请按照万、筒、索、风、役的顺序输入和牌时的14张牌型，");
		System.out.println("其中东-1，南-2，西-3，北-4，白-1，发-2，中-3，");
		System.out.println("每种牌输入完毕后请按照万-m，筒-s，索-s，风-w，役-h的字母结尾");
		System.out.println("示例：123m456p789s111w33h");
		System.out.println("现在请您输入您的牌型：");
		Scanner sc=new Scanner(System.in);
		String ron=sc.next();
		sc.close();
		System.out.println("请输入你和了或自摸的牌，e.g.自摸3m/荣和5s：");
		Scanner cardRon=new Scanner(System.in);
		String endStatus=cardRon.next();
		boolean status=false;
		if (endStatus.contains("自摸")) {
			status=true;
		}
		String card=endStatus.substring(2);
		cardRon.close();
		System.out.println("请输入场风(东-1，南-2，西-3，北-4):");
		Scanner chang=new Scanner(System.in);
		int gameWind=chang.nextInt();
		chang.close();
		System.out.println("请输入场风(东-1，南-2，西-3，北-4):");
		Scanner zi=new Scanner(System.in);
		int selfWind=zi.nextInt();
		zi.close();
		storage hand=new storage(ron,selfWind,gameWind,status);
	}

}
