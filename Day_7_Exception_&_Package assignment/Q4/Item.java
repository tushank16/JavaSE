/**
 * 
 */
package day_7_Assignment;

/**
 * @author tusha
 *
 *4)define a class called as "Item" (Item.java)
	with members
	String itemid;
	String name;
	int cost;
	
	parameterized constructor which will accept above details at the time
	of creating object.
		member function
	void display()
	which will display all the details of product
	create instances of this class and call the method display.
 */
public class Item {
	String itemid;
	String name;
	int cost;
	
	public Item(String itemid, String name, int cost) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}
	void display() {
		System.out.println("ItemID: "+itemid+"\nName: " +name+ "\nCost: ₹"+cost+"/- \n");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Item item1 =  new Item("890186001005","Fevikwik",5);
		item1.display();
		Item item2 =  new Item("8904004407471","Haldiram",5);
		item2.display();
		
	}

}
