import java.util.Scanner;

public class Problem1 {


    public static class Calculator {
        public double add(double a, double b) {
            return a + b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(double a, double b) {
            try{
                if (b == 0) {
                throw  new ArithmeticException();
            }
             
        }catch(ArithmeticException e){
            System.out.println("Error");
        }
            
        return a / b;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.next().toLowerCase();

        Calculator calc = new Calculator();
        double result = 0;

  
      
            switch (operation) {
                case "add":
                    result = calc.add(a, b);
                    break;
                case "subtract":
                    result = calc.subtract(a, b);
                    break;
                case "multiply":
                    result = calc.multiply(a, b);
                    break;
                case "divide":
                    result = calc.divide(a, b);
                    break;
                default:
                    System.out.println("Invalid operation type.");
                    return;
      
            }
            System.out.println("Result: " + result);


      
    }
}
}