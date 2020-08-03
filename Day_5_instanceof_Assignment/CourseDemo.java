/**
 * 
 */
package day_5_Instance_of_Assignment;

/**
 * @author tushank
 * create a hierarchy

				Course

					void start()
					void end()

override "start()" and "end()" in all the child classes.

		MsCit		Basic		Dbda
							void orientation()



write a class "CourseDemo" with main and perform functions

	perform function should be defined in such a way that it can accept any course and invoke "start()" and "end()" functions.

	also make sure if "Dbda" is passed , its "orientation()" method also should be called.
 *
 */
interface Course 
{
	void start();
	void end();
}

class MsCIT implements Course{

	@Override
	public
	void start() {
		System.out.println("MsCIT Course Starts.");		
	}

	@Override
	public
	void end() {
		System.out.println("MsCIT Course Ends.");		
		
	}
	
}
class Basic implements Course{

	@Override
	public void start() {
		System.out.println("Basic Course Starts.");		
	}

	@Override
	public void end() {
		System.out.println("Basic Course Ends.");		
		
	}
	
}
class DBDA implements Course{
	
	void orientation() {
		System.out.println("Orientation for DBDA Course Starts.");		
	}
	
	@Override
	public void start() {
		System.out.println("DBDA Course Starts.");		
	}

	@Override
	public void end() {
		System.out.println("DBDA Course Ends.");		
		
	}
	
}
public class CourseDemo {

	private static void perform(Course ref) {
		if(ref instanceof DBDA) {
			DBDA obj = new DBDA();
			obj.orientation();
		}
		ref.start();
		ref.end();
	}
	public static void main(String[] args) {
		perform(new MsCIT());
		perform(new DBDA());
		perform(new Basic());

	}


}
