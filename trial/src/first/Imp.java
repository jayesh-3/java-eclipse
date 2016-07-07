package first;

import java.util.Scanner;

public class Imp implements calc {

	@Override
	public Integer add(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		
		return val1 + val2;
	}

	@Override
	public Integer subtract(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1 - val2;
		
	}

	@Override
	public long multiply(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1 * val2;
	}

	@Override
	public Integer divide(Integer val1, Integer val2) throws ArithmeticException {
		// TODO Auto-generated method stub
		return val1 / val2;
	}


public static void main(String[] args)
{
	
	calc obj = new Imp();
	 Integer val1, val2, choice;
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Enter input" );
	 val1 = input.nextInt();
	 
	 System.out.println("Enter input");
	 val2 = input.nextInt();
	 
	 System.out.println("Enter your choice");
	 choice = input.nextInt();
	  obj.add(1, 2);
	 switch (choice)
	 {
	 case 1: 
System.out.println(obj.add(val1, val2));
		 break;
	 case 2:
		 System.out.println(obj.subtract(val1, val2));
		 break;
	 case 3: 
		 System.out.println(obj.multiply(val1, val2));
		 break;
	 case 4:
		 try{
			 System.out.println(obj.divide(val1, val2));
		 }
		 catch(ArithmeticException e){
			 System.out.println("Divide exception");
		 }
			break; 
		 }
		 }
	 
	 
	 
	 
}
