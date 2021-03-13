import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public double squareRoot(double x){
        logger.info("[Square Root] - " + x);
        double result = Math.sqrt(x);
        logger.info("[Square root result] - " + result);
        return result;
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
        logger.info("[Log Base e] - " + x);
        double result = Math.log(x);
        logger.info("[Log Base e result] - " + result);
        return result;
    }
    public double power(double x, double b){
        logger.info("[Power] - "+ x + " "+b);
        double result = Math.pow(x,b);
        logger.info("[Power result] - " + result);
        return result;
    }

    public static void main(String[] args) {
        Main calc = new Main();
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
            try {
                n = scanner.nextInt();
            }
            catch (InputMismatchException e){
                return;
            }
            if(n==1){
                double x=0;
                System.out.println("Enter the number whose square root you want to calculate");
                try{
                x = scanner.nextDouble();
                }
                catch (InputMismatchException e){
                    logger.error("Not a number");
                }
                System.out.println("Square root of "+ x +"is :" + calc.squareRoot(x));
            }
            else if(n==2){
                int x=0;
                System.out.println("Enter the number whose factorial you want to find");
                try {
                    x = scanner.nextInt();
                }
                catch (InputMismatchException e){
                    logger.error("Not a number");
                }
                try {
                    System.out.println("Factorial of " + x + "is :" + calc.factorial(x));
                }
                catch (NumberFormatException e){
                    logger.error("No negative numbers");
                }
            }
            else if(n==3){
                double x=0;
                System.out.println("Enter the number whose log you want to find");
                try {
                    x = scanner.nextDouble();
                }
                catch (InputMismatchException e){
                    logger.error("Not a number");
                }
                System.out.println("Log of "+ x +"is :" + calc.logBaseE(x));
            }
            else if(n==4){
                double x=0,b=0;
                try {
                    System.out.println("Enter the x in x to the power of b");
                    x = scanner.nextDouble();
                    System.out.println("Enter the b in x to the power of b");
                    b = scanner.nextDouble();
                }
                catch (InputMismatchException e){
                    logger.error("Not a number");
                }
                System.out.println(x + "to the power of " + b + "is : " + calc.power(x,b));
            }
        }
        while(n!=5);

    }
}