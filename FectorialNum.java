
public class FectorialNum {

	public static void main(String[] args) {
		
		int i, fact=1;
		int number = 6;
		
		for(i=1; i<=number; i++)
		{	
			fact=fact*i;	
		}
			System.out.println("Factorial number of " +number+ " is :" +fact);

	}

}
