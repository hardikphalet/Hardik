import java.util.Scanner;                                                                          // A class that allows us to take input.
import java.lang.Math;                                                                             // To compute square roots of numbers.
import java.util.ArrayList;                                                                        // For input purposes.

interface Triangle {                                                                               
	public void printTArea();																	   // This method is later going to return triangle's area.
	public static double semiP(double x,double y,double z) {                                       // Declaring a static method.
		return (x+y+z)/2;
	}
}
interface Rectangle { 
	public void printRArea();                                                                      // This method is later going to return rectangle's area.
}

class Shapes implements Triangle, Rectangle{                                                       // Multiple inheritence, the following class inherits both the interfaces.
	double s1,s2,s3,l,b;
	public Shapes(double x,double y,double z){ 
		s1 = x;
		s2 = y;
		s3 = z;
	}
	public Shapes(double x,double y){                                                              // Method Overloading for ease of use.
		l = x;
		b = y;
	}
	public void printRArea(){ 																	   // Implementing methods defined in interfaces.
		System.out.println("Area of the rectangle is "+l*b);
	}
	public void printTArea(){
		double s = Triangle.semiP(s1,s2,s3);
		System.out.println("Area of the triangle is "+ Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)));
	}
}

class MI {
	public static void main(String[] args){                                                        // A fancy way to take input. Inputs a String, seperates value 
		Scanner scan = new Scanner(System.in);                                                     // by spaces and converts every element in a Double
		System.out.print("Enter numbers and seperate them by a ' ' (<space>)  :::    ");           // Finally appends everything in a ArrayList inputArr.
		String input = scan.nextLine();
		 // to take input
		
		ArrayList<Double> inputArr = new ArrayList<Double>();
		
		Double ax = 0d;
		String[] arrInput = input.split(" ");
		for (String s : arrInput){
			ax = Double.parseDouble(s);
			inputArr.add(ax);
		}
		scan.close();
		
		if (inputArr.size() == 2){                                                                 // If loops here check how many input we have. If we give 2 inputs
			Shapes rect = new Shapes(inputArr.get(0),inputArr.get(1));                             // Then the output is area of a rectangle with two mentioned sides
			rect.printRArea();                                                                     // If we give three inputs then program outputs area of a triangle 
		}                                                                                          // with three mentioned sides.
		else if (inputArr.size() == 3){
			Shapes tri = new Shapes(inputArr.get(0),inputArr.get(1),inputArr.get(2));
			tri.printTArea();
		}
		else {
			System.out.println("Invalid number of inputs.");
			System.exit(0);
		}
	}
}