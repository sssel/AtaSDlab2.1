public class IntegralCalculation {
    private double function(double x){
        return Math.cos(Math.exp(x/3)+x);
    }
    public double rectangleMethodLeft(double a,double b,double step){
        double sum=0.0;
        double x = a;
        int n=(int)((b-a)/step);
        for (int i=0;i<n;i++){
            sum+=function(x+i*step);
        }
        return step*sum;
    }
    public double rectangleMethodRight(double a,double b,double step){
        double sum=0.0;
        double x = a;
        int n=(int)((b-a)/step);
        for (int i=0;i<=n;i++){
            sum+=function(x+i*step);
        }
        return step*sum;
    }
    public double rectangleMethodMidlle(double a,double b,double step){
        double sum=0.0;
        double x = a+step/2;
        int n=(int)((b-a)/step);
        for (int i=0;i<n;i++){
            sum+=function(x+i*step);
        }
        return step*sum;
    }
    public double trapezoidMethod(double a,double b,double step){
        double sum = (function(b)+function(a))/2;
        int n=(int)((b-a)/step);
        double current;
        for (int i=0;i<n;i++){
            current=a+step*i;
            sum+=function(current);
        }
        return step*sum;
    }
    public double simpsonMethod(double a,double b,double step){
        int n=(int) ((b-a)/step);
        double sum=function(a)+function(b);
        double subSum=0;
        double x;
        for (int i=1;i<n;i+=2){
            x=a+step*i;
            subSum+=function(x);
        }
        subSum*=4;
        sum+=subSum;
        subSum=0;
        for (int i=2;i<n-1;i+=2){
            x=a+step*i;
            subSum+=function(x);
        }
        subSum*=2;
        sum+=subSum;
        return sum*step/3;
    }
}
