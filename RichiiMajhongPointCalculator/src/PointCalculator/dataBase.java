package PointCalculator;

public class dataBase {
    public static void calculate(int position, int fan, int fu, int status) {
    	  int basicPoint=0;
    	  int result1=0;
    	  int result2=0;
    	  System.out.print(fan+"��"+fu+"��,");
		  if(position==1) {
		      System.out.print("�м�");
		  }else {
		      System.out.print("ׯ��");
		  }
    	  //��������
    	  if (fan>=5&&fan<=12) {
    			  switch(fan) {
    			  case 5:
    				  basicPoint=2000;
    				  break;
    			  case 6:
    			  case 7:
    				  basicPoint=3000;
    				  break;
    			  case 8:
    			  case 9:
    			  case 10:
    				  basicPoint=4000;
    				  break;
    			  case 11:
    			  case 12:
    				  basicPoint=6000;
    				  break;
    			  }
    			  if(position==1) {
    				  if(status==1) {
    					  System.out.println("�ٺ�"+4*basicPoint+"��.");
    				  }else {
    					  System.out.println("����"+basicPoint+"-"+basicPoint*2+"��.");
    				  }
    			  }else {
    				  if(status==1) {
    					  System.out.println("�ٺ�"+6*basicPoint+"��.");
    				  }else {
    					  System.out.println("����"+basicPoint*2+"all.");
    				  }
    			  }
    	  //�ۼ�����
    	  }else if (fan>=13) {
    		  if (position==2) {
    			  if(status==1) {
    				  System.out.println("�ٺ�48000��,�ۼ�����.");
    			  }else {
    				  System.out.println("����16000all,�ۼ�����.");
    			  }   			  
    		  }else {
    			  if(status==1) {
    				  System.out.println("�ٺ�32000��,�ۼ�����.");
    			  }else {
    				  System.out.println("����8000-1600,�ۼ�����.");
    			  }  			  
    		  }
    	  /*������������
    	   *����basicPoint����100�Ĳ�����Ҫ������λ
    	   */
    	  }else {
    		  basicPoint=fu;
    		  for(int i=1;i<=2+fan;i++){
    			  basicPoint*=2;
    		  }
    		  if(position==1) {
				  if(status==1) {
					  result1=4*basicPoint;
					  if(result1%100!=0) {
						  result1=(result1+100)/100*100;
					  }
					  System.out.println("�ٺ�"+result1+"��.");
				  }else {
					  result1=basicPoint;
					  result2=2*basicPoint;
					  if(result1%100!=0) {
						  result1=(result1+100)/100*100;
					  }
					  if(result2%100!=0) {
						  result2=(result2+100)/100*100;
					  }
					  System.out.println("����"+result1+"-"+result2+"��.");
				  }
			  }else {
				  if(status==1) {
					  result1=6*basicPoint;
					  if(result1%100!=0) {
						  result1=(result1+100)/100*100;
					  }
					  System.out.println("�ٺ�"+result1+"��.");
				  }else {
					  result1=2*basicPoint;
					  if(result1%100!=0) {
						  result1=(result1+100)/100*100;
					  }
					  System.out.println("����"+result1+"all.");
				  }
			  }
    	  }    		  
    }
}
