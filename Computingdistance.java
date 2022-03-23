//Ittehad Qabid Java - Computing Distance

import java.util.Scanner;
public class Computingdistance
{
	public static void main(String[]args) {
		double x1,y1,x2,y2;
		double distance;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the coordinates of the 1st Point: " + "Put a space between them:)");
		x1 = scan.nextDouble();
		y1 = scan.nextInt();
		
		System.out.println("Enter the coordinates of the 2nd Point: " + "Put a space between them:)");
		x2 = scan.nextDouble();
		y2 = scan.nextInt();
		
		distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		System.out.println("The Distance Between" + "("+x1+","+y1+"),"+"("+x2+","+y2+")) is : " + distance + "units");
	}
}
