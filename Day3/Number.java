public class Number {
    int Sum(int a, int b){
        return a+b;
    }

    int Sum(int a, int b, int c){
        return a+b+c;
    }

    double Sum(double a, int b){
        return a+b;
    }

    double Sum(double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Number obj1 = new Number();
        double x = obj1.Sum(2.34, 5);
        System.out.println(x);
    }
}
