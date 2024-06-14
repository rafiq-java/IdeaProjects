import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int getInteger() {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int integer = input.nextInt();
        return integer;
    }
    public static double getDecimal() {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        double decimal = input.nextDouble();
        return decimal;
    }
    public static String getName(){
        System.out.println("Enter name");
        Scanner string = new Scanner(System.in);
        String name = string.next();
        return name;
    }
    public static double addition(double x,double y) {
       double z = x + y;
       return z;
    }
    public static double multiply(double x,double y){
        double z = x * y;
        return z;
    }
    public static double divide(double x,double y){
        double z = x/y;
        return z;
    }
    public static void Operation(int operation, double x, double y){
        if (operation == 1){
            System.out.println(addition(x,y));
        } else if (operation == 2) {
            System.out.println(multiply(x,y));
        }else if (operation == 3){
            System.out.println(divide(x,y));
        }
    }
    public static int getOption(){
        Scanner getOption = new Scanner(System.in);
        int option = getOption.nextInt();
        while (option != 1 && option != 2 && option != 3){
            System.out.println("\n Enter Valid Number");
            option = getOption.nextInt();
        }
        return option;
    }
    public static int getInt(){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        return x;
    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome! ");
       /* int n1 = getInt();
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= n1; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + " " + i);

        }
        System.out.printf("Name is " + " " + getName());*/

        System.out.println(" \n Arithmetic Operations");
        System.out.println("\n Decimal");
        double x = getDecimal();
        double y = getDecimal();
        System.out.println("\n Enter 1 for Addition \n Enter 2 for Multiplication \n Enter 3 for division");
        Operation(getOption(),x,y);
        System.out.println("\n Integer");
        int a = getInt();
        int b = getInt();
        System.out.println("\n Enter 1 for Addition \n Enter 2 for Multiplication \n Enter 3 for division");
        Operation(getOption(),a,b);
    }
}

