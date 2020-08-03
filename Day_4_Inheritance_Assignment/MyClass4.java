/**
 * 
 */
package day_4_InheritanceAssignment;

/**
 * @author tushank
 *4) Create a class "Top1" with "disp1()" method.
 *   From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
 *   Now show how will u achieve dynamic polymorphism.
 */

class Top1{
	void disp1(){}
}
class Bottom1 extends Top1{
	void disp1(){
		System.out.println("In Disp method of Bottom1");
	}
}

class Bottom2 extends Top1{
	void disp1(){
		System.out.println("In Disp method of Bottom2");
	}
}

class Bottom3 extends Top1{
	void disp1(){
		System.out.println("In Disp method of Bottom3");
	}
}

public class MyClass4 {
	static void perform(Top1 ref)
	{
		ref.disp1();
	}
	public static void main(String[] args) {
		perform(new Bottom1());
		perform(new Bottom2());
		perform(new Bottom3());

	}
	

}
