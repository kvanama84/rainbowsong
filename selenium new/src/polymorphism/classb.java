package polymorphism;



public class classb extends Overridingorruntime  {
	public classb()
	{
		super();
		System.out.println("using constructer ");
	}
	@ Override
	public void sample1(){
		System.out.println("sample11 executes");
	}
	@ Override
	public void sample2(){
		System.out.println("sample22 exectues");
	}
	public static void main(String args[]){
		classb obj=new classb();
		obj.sample1();
		obj.sample2();
	}
	
  

}
