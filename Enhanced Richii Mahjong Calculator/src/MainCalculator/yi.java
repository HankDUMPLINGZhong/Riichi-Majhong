package MainCalculator;

public class yi {
	private int fan;
	private int fu;
	private int duiZi(String[][]cardList) {
		int sum=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if (cardList[i][j].equals("2")) {
					sum+=1;
				}
			}
		}
		return sum;
	}
	public boolean isSevenPair(String[][] cardList) {
		boolean flag=false;
		int num=duiZi(cardList);
		if (num==7) {
			flag=true;
		}
		return flag;
	}
    public boolean isPingFu(String[][] cardList, int selfWind, int gameWind) {
    	boolean flag=false;
    	for (int i=1;i<=3;i++) {
    			if(cardList[5][i].equals("2")) {
    				//役牌对子一定不是平和
    				return flag;
    			}
    	}
    	return flag;
    }
}
