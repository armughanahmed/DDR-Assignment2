import java.util.*;  

public class Shape {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println();
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter 1 for Rectangle");
			System.out.println("      2 for Square");
			System.out.println("      3 for Circle");
			System.out.println("      any character to quit\n");
			int choice= sc.nextInt();
			if(choice==1) {
				ARectangle rect01 = new ARectangle(1.5, 1.5, 5.5, 4.9);
		        System.out.println("Area: " + rect01.Area());
		        System.out.println("Perimeter: " + rect01.Perimeter());
		        System.out.println(rect01.holds(2.5, 2.5));
		        System.out.println(rect01.holds(new ARectangle(3, 5, 8.5, 3.5)));
		        System.out.println(rect01.covers(new ARectangle(3, 5, 2.3, 5.4)));
			}
			else if(choice==2) {
				ASquare rect01 = new ASquare(1.5, 1.5, 5.5);
		        System.out.println("Area: " + rect01.Area());
		        System.out.println("Perimeter: " + rect01.Perimeter());
		        System.out.println(rect01.holds(2.5, 2.5));
		        System.out.println(rect01.holds(new ASquare(3, 5, 8.5)));
		        System.out.println(rect01.covers(new ASquare(3, 5, 2.3)));
			}
			else if(choice==3) {
				ACircle rect01 = new ACircle(1.5, 1.5, 5.5);
		        System.out.println("Area: " + rect01.Area());
		        System.out.println("Perimeter: " + rect01.Perimeter());
		        System.out.println(rect01.holds(2.5, 2.5));
		        System.out.println(rect01.holds(new ACircle(3, 5, 8.5)));
		        System.out.println(rect01.covers(new ACircle(3, 5, 2.3)));
			}
			else {
				System.out.println("Application ended! Assignment by k17-3696");
				break;
			}
		}
	}

}
