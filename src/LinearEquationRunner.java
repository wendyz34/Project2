import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        //user should be able to type in each in coordinate form, like this:  (5, -12)
        System.out.println("Welcome");
        System.out.println("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.println("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int x1= Integer.parseInt(coord1.substring(1,coord1.indexOf(",")));
        int y1= Integer.parseInt(coord1.substring(coord1.indexOf(",") + 1, coord1.indexOf(")")));
        int x2= Integer.parseInt(coord2.substring(1,coord2.indexOf(",")));
        int y2= Integer.parseInt(coord2.substring(coord2.indexOf(",") + 1,coord2.indexOf(")")));
        LinearEquation equation = new LinearEquation(x1,y1,x2,y2);
       /*String stringx1 = coord1.substring(1,(coord1.indexOf(",")));
       System.out.println(stringx1);
       int x1 = Integer.parseInt(stringx1);
       String stringy1 = coord1.substring(coord1.indexOf(" "),(coord1.indexOf(")")));
       System.out.println(stringy1);
       int y1 = Integer.parseInt(stringy1);
       String stringx2 = coord1.substring(1,(coord1.indexOf(",")));
       System.out.println(stringx2);
       int x2 = Integer.parseInt(stringx2);
       String stringy2 = coord1.substring(coord1.indexOf(" "),(coord1.indexOf(")")));
       System.out.println(stringy2);
       int y2 = Integer.parseInt(stringy2);//need to be int*/
        //LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.slope());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Distance: " + equation.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));



    }
}
