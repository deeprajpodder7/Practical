package WhileDoWhile;


//find out sum of positive number


import java.util.*;
public class WhileDoWhileScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int number=0;
/* Scanner input = new Scanner(System.in);  //scanner class
System.out.println("Enter the numbers:");
int number = input.nextInt();  //taking input from user
while(number>0) {
	//add only positive number
	sum+=number;
	System.out.println("Enter the number:");
	number=input.nextInt();
	
}
	System.out.println("The Sum is:"+sum); */

Scanner input = new Scanner(System.in);
do {
	
	sum+=number;
	System.out.println("Enter the number:");
	number=input.nextInt();
	
}while(number>0);
	System.out.println("The Sum is:"+sum);
}

}
