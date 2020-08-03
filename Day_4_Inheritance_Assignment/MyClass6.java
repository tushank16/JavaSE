/**
 * 
 */
package day_4_InheritanceAssignment;

/**
 * @author tushank
 * 6) Define interface "A" with "disp1()" method.
 *    Derive from "A", interface "B" with "disp2" method.
 *    Derive class "C" , from "B".
 *    Instantiate class "C" and call its members as well as derived from parent interfaces.
 *
 */
interface A
{
	void disp1();
}
interface B extends A
{
	void disp2();
}
 class C implements B
 {
	void disp() {
		System.out.println("In Disp method of Class c");		
	}
	@Override
	public void disp1() {
		System.out.println("In Disp1 method");		
	}

	@Override
	public void disp2() {
		System.out.println("In Disp2 method");
	}
	 
 }

public class MyClass6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.disp1();
		c.disp2();
		c.disp();
	}

}
