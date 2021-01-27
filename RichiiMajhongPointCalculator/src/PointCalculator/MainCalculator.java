package PointCalculator;
import java.util.Scanner;
public class MainCalculator { 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		   //初始化
		   int position=0;
		   int fan=0;
		   int fu=0;
		   int status=0;
		   //输入正确的座位,庄家得点*1.5		   
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
		    //输入正确的番数
		    while(true){
		    	System.out.println("请输入番数:");
		    	Scanner inputFan=new Scanner(System.in);			  
			    if (inputFan.hasNextInt()) {
			    	fan=inputFan.nextInt();
			    	if (fan>0) {
			    	    break;
			    	}else {
			    		System.out.println("无效输入，请重试。");
			    		continue;
			    	}
			    }else {
			    	System.out.println("无效输入，请重试。");
			    	continue;
			    }
		    }
		    //输入正确的符数
		    while(true){		    	
		    	  System.out.println("请输入符数:");
		    	  Scanner inputFu=new Scanner(System.in);
		    	  if (inputFu.hasNextInt()) {
		    	      fu=inputFu.nextInt();
		    	      //判断输入的符数是否存在
		    	      if (fu==25) {
		                  break;
		    	      }else if(fu<0||fu>110){
		            	  System.out.println("无效输入，请重试。");
		    	       	  continue;
		              }else if(fu%10!=0) {
		                  System.out.println("无效输入，请重试。");
		                  continue;
		   	          }else {
		   	        	  break;
		   	          }
		   	      }else {
		   	          System.out.println("无效输入，请重试。");
		   	          continue;
		   	      }		    	     
		    }
		    //输入自摸还是荣和
		    while (true) {		    	
		    	System.out.println("自摸请输入2,荣和请输入1:");
		    	Scanner inputStatus=new Scanner(System.in);
		    	if (inputStatus.hasNextInt()) {
		    		status=inputStatus.nextInt();
		    		if (!(status==1||status==2)){
		    			System.out.println("无效输入，请重试。");
		    			continue;
		    		}else {
		    			break;
		    		}
		    	}else {
		    		System.out.println("无效输入，请重试。");
		    		continue;
		    	}
		    }		   
		    //计算得点
		   dataBase.calculate(position,fan,fu,status);		    
	}

}
