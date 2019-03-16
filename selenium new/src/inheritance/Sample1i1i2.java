package inheritance;

public class Sample1i1i2 implements i1,i2 {
	public void print(){
		System.out.println("123");
	}
	public void text(){
		System.out.println("456");
		
	}
	public void next(){
		System.out.println("kir");
	}
	public static void main(String args[])
	{
		Sample1i1i2 kiran=new Sample1i1i2();
		kiran.print();
		kiran.text();
		kiran.next();
	}

}
