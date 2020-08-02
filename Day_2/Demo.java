/**
 * 
 */
package Day_2_Assignments;

/**
 * @author tusha
 *
 */
class A{
	static
	{
		System.out.println("In Static method of A");
	}
	static void disp(){
		System.out.println("In Static void method of A");
	}
	void disp1(){
		System.out.println("In Disp1 method of A");
	}
}

class B{
	static
	{
		System.out.println("In Static method of B");
	}
	static void disp(){
		System.out.println("In Static void method of B");
	}
	void disp1(){
		System.out.println("In Disp1 method of B");
	}
}

class C{
	static
	{
		System.out.println("In Static method of C");
	}
	static void disp(){
		System.out.println("In Static void method of C");
	}
	void disp1(){
		System.out.println("In Disp1 method of C");
	}
}
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();		
		a.disp1();
		A.disp();
		c.disp1();
		C.disp();
		b.disp1();
		B.disp();
	}

}
