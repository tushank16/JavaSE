/**
 * 
 */
package day_3_Assignments;

/**
 * @author tushank
 *
 */

class Parent2
{
	void disp()
	{
		System.out.println("In Parent Class Disp");
	}
}
class Child2 extends Parent2
{
	void disp(int a)
	{
		System.out.println("In Child Class Disp");
	}
}

public class FunctionOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child2 object=  new Child2();
		object.disp(10);
		object.disp();
	}

}
