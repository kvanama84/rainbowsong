package stars;

import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String args[]){
		int a,c=0;
		int num=370;
		int temp=num;
		//System.out.println("enter the nummber is it amstrong");
		//Scanner in=new Scanner(System.in);
	       //  in.nextLine();
	      while(num>0){  
	    	  a=num%10;
	    	  num=num/10;
	    	  c=c+(a*a*a);
	      }
	       if(c==temp){
	    	   System.out.println("answer is amstron");
	    	   
	       } 	else{
	    	   System.out.print("nooot armstron");
	       }
	        
	}

}
