/**
 * 
 */
package day_3_Assignments;

/**
 * @author tushank
 * Q1)Define 2 classes “First” and “Second” with member variables , member functions and constructors of  your choice.
 * Now define a class “Two” in which define main function .
 * In main function create various instances of First and Second and call their individual member functions.
 */

class First{
	private int a;

	public First(int a) {
		super();
		this.a = a;
	}

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
	
}
class Second{
	private int b;

	public Second(int b) {
		super();
		this.b = b;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	
}
public class Two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		First f1 = new First(10);
		First f2 = new First(20);
		f1.setA(20);
		f2.setA(30);
		Second s1 = new Second(40);
		Second s2 = new Second(50);
		s1.setB(50);
		s2.setB(60);
		System.out.println(f1.getA());
		System.out.println(f2.getA());
		System.out.println(s1.getB());
		System.out.println(s2.getB());
	}

}
