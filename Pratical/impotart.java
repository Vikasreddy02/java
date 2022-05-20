package packagecorejava;

import java.util.Scanner;

public class inportartopr {
	
public static void main(String[] args) {
	//1000 auto-generated method stub
	
	//create scanner class object
	Scanner sc= new Scanner(System.in);
	
	//Input two number from user 
	System.out.println("Enter first number:");
	int num1 = sc.nextInt();
	
	System.out.println("Enter second number");
	int num2 = sc.nextInt();
	
	//perform arithmetic operations
	int add,sub,mul,div,mod;
	add=num1+num2;
	sub=num1-num2;
	mul=num1*num2;
	div=num1/num2;
	mod=num1%num2;
	//print result
	System.out.println("Addition is:"+add);
	System.out.println("Subtraction is:"+sub);
	System.out.println("Multiplication is:"+mul);
	System.out.println("Division is:"+div);
	System.out.println("Modulo divisionis:"+mod);
	
}
}
