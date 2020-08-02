/**
 * 
 */
package day_3_Assignments;

/**
 * @author tushank
 *
 */

class Demo{
	private int a;
	int b;
	protected int c;
	public int d;
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
	void print()
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
public class CheckDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.b = 10;
		obj.c = 20;
		obj.d = 30;
		obj.setA(5);
		obj.print();
}

}
