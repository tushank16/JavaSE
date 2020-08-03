package day_4_InheritanceAssignment;

/**
 * @author tushank
 *7) Define class "Parent1" with some data.
 *   Define interface "Parent2" with some data.
 *   Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.
 *
 */
class Parent1{
	void disp1(){
		System.out.println("In Disp1 method of Parent1 Class");
	}
}

interface Parent2{
	void disp2();
}

class Child extends Parent1 implements Parent2{

	@Override
	public void disp2() {
		System.out.println("In Disp2 method of Parent2 Class");
	}
	public void disp3() {
		System.out.println("In Disp3 method of Child Class");
	}
}


public class MyClass7 {
	public static void main(String[] args) {
		Child Obj = new Child();
		Obj.disp1();
		Obj.disp2();
		Obj.disp3();
	}
}
