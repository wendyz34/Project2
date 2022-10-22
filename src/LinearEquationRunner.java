import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        //user should be able to type in each in coordinate form, like this:  (5, -12)

        /*int x1 = 4;
        int y1 = 0;
        int x2 = 6;
        int y2 = 10;*/
        System.out.println("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.println("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int x1 = Integer.parseInt(coord1.substring(1,coord2.indexOf(",")));
        int y1= Integer.parseInt(coord1.substring(coord1.indexOf(" ,")+1 , coord1.indexOf(")")));
        int x2= Integer.parseInt(coord2.substring(1,coord2.indexOf(",")));
        int y2= Integer.parseInt(coord2.substring(coord2.indexOf(", ")+1 ,coord2.indexOf(")")));
        LinearEquation obj= new LinearEquation(x1,y1,x2,y2);
        System.out.println(obj.start());
        System.out.println("Equation: " + obj.equation());
        System.out.println("Slope: " + obj.slope());
        System.out.println("y-intercept: " + obj.yIntercept());
        System.out.println("Distance: " + obj.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(obj.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.println("Coordinate for x: " + obj.coordinateForX(testX));



    }
}
