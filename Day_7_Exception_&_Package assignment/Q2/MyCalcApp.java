/**
 * 
 */
package day_7_Exception;

/**
 * @author tushank
 *
 */

class MyArithException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyArithException(String message) {
		super(message);
	}
}
class Calculator
{
	int caldouble(int num)
	{
		if(num<0)
		{
			throw new MyArithException("Negative Value not allowed");
		}
		else if (num==0)
		{
			throw new MyArithException("Zero Value not allowed");
		}
		return num*2;
	}
}

public class MyCalcApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Calculator cal1 = new Calculator();
		//System.out.println(cal1.caldouble(-1));
		//Calculator cal2 = new Calculator();
		//System.out.println(cal2.caldouble(0));
		Calculator cal3 = new Calculator();
		System.out.println(cal3.caldouble(10));
	}

}
