package operator;

public class OperatorExample {
		public static void main(String[] args) {
			//initialize a & b
			int a= 10;
			int b=20;
			//These are Arithmetic operators
			System.out.println(a+b); //addition
			System.out.println(a-b); //subtraction
			System.out.println(a*b); //multiplication
			System.out.println(a/b); //division
			System.out.println(a%b); //remainder
			//These are relational Operators
			 System.out.println(a == b); //equals
			 System.out.println(a != b);//not equals
			 System.out.println(a > b);//greater than
			 System.out.println(a < b);//less than
			 System.out.println(a >= b);//greater than equals
			 System.out.println(a <= b);//lesser than equals
			 //These are Logical Operators
			System.out.println(a<b&&b<a);
			System.out.println(a<b&&b>a);
			System.out.println(a<b||b<a);
			//These are Unary Operators
			System.out.println(a++ + ++a);
			System.out.println(b++ + ++b);

		}

}


