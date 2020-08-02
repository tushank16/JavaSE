/**
 * 
 */
package Day_2_Assignments;

/**
 * @author tushank
 *
 *Q4) Define a class "MyClass" and make sure clients can instantiate it , 
 *a) without any argument
 *b) with one int argument
 *c) with two int arguments
 */
public class MyClass {

	/**
	 * @param args
	 */
	private int a,b;
	
	public MyClass() {
		super();
		this.a = 0;
		this.b = 0;
	}

	public MyClass(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public MyClass(int a) {
		super();
		this.a = a;
		this.b = 0;
	}
	void disp()
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass(100);
		MyClass obj3 = new MyClass(100,200);
		obj1.disp();
		obj2.disp();
		obj3.disp();
		
	}

}
