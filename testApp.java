class A 
{
	static int j=100;
 int i=50;
	public static void main(String[] args) 
	{
A b=new A();
System.out.println(b.j);//100
System.out.println(b.i);//50
A d=null;
System.out.println(d.j);//100
System.out.println(d.i);//null pointer Exception

	}

}
