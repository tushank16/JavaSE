/**
 * 
 */
package Day_2_Assignments;

/**
 * @author tushank
 *Q2) create a class "DemoArr",with the function "disp". 
 *create 4 objects of this class in an array.Traverse the array and invoke "disp" on each objects.
 *
 */


public class DemoArr {

	/**
	 * @param args
	 */
	void disp(int i)
	{
		int a = i;
		a++;		
		System.out.println("In Disp Method of "+a+" DemoArr.");
	}
	public static void main(String[] args)
	{
		DemoArr[] obj = new DemoArr[4];
		for(int i = 0; i < obj.length; i++)
		{
			obj[i] = new DemoArr();
			obj[i].disp(i);
		}
		
	}

}
