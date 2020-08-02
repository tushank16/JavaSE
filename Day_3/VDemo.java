/**
 * 10)	Define an interface “Vehicle” with “start()” function .
 * 		Now derive  classes like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc. from “Vehicle” and override “start()” function. 
 * 		Define a class “VDemo” in which  write  main()  function. 
 * 		In the main function create a reference to Vehicle  class referring to any of the sub class. 
 * 		Using this reference, call “start" method.
 */
package day_3_Assignments;

/**
 * @author tushank
 *
 */
interface Vehicle {
	void start();
}
class TwoWheeler implements Vehicle
{

	@Override
	public void start() {
		System.out.println("TwoWheeleer is Started");
		
	}
	
}
class ThreeWheeler implements Vehicle
{

	@Override
	public void start() {
		System.out.println("ThreeWheeler is Started");
		
	}
	
}
class FourWheeler implements Vehicle
{

	@Override
	public void start() {
		System.out.println("FourWheeler is Started");
		
	}
	
}
public class VDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle v = new TwoWheeler();
		v.start();
		v = new ThreeWheeler();
		v.start();
		v = new FourWheeler();
		v.start();
	}

}
