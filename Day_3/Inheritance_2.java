/**
 * 
 */
package day_3_Assignments;

/**
 * @author tusha
 *
 */
class X{

	public X() {
		System.out.println("In Constructor of Parent class X");
	}
	
}
class Y extends X
{

	public Y() {
		System.out.println("In Constructor of Child class Y");
	}
	
}

class Z extends Y
{
	public Z() {
		System.out.println("In Constructor of GrandChild class Z");
	}
}
public class Inheritance_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		X x = new X();
		System.out.println("***************************");
		@SuppressWarnings("unused")
		Y y = new Y();
		System.out.println("***************************");
		@SuppressWarnings("unused")
		Z z = new Z();
	}

}
