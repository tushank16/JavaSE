public class Result
{
	public static void main(String args[]){
	int marks = 67;
	/*Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc. (hard coaded)*/	
	
      		if(marks >= 75)
		{
			System.out.println("Distinction");
		}
		else if(marks >= 60)
		{
			System.out.println("First class");
		}
		else if(marks >= 45)
		{
			System.out.println("Second class");
		}
		else if(marks >= 35)
		{
			System.out.println("Pass class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}