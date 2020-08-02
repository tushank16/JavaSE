/**
 * 9)	Define a class “Shape” with “draw()” function .
 * 		Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function.
 * 		Define a class “ShapeDemo” in which  write  main()  function. 
 * 		In the main function create a reference to Shape class referring to any of the sub class. 
 * 		Using this reference, call “draw()” and check the result
 */
package day_3_Assignments;

/**
 * @author tusha
 *
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

public class ShapeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape S = new Circle();
		S.draw();
		S = new Polygon();
		S.draw();
		S = new Rectangle();
		S.draw();
	}

}
