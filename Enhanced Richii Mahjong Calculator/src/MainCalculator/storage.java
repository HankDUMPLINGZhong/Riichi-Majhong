package MainCalculator;
//������ĺ�����ʽ�Զ�ά������ʽ�����ڴ�
/*
 * ˳��Ϊ1-9m,1-9p,1-9s,���������磨1-4w��,�׷��У�1-3h��
 * ����1-9 ����mpswh
 */
public class storage {
	private String cardList[][]=new String[6][10];
	private int ziFeng=0;
	private int changFeng=0;
	private boolean status=false;
	public storage(String card, int selfWind, int gameWind, boolean status){
		//��ʼ��
		int index=0;
		ziFeng=selfWind;
		changFeng=gameWind;
		this.status=status;
		for(int i=1;i<=9;i++){
			cardList[0][i]=Integer.toString(i);
		}
		for(int i=1;i<=5;i++) {
			cardList[i][0]=Integer.toString(i);
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				cardList[i][j]=Integer.toString(0);
			}
		}
		for(int i=5;i<=9;i++) {
			cardList[4][i]=null;
		}
		for(int i=4;i<=9;i++) {
			cardList[5][i]=null;
		}
		//�������
		if (card.indexOf("m")!=-1) {
			index=card.indexOf("m")-1;
			for(int i=0;i<=index;i++) {
				for(int j=1;j<=9;j++) {
					if (card.substring(i,i+1).equals(cardList[0][j])) {
						cardList[1][j]=Integer.toString(Integer.parseInt(cardList[1][j])+1);
						break;
					}
				}
			}
			card=card.substring(index+2);
		}
		if (card.indexOf("p")!=-1) {
			index=card.indexOf("p")-1;
			for(int i=0;i<=index;i++) {
				for(int j=1;j<=9;j++) {
					if (card.substring(i,i+1).equals(cardList[0][j])) {
						cardList[2][j]=Integer.toString(Integer.parseInt(cardList[2][j])+1);
						break;
					}
				}
			}
			card=card.substring(index+2);
		}
		if (card.indexOf("s")!=-1) {
			index=card.indexOf("s")-1;
			for(int i=0;i<=index;i++) {
				for(int j=1;j<=9;j++) {
					if (card.substring(i,i+1).equals(cardList[0][j])) {
						cardList[3][j]=Integer.toString(Integer.parseInt(cardList[3][j])+1);
						break;
					}
				}
			}
			card=card.substring(index+2);
		}
		if (card.indexOf("w")!=-1) {
			index=card.indexOf("w")-1;
			for(int i=0;i<=index;i++) {
				for(int j=1;j<=9;j++) {
					if (card.substring(i,i+1).equals(cardList[0][j])) {
						cardList[4][j]=Integer.toString(Integer.parseInt(cardList[4][j])+1);
						break;
					}
				}
			}
			card=card.substring(index+2);
		}
		if (card.indexOf("h")!=-1) {
			index=card.indexOf("h")-1;
			for(int i=0;i<=index;i++) {
				for(int j=1;j<=9;j++) {
					if (card.substring(i,i+1).equals(cardList[0][j])) {
						cardList[5][j]=Integer.toString(Integer.parseInt(cardList[5][j])+1);
						break;
					}
				}
			}
			card=card.substring(index+2);
		}
		//���Դ�ӡ
		/*
		for (int i=0;i<=5;i++) {
			for(int j=0;j<=9;j++) {
				System.out.print(cardList[i][j]+"\t");
			}
			System.out.println();
		}
		*/
	}
}

