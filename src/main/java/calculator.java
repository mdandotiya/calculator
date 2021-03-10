import java.util.Scanner;

public class calculator {
    public double squareRoot(double x){
        return Math.sqrt(x);
    }
    public int factorial(int x){
        if(x==1){
            return x;
        }
        else{
            return x*factorial(x-1);
        }
    }
    public double logBaseE(double x){
        return Math.log(x);
    }
    public double power(double x, double b){
        return Math.pow(x,b);
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        int n;
        do {
            System.out.println("Welcome to IIITB's Scientific Calculator\n"
                    + "1.Square root of a number\n" +
                    "2.Factorial of a number\n" +
                    "3.Log of a number with base e\n" +
                    "4.x to the power b\n" +
                    "5.Exit\n" +
                    "Press 1 to find the square root\nPress 2 to find factorial of a number\n" +
                    "Press 3 to find the logarithm of a number with base e\n" +
                    "Press 4 to find x to the power b\nPress 5 to exit the calculator\n");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if(n==1){
                double x;
                System.out.println("Enter the number whose square root you want to calculate");
                x = scanner.nextDouble();
                System.out.println("Square root of "+ x +"is :" + calc.squareRoot(x));
            }
            else if(n==2){
                int x;
                System.out.println("Enter the number whose factorial you want to find");
                x = scanner.nextInt();
                System.out.println("Factorial of "+ x +"is :" + calc.factorial(x));
            }
            else if(n==3){
                double x;
                System.out.println("Enter the number whose log you want to find");
                x = scanner.nextDouble();
                System.out.println("Log of "+ x +"is :" + calc.logBaseE(x));
            }
            else if(n==4){
                double x,b;
                System.out.println("Enter the x in x to the power of b");
                x = scanner.nextDouble();
                System.out.println("Enter the b in x to the power of b");
                b = scanner.nextDouble();
                System.out.println(x + "to the power of " + b + "is : " + calc.power(x,b));
            }
        }
        while(n!=5);

    }
}