package PointCalculator;
import java.util.Scanner;
public class MainCalculator { 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		   //��ʼ��
		   int position=0;
		   int fan=0;
		   int fu=0;
		   int status=0;
		   //������ȷ����λ,ׯ�ҵõ�*1.5		   
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
		    //������ȷ�ķ���
		    while(true){
		    	System.out.println("�����뷬��:");
		    	Scanner inputFan=new Scanner(System.in);			  
			    if (inputFan.hasNextInt()) {
			    	fan=inputFan.nextInt();
			    	if (fan>0) {
			    	    break;
			    	}else {
			    		System.out.println("��Ч���룬�����ԡ�");
			    		continue;
			    	}
			    }else {
			    	System.out.println("��Ч���룬�����ԡ�");
			    	continue;
			    }
		    }
		    //������ȷ�ķ���
		    while(true){		    	
		    	  System.out.println("���������:");
		    	  Scanner inputFu=new Scanner(System.in);
		    	  if (inputFu.hasNextInt()) {
		    	      fu=inputFu.nextInt();
		    	      //�ж�����ķ����Ƿ����
		    	      if (fu==25) {
		                  break;
		    	      }else if(fu<0||fu>110){
		            	  System.out.println("��Ч���룬�����ԡ�");
		    	       	  continue;
		              }else if(fu%10!=0) {
		                  System.out.println("��Ч���룬�����ԡ�");
		                  continue;
		   	          }else {
		   	        	  break;
		   	          }
		   	      }else {
		   	          System.out.println("��Ч���룬�����ԡ�");
		   	          continue;
		   	      }		    	     
		    }
		    //�������������ٺ�
		    while (true) {		    	
		    	System.out.println("����������2,�ٺ�������1:");
		    	Scanner inputStatus=new Scanner(System.in);
		    	if (inputStatus.hasNextInt()) {
		    		status=inputStatus.nextInt();
		    		if (!(status==1||status==2)){
		    			System.out.println("��Ч���룬�����ԡ�");
		    			continue;
		    		}else {
		    			break;
		    		}
		    	}else {
		    		System.out.println("��Ч���룬�����ԡ�");
		    		continue;
		    	}
		    }		   
		    //����õ�
		   dataBase.calculate(position,fan,fu,status);		    
	}

}
