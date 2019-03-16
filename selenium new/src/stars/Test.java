package stars;

public class Test {

	public static void main(String[] args) {


		String str="OraKcleDBAavL";
		
		char[] c=str.toCharArray();
		int valuefound=0;
		String temp=Character.toString(c[0]);
		
		for(int i=1;i<=c.length-1;i++)
		{
			
			
			if(Character.isUpperCase(c[i]))
			{
				
				valuefound=i;
				break;
				
			}
			
			
			
			
		}
		
		
		System.out.println(str.substring(0,valuefound)+"_"+str.substring(valuefound));
		
		
		
		
		

	}

}