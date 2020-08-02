/**
 * 
 */
package day_3_Assignments;

/**
 * @author tushank
 *
 */
class Parent1
{
	void disp()
	{
		System.out.println("In Parent Class Disp");
	}
}
class Child1 extends Parent1
{
	void disp()
	{
		System.out.println("In Child Class Disp");
	}
}

public class FunctionOverriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parent1 Obj = new Child1();
		Obj.disp();
		
	}

}
