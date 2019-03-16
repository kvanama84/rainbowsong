package polymorphism;

public class Overloading {//over riding have diffeerent arguments annd same method name 

static void add(int a,int b,int c){//
	int sum=a+b+c;
	System.out.println("sum of the number is"+ sum);
}
void add(double a,double b){
	double sum=a+b;
	System.out.println("sum of the number is"+sum);
}
void add(char a){
	char ki=a;
	System.out.println("char" +ki);
}
public static void main(String args[]){
	Overloading kiran=new Overloading();
	kiran.add(10,20,30);//over loading//hear we using static to static by using class name
	kiran.add(20,30);//static to non static method by using object we can axcess
	kiran.add('b');
	
	}
}
