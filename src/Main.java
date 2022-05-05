public class Main {
    public static void main(String[] args) {
        System.out.println("1 рівень");
        IntegralCalculation firstLevelService = new IntegralCalculation();
        System.out.println("Метод лівих прямокутниів: "+firstLevelService.rectangleMethodLeft(0,3,0.5));
        System.out.println("Метод правих прямокутників: "+firstLevelService.rectangleMethodRight(0,3,0.5));
        System.out.println("Метод серединних прямокутниів: "+firstLevelService.rectangleMethodMidlle(0,3,0.5));
        System.out.println("Метод трапецій: "+firstLevelService.trapezoidMethod(0,3,0.5));
        System.out.println("Метод Сімпсона: "+firstLevelService.simpsonMethod(0,3,0.5));

        System.out.println("2 рівень");
        EquationSolutions secondLevelService = new EquationSolutions();
        System.out.println("Метод половинчастого ділення: "+ secondLevelService.halfDivision(1,2,0.0001));
        System.out.println("Метод дотичних: "+ secondLevelService.methodNewton(1,2,0.0001));
        System.out.println("Метод хорд: "+ secondLevelService.methodChord(1,2,0.0001));

        System.out.println("3 рівень");
        System.out.println("Метод ейлера:");
        DifferentialEquation thirdLevelService=new DifferentialEquation();
        thirdLevelService.Eyler(2,5,3,0.2);
        thirdLevelService.print();
    }
}