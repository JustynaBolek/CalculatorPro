import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CalculatorPro calPro1=new CalculatorPro();
        Scanner scanner = new Scanner(System.in);
        int select;
        do{
            System.out.println("Enter first value");
            float x = scanner.nextInt();
            System.out.println("Enter second value");
            float y = scanner.nextInt();
            System.out.println("What do you want to do?\nSelect:\n1.addition\n2.substraction\n3.multiplication\n4.division");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Addition result: " + calPro1.addition(x, y));
                    break;
                case 2:
                    System.out.println("Subtraction result: " + calPro1.subtraction(x, y));
                    break;
                case 3:
                    System.out.println("Multiplication result: " + calPro1.multiplication(x, y));
                    break;
                case 4:
                    System.out.println("Division result: " + calPro1.division(x, y));
                    break;
                case 5:
                    System.out.println("Exit");
            }
        }
        while (select != 5);

        }

    }





