/**
 * 
 */
package Day_2_Assignments;

/**
 * @author tushank
 *6) Define a class "DemoOb". 
	create an instance of it.
	now create a reference and assign the reference created in the above statement.
	Discuss what happens?
	Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
	(For ur discussion, write necessary comments in the program)
 */
public class DemoOb {

	private int a;
	
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	public DemoOb(int a) {
		super();
		this.a = a;
	}

	public static void main(String[] args)
	{
		DemoOb  Obj = new DemoOb(10);
		System.out.println(Obj.getA());
		DemoOb ref =Obj;
		System.out.println(ref.getA());
		ref.setA(20);
		System.out.println(Obj.getA());
		System.out.println(ref.getA());
	}
}

/**
 * we created another ref pointing to the same object
 * if we assigned a new value to the refering object, then the value of original object also gets changed
 * 
 * **/
 