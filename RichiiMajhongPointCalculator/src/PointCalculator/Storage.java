package PointCalculator;

public class Storage {
	private static int position=0;
	private static String menQianList[][]=new String[2][20];
	private static String fuLuList[][]=new String[2][20];
	public static String[][] menQianSplit(String ting) {
		position=0;
        splitCard(ting,"m",menQianList);
        splitCard(ting,"p",menQianList);
        splitCard(ting,"s",menQianList);
        splitCard(ting,"w",menQianList);
        splitCard(ting,"h",menQianList);
		return menQianList;
	}
	public static String[][] fuLuSplit(String ting) {
		position=0;
        splitCard(ting,"m",fuLuList);
        splitCard(ting,"p",fuLuList);
        splitCard(ting,"s",fuLuList);
        splitCard(ting,"w",fuLuList);
        splitCard(ting,"h",fuLuList);
		return fuLuList;
	}
    private static void splitCard (String card,String p,String[][]cardList) {    	
	    if (card.indexOf(p)!=-1) {
			for(int i=position;i<card.indexOf(p);i++) {
				cardList[0][i]=card.substring(i,i+1);
				cardList[1][i]=p;
			}
			position=card.indexOf(p)+1;		
	    }
    }
}
