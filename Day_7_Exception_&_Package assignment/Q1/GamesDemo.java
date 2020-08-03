/**
 * 
 */
package day_7_Assignment;

/**
 * @author tushank
 *1)Create abstract base class "Game" with 'play()' as abstract method.
 *  From that derive following classes.
 *  Football,Cricket,Tennis
 *  Create a class called as "GamesDemo" (public class)
 *  inside a main method create an array of "Game" (3 elements)
 *  Store objects of Football,Cricket and Tennis respectively.
 *  Now traverse the array and call that Cricket's play() method.
 */
class Game{
	 void play() {
	}
}
class Football extends Game{
	void play() {
		System.out.println("Playing FootBall.");
	}
}

class Cricket extends Game{
	void play() {
		System.out.println("Playing Cricket.");
	}
}

class Tennis extends Game{
	void play() {
		System.out.println("Playing Tennis.");
	}
}
public class GamesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game[] obj = new Game[3];
		obj[0] = new Football();
		obj[1] = new Cricket();
		obj[2] = new Tennis();
		
		for(int i = 0; i < obj.length; i++)
		{
			if( obj[i] instanceof Cricket)
			{
				obj[i].play();
			}
		}
	}

}
