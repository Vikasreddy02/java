package corejava;

//java program showcasing use of call by value in this example

//importing java input output classes
import java.io.*;
public class CallByValueEx {
	// Method to swap numbers
	static void swap(int a, int b)
	{

	 

	// Creating a temporary variable in stack memory
	// and updating values in it.

	 

	// Step 1
	int temp = a;
	// Step 2
	a = b;
	// Step 3
	b = temp;

	 

	// This variables vanishes as scope is over
	}

	 

	// Main driver method
	public static void main(String[] args)
	{
	// Custom inputs/numbers to be swapped
	int x = 5;
	int y = 7;

	 

	// Display message before swapping numbers
	System.out.println("before swapping x = " + x + " and y = " + y);

	 

	// Using above created method to swap numbers
	swap(x, y);

	 

	// Display message after swapping numbers
	System.out.println("after swapping x = " + y + " and y = " + x);
	}
	}

