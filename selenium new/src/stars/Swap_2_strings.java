package stars;

public class Swap_2_strings {
	public static void main(String[] args){
		String str1="hello doctor";
		String str2=" hart missiae";
		str1=str1.concat(str2);
		System.out.println(str1);
	str2=str1.substring(0,str1.length()-str2.length());
	System.out.println(str2);
	str1=str1.substring(str2.length());
	System.out.println(str1);
	System.out.println(str2);
	}
	

}
