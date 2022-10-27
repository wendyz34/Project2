import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        //user should be able to type in each in coordinate form, like this:  (5, -12)
        System.out.println("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.println("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int x1 = Integer.parseInt(coord1.substring(1,coord1.indexOf(",")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(" ") + 1 , coord1.indexOf(")")));
        int x2 = Integer.parseInt(coord2.substring(1,coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(" ")+1 ,coord2.indexOf(")")));
        LinearEquation obj= new LinearEquation(x1,y1,x2,y2);
        System.out.println(obj.start());
        System.out.println(obj.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.println("Coordinate for x: " + obj.coordinateForX(testX));



    }
}