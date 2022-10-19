public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1=x1;
        this.y2=x2;
        this.x2=x2;
        this.y2=y2;
        if (x1 != x2) {
            String coord1 = "( " + x1 +","+ y1 + ")";
            String coord2 = "( " + x2 +","+ y2 + ")";
        }else{
            double slopeXsame = 1;
        }


    }
    public double distance(){
        double x = (x2-x1)^2;
        double y =(y2-y1)^2;
        double dis = Math.sqrt(x+y);
        System.out.println(x);
        System.out.println(y);



        return Math.round((100*dis))/100;




    }
    public double yIntercept(){
        double yy = (y2-y1);
        double xx = (x2-x1)*2;
        double yInter= y2/(yy/xx);
        return Math.round(yInter);

    }
    public double slope(){
        double slope = (y2-y1)/(x2-x1);
        return Math.round(slope);
    }
    public String equation(){

        String equation = "y = " + slope() + "x + " + yIntercept();
        return equation;
    }
    public String coordinateForX(double xValue){
        double coordY = xValue * slope() +yIntercept();
        String newCoord = "(" + xValue + "," + coordY + ")";
        return newCoord;


    }
    public double roundedToHundredth(double toRound){
        return Math.round(toRound);

    }
    public String lineInfo(){

    }

}

