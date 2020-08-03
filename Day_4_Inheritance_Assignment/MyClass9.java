/**
 * 
 */
package day_4_InheritanceAssignment;

/**
 * @author tushank
 *9) Create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
 *	 Now Define one more class, public class Demo with main function.
 *	 In this class have a static method "perform" which will take interface reference as parameter.
 *	 Inside "perform()" see to it that any child object passed ,its "play()" method should be invoked. 
 * 	 Call "perform()" method from main function.
 */

interface Game{
	void play();
}

class Cricket implements Game{

	@Override
	public void play() {
		System.out.println("Playing Cricket");		
	}
	
}
class FootBall implements Game{

	@Override
	public void play() {
		System.out.println("Playing FootBall");		
	}
	
}
class Tennis implements Game{

	@Override
	public void play() {
		System.out.println("Playing Tennis");		
	}
	
}
public class MyClass9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		perform(new Cricket());
		perform(new FootBall());
		perform(new Tennis());

	}

	private static void perform(Game ref) {
		ref.play();
	}

}
