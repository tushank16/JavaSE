/**
 * 
 */
package day_5_Instance_of_Assignment;

/**
 * @author tushank
 *
 *create a hierarchy

				Animal

					void makeSound()
					
override "makeSound()" in all the child classes.

		Dog		Cat		Tiger
							void hunting()



write a class "AnimalDemo" with main and perform functions

	perform function should be defined in such a way that it can accept any animal and invoke "makeSound()" function.

	also make sure if "Tiger" is passed , its "hunting()" method also should be called.
 */

interface Animal {
	void makeSound();
}

class Dog implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Dog is Barking");		
	}
	
}

class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Cat is Meaowing");		
	}
	
}

class Tiger implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Tiger is Roaring");		
	}
	void hunting() {
		System.out.println("Tiger is Hunting");
	}
	
	
}

public class AnimalDemo {

	private static void perform(Animal ref) {
		ref.makeSound();
		if (ref instanceof Tiger)
		{
			Tiger obj = new Tiger();
			obj.hunting();
		}
		
	}
	public static void main(String[] args) {
		perform(new Dog());
		perform(new Cat());
		perform(new Tiger());
	}
}
