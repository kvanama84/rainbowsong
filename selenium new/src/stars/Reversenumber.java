package stars;

public class Reversenumber {
	public static void main(String[] args){
		int reminder=0 ,qufeshent=0;
				int reverse=0;
		int number=142;
		int number1=141;
		while(number>=1){//
			qufeshent=number%10;//2..4
			reverse=(reverse*10)+qufeshent;//0*10+2=2...20+4=241
			number/=10;//14
		}
		if(number1==reverse){
			System.out.println("its palendrom");
		}
		else{
			System.out.println("not a palendrom");
		}}

}
