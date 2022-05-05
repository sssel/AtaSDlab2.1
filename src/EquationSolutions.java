public class EquationSolutions {
    private double funcion(double x){
        return Math.pow(x,3)-2*x;
    }
    private double firstDerivative(double x){
        return 2*x-2+1/x;
    }
    private double secondDerivative(double x){
        return 2-1/(x*x);
    }

    public double halfDivision(double a,double b,double ebs){
        double x=(a+b)/2;
        while (Math.abs(funcion(x))>ebs){
            if (funcion(a)*funcion(x)<0){
                b=x;
            }
            else if(funcion(b)*funcion(x)<0){
                a=x;
            }
            x=(a+b)/2;
        }
        return x;
    }
    public double methodNewton(double a,double b,double ebs){
        double x;
        if(funcion(a)*secondDerivative(a)>0){
            x=a;
        }
        else {
            x=b;
        }
        while (Math.abs(funcion(x))>ebs){
            x=x-funcion(x)/firstDerivative(x);
        }
        return x;
    }
    public double methodChord(double a,double b,double ebs){
        double x;
        if (funcion(a)*secondDerivative(a)>0){
            x=b;
            while (Math.abs(funcion(x))>ebs){
                x=x-(x-a)*funcion(x)/(funcion(x)-funcion(a));
            }
        }
        else {
            x=a;
            while (Math.abs(funcion(x))>ebs){
                x=x-(b-x)*funcion(x)/(funcion(b)-funcion(x));
            }
        }
        return x;
    }
}
