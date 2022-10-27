public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1,int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        if (x1 != x2) {
            String coord1 = "( " + x1 + "," + y1 + ")";
            String coord2 = "( " + x2 + "," + y2 + ")";
        }




    }
    public String start(){
        String start = "Welcome!";
        return start;
    }
    public double distance(){
        double x = Math.pow((x2-x1),2);
        double y = Math.pow((y2-y1),2);
        double dis = Math.sqrt(x+y);
        return roundedToHundredth(dis);




    }
    public double yIntercept(){
        double ySlope=(y2-y1);
        double xSlope=(x2-x1);
        double slope = roundedToHundredth(ySlope/xSlope);
        double yInter= y2-(slope*x2);
        return roundedToHundredth(yInter);

    }
    public double slope(){
        double ySlope=(y2-y1);
        double xSlope=(x2-x1);
        double slope = roundedToHundredth(ySlope/xSlope);
        return slope;
    }
    public String equation() {
        double ySlope = (y2 - y1);
        double xSlope = (x2 - x1);
        double slope = roundedToHundredth(ySlope / xSlope);
        if ((y1==x1)&&(y2==x2)&&(yIntercept()==0)) {
            String equation = "y = x";
            return equation;
        }else if((slope==0)&&(yIntercept()>0)){
            String equation = "y = " + y1;
            return equation;
        }else if((slope==0)&&(yIntercept()<0)){
            String equation = "y = " + y1;
            return equation;
        }else if (slope==1) {
            String equation = "y = " + "x + " + yIntercept();
            return equation;
        }else if (slope==-1) {
            String equation = "y = " + "-x + " + yIntercept();
            return equation;

       }else if((yIntercept() ==0)&& (ySlope % xSlope == 0)&&(xSlope<0)){
            String equation = "y = " + (-(y2 - y1)) / (Math.abs(x2 - x1)) + "x" ;
            return equation;
        }else if ((ySlope % xSlope == 0) && (yIntercept() < 0)) {
            String equation = "y = " + (y2 - y1) / (x2 - x1) + "x" + yIntercept();
            return equation;
        }else if ((ySlope % xSlope == 0) && (yIntercept() > 0)) {
            String equation = "y = " + (y2 - y1) / (x2 - x1) + "x" + "+"+ yIntercept();
            return equation;
        }else if (slope<0) {
            String equation = "y = " + -(y2 - y1) + "/" + Math.abs(x2 - x1) + "x"+ "+" + yIntercept();
            return equation;
        }else if((xSlope%2 == 0) & (ySlope%2) == 0){
            String equation = "y = " + (y2 - y1)+ "/" + (x2 - x1) + "x +" + yIntercept();
            return equation;
        } else if((xSlope%2 == 0) & (ySlope%2) == 0){
            String equation = "y = " + (y2 - y1)+ "/" + (x2 - x1) + "x +" + yIntercept();
            return equation;
        } else if ((yIntercept()!=(0) == false)) {
             String equation = "y = " + (y2 - y1) + "/" + (x2 - x1) + "x";
             return equation;
         }else if ((ySlope%2) == 0){
             String equation = "y = " + slope() + "x + " + yIntercept();
             return equation;
        }else if(yIntercept()<0) {
            String equation = "y = " + (y2 - y1) + "/" + (x2 - x1) + "x" + yIntercept();
            return equation;
        }else if((ySlope/xSlope)>0){
            String equation = "y = " + -(y2 - y1) + "/" + Math.abs(x2 - x1) + "x + " + yIntercept();
            return equation;

        }else {
            String equation = "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yIntercept();
             return equation;

        }



    }
    public String coordinateForX(double xValue){
        double newY = roundedToHundredth(xValue) * slope() +yIntercept();
        double coordY = roundedToHundredth(newY);
        String newCoord = "(" + xValue + "," + coordY + ")";
        return newCoord;


    }
    public double roundedToHundredth(double toRound){
        return Math.round(toRound*100)/100.000;

    }
    public String lineInfo(){
        System.out.println("These two points are: " + "(" + x1 + "," + y1 + ")" +" and " + "(" + x2 + "," + y2 + ")");
        System.out.println("The equation between these two points is: " + equation());
        System.out.println("The slope of this line is: " + slope());
        System.out.println("The y-intercept of the line is: " + yIntercept());
        System.out.println("The distance between the two points is: " + distance());
        String line = "";
        return line;

    }

}