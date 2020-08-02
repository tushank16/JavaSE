/**
 * 
 */
package day_3_Assignments;

/**
 * @author tusha
 *
 */
class K{
	public K() {
		System.out.println("In Constructor of K");
	}
}
class L extends K{

	public L() {
		System.out.println("In Constructor of L");	
		}
}
class M extends K{

	public M() {
		System.out.println("In Constructor of M");
	}
	
}


public class Inheritance_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		K k = new K();
		System.out.println("***************************");
		@SuppressWarnings("unused")
		L l = new L();
		System.out.println("***************************");
		@SuppressWarnings("unused")
		M m = new M();
	}

}
