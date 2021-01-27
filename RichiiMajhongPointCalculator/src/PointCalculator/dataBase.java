package PointCalculator;

public class dataBase {
    public static void calculate(int position, int fan, int fu, int status) {
    	  int basicPoint=0;
    	  int result1=0;
    	  int result2=0;
    	  System.out.print(fan+"番"+fu+"符,");
		  if(position==1) {
		      System.out.print("闲家");
		  }else {
		      System.out.print("庄家");
		  }
    	  //满贯以上
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
    					  System.out.println("荣和"+4*basicPoint+"点.");
    				  }else {
    					  System.out.println("自摸"+basicPoint+"-"+basicPoint*2+"点.");
    				  }
    			  }else {
    				  if(status==1) {
    					  System.out.println("荣和"+6*basicPoint+"点.");
    				  }else {
    					  System.out.println("自摸"+basicPoint*2+"all.");
    				  }
    			  }
    	  //累计役满
    	  }else if (fan>=13) {
    		  if (position==2) {
    			  if(status==1) {
    				  System.out.println("荣和48000点,累计役满.");
    			  }else {
    				  System.out.println("自摸16000all,累计役满.");
    			  }   			  
    		  }else {
    			  if(status==1) {
    				  System.out.println("荣和32000点,累计役满.");
    			  }else {
    				  System.out.println("自摸8000-1600,累计役满.");
    			  }  			  
    		  }
    	  /*不足满贯的情况
    	   *另外basicPoint不足100的部分需要进到百位
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
					  System.out.println("荣和"+result1+"点.");
				  }else {
					  result1=basicPoint;
					  result2=2*basicPoint;
					  if(result1%100!=0) {
						  result1=(result1+100)/100*100;
					  }
					  if(result2%100!=0) {
						  result2=(result2+100)/100*100;
					  }
					  System.out.println("自摸"+result1+"-"+result2+"点.");
				  }
			  }else {
				  if(status==1) {
					  result1=6*basicPoint;
					  if(result1%100!=0) {
						  result1=(result1+100)/100*100;
					  }
					  System.out.println("荣和"+result1+"点.");
				  }else {
					  result1=2*basicPoint;
					  if(result1%100!=0) {
						  result1=(result1+100)/100*100;
					  }
					  System.out.println("自摸"+result1+"all.");
				  }
			  }
    	  }    		  
    }
}
