/**
 * 
 */
package vitaApp;

import course.Basic;
import course.Dac;
import course.PreDac;

/**
 * @author tushank
 *
 */
public class VitaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dac dac = new Dac();
		dac.term1();
		dac.term2();
		PreDac predac = new PreDac();
		predac.cet();
		Basic basic = new Basic();
		basic.finalTest();
	}

}
