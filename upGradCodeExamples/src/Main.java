//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
            Square sq = new Square();
        }
    }
class Shape {
    public Shape() {
        System.out.println("inside Shape class default constructor");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        System.out.println("inside Rectangle class default constructor");
    }
}

class Square extends Rectangle {
    public Square() {
        System.out.println("inside Square class default constructor");
    }
}