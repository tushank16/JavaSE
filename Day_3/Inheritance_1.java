/**
 * 
 */
package day_3_Assignments;

/**
 * @author tusha
 *
 */
class A{

	public A() {
		System.out.println("In Constructor of Parent class A");
	}
	
}
class B extends A
{

	public B() {
		System.out.println("In Constructor of Child class B");
	}
	
}
public class Inheritance_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		A a = new A();
		System.out.println("***************************");
		@SuppressWarnings("unused")
		B b = new B();
		System.out.println("***************************");
		@SuppressWarnings("unused")
		A c = new B();

	}

}
