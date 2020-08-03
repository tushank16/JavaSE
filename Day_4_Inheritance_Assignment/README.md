1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.Also show, if needed how will u invoke parent class constructor from child class ?

2) create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. How will u override "start()" method of parent class ?

3) Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.

4) Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.

5) create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.

6) Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.

7) Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.

8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.

9) create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter.inside "perform()" see to it that any child object passed ,its "play()" method should be invoked. Call "perform()" method from main function.

