/**
 * 
 */
package day_4_InheritanceAssignment;

/**
 * @author tusha
 *5) Create abstract class Shape. declare "draw()" function as abstract. 
 *	 From this class define "Triangle","Polygon" and "Circle" .
 *	 create an array of Shape having 3 elements.
 *	 store child objects into this array and call their draw function.
 */
class Shape
{
	void draw(){}
}
class Circle extends Shape
{
	void draw(){
		System.out.println("Circle is being Drawn");
	}
}
class Polygon extends Shape
{
	void draw(){
		System.out.println("Polygon is being Drawn");
	}
}
class Rectangle extends Shape
{
	void draw(){
		System.out.println("Rectangle is being Drawn");
	}
}
public class MyClass5 {
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Shape[] obj = new Shape[3];
		obj[0] = new Circle();
		obj[1] = new Rectangle();
		obj[2] = new Polygon();
		
		for(int i = 0; i < obj.length; i++)
		{
			obj[i].draw();
		}
	}

	
}
