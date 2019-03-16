package stars;

public class starsinword {
	public static void main(String[] args){
	String str="school";
	char[] name=str.toCharArray();
	String temp="";
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			for(int k=name.length-1;k<=i;k++){
		temp=temp+name[k];	
		}}
		System.out.println(temp);
		temp="";
	}}}


