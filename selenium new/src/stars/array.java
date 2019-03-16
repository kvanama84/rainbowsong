package stars;//finding 3rd highest value

public class array {
public static void main (String[] args){
	int[] num={1,5,3,6,4,2,7};
	int temp=0;int k=1;
	for(int i=0;i<num.length-1;i++)
	{
	    for(int j=i+1;j<num.length;j++)
	    {
            if(num[i]>num[j]){//heare we can print ascending order and decending order
            	temp=num[i];
            	num[i]=num[j];
            	num[j]=temp;
            
            }
	    }
	if(i==k-1){
		System.out.println("largest element is"+num[i]);
	}
	}
	System.out.println("..........");
	for(int i=0;i<num.length;i++){
		System.out.println(num[i]);
	}
	
	    
	
}
}
