package stars;

public class Printstars {
	public static void main(String args[]){
		int n=5;
		
		for (int i=0;i<n;i++)
            {
			for (int j=2*(n-i); j>1; j--) 
			          {//taking 2*.we can print triangle
				System.out.print(" ");
			           }
			for (int j=0; j<=i; j++ )
			            {	
			
				System.out.print("j ");
		
			             }
		
		System.out.println();}}}
	
