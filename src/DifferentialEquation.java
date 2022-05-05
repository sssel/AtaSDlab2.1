public class DifferentialEquation {
    public double derFunc(double x,double y){
        return Math.pow(Math.E,x)-y;
    }
    public double X[];
    public double Y[];
    public double[] Eyler(double x0, double xn, double y0, double h){
        int n = (int)((xn-x0)/h+1);
        X = new double[n];
        Y = new double[n];
        X[0] = x0;
        Y[0]= y0;
        for(int i=1; i<n;i++){

            Y[i] = Y[i-1] + h*derFunc(X[i-1],Y[i-1]);
            X[i] = X[i-1] + h;
        }
        return Y;
    }
    public void print(){
        System.out.println(" X | Y ");
        for (int i=0;i<X.length;i++){
            System.out.println(X[i]+" | "+Y[i]);
        }
    }
}
