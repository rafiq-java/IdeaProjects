import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        //int students[] = new int[5];*/
       int students[] = {num.nextInt(),num.nextInt(),num.nextInt(),num.nextInt(),num.nextInt()};
       int rol = num.nextInt();
       /* students[0] = num.nextInt();
        students[1] = num.nextInt();
        students[2] = num.nextInt();
        students[3] = num.nextInt();
        students[4] = num.nextInt();
*/
        System.out.println(students[rol]);
    }
}