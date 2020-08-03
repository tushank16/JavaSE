/**
 * 
 */
package day_4_InheritanceAssignment;

/**
 * @author tushank
 *8) Define a class "base1" with only parameterized constructor.
 *	 Derive a class "sub1" from "base1". This class should have following constructors
 * 		a) Default
 * 		b) one parameter
 * 		c) two parameter
 * 	 Now try to instantiate "sub1" , using any of the above mentioned constructors.
 */


class base1
{
	int a;

	public base1(int a) {
		super();
		this.a = a;
		System.out.println("In Base class Parameterized constructor");
	}
	
}
class sub1 extends base1
{

	public sub1() {
		super(0);
	System.out.println("In Default constructor of sub class");
	}
	public sub1(int a) {
		super(a);
	System.out.println("In One parameter constructor of sub class");	
	}
	public sub1(int a, int b) {
		super(a);
	System.out.println("In Two parameter constructor of sub class");	
	}
}
public class MyClass8 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		sub1 s1 = new sub1();
		sub1 s2 = new sub1(10);
		sub1 s3 = new sub1(20,30);
	}

}
