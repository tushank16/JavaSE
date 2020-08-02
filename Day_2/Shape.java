/**
 * 
 */
package Day_2_Assignments;

/**
 * @author tushank
 *Q3)create a class "Shape" with 2 attributes, "width" and "height". 
 *Make sure one can not access these attributes directly.
 *provide accessor methods on these attributes and allow them to call from outside of your class.
 */
public class Shape {
	int width, height;
	
	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	int area()
	{
		return width*height;
	}
	void info()
	{
		System.out.println("Height is :"+height+", Width is :"+width);
	}
		
	public static void main(String[] args) {
		Shape rect = new Shape(30,60);
		Shape square = new Shape(40,40);
		rect.info();
		System.out.println(rect.area());
		square.info();
		System.out.println(square.area());
	}

}
