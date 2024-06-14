import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      /*  System.out.printf("Hello and welcome!");
        System.out.println(" ");
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

            int x,y,z;
            String name1,name2;
            x=1;
            y=2;
            z=3;

            name1="XX";name2="YY";
        }*/

        /*int x=54321;
        int a,b,c,d,e;

        a = x/10000;
        b = x%10000;
        b = b/1000;
        c = x%10000;
        c = c%1000;
        c = c/100;
        d = x%10000;
        d = d%1000;
        d = d%100;
        d = d/10;
        e = x%10000;
        e = e%1000;
        e = e%100;
        e = e%10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);*/

       /* Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        //Write your code here
        //You can import the scanner class as discussed in the videos
        System.out.println("Enter 3 integers. Press enter after each integer");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int d = a*b+c;
        System.out.println(d);*/
        /*char a='a';
        char b='A';
        int i=(int)a-(int)b;
        char c=(char) i;
        System.out.print(c);*/

        /*Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        float f=input.nextFloat();
        double d=input.nextDouble();
        float x = (float) a;
        int y = (int)f;
        float z = (float) d;
        System.out.println("x=" + x + " y=" + y + " z=" + z);*/

        /*String name;
        int year;
        Scanner input= new Scanner(System.in);
        name=input.nextLine();
        year=input.nextInt();
        year = year+4;
        System.out.println("Hello " + name);
        System.out.println("Free services till: " + year);*/
        /*String Students[];
        Students = new String[6];*/
        /*int X,Y,A,B,heartRate;
        Scanner input= new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextInt();
        A=input.nextInt();
        B=input.nextInt();
        heartRate=input.nextInt();
        if (X+Y > 30 && A>3 || B<6 && heartRate == 70){
            System.out.println("The statement said by the person is true");
        }
       else {
            System.out.println("The statement said by the person is false");
        }
        */
        /*Scanner input = new Scanner(System.in);

        //Values of each digit
        int tenThousands, thousands, hundreds, tens, ones;

        //Prompt user to input 5 digit number
        System.out.println("Enter Number");
        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("\nError! Number more than 5 digits.");
        } else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        } else if (10000 <= number && number <= 99999) {
            //WRITE YOUR CODE HERE
            tenThousands = number / 10000;
            thousands = number % 10000;
            thousands = thousands / 1000;
            hundreds = number % 10000;
            hundreds = hundreds % 1000;
            hundreds = hundreds / 100;
            tens = number % 10000;
            tens = tens % 1000;
            tens = tens % 100;
            tens = tens / 10;
            ones = number % 10000;
            ones = ones % 1000;
            ones = ones % 100;
            ones = ones % 10;

            System.out.println(tenThousands);
            System.out.println(thousands);
            System.out.println(hundreds);
            System.out.println(tens);
            System.out.println(ones);*/

        /*String names[] = new String[4];
        names[0] = "Henry";
        names[1] = "Shane";
        names[2] = "Sharma";
        names[3] = "Watson";

        System.out.println(names[0] + names[2]);
        System.out.println(names[1] + names[3]);*/
        /*int myAge;
        int ageOfBrother;
        //Write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        myAge = input.nextInt();
        System.out.println("Enter your brother's age");
        ageOfBrother = input.nextInt();
        if(myAge <= 0 || ageOfBrother <= 0){
            System.out.println("false");
        } else if(myAge < 25 && ageOfBrother < 25) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/
       /* int X,Y,A,B,heartRate;
        Scanner input= new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextInt();
        A=input.nextInt();
        B=input.nextInt();
        heartRate=input.nextInt();
        if(X+Y > 30){
            System.out.println("The person is telling the truth");
        }else if(A>3 || B<6){
            System.out.println("The person is telling the truth");
        }else if(heartRate == 70 && X>3){
            System.out.println("The person is telling the truth");
        }else {
            System.out.println("The person is lying");
        }*/

        /*int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        if(n1<n2){
            if(n2<n3){
                System.out.println("The smallest number entered is " + n1);
            }else if(n2>n3){
                if(n1<n3){
                    System.out.println("The smallest number entered is " + n1);
                }else if(n1>n3){
                    System.out.println("The smallest number entered is " + n3);
                }
            }
        } else if(n1>n2){
            if(n2<n3){
                System.out.println("The smallest number entered is " + n2);
            }if(n2>n3){
                System.out.println("The smallest number entered is " + n3);
            }
        }*/
       /* int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        switch (n){
            case 1:
                System.out.println("Hufflepuff");
                break;
            case 2:
                System.out.ptintln("Gryffindor");
                break;
            case 3:
                System.out.ptintln("Slytherin");
                break;
            case 4:
                System.out.ptintln("Ravenclaw");
                break;
            default:
                System.out.ptintln("Enter a number from 1 to 4");
        }*/

        /*int length,breadth;
        Scanner input = new Scanner(System.in);
        length=input.nextInt();
        breadth=input.nextInt();
        if(length == breadth){
            System.out.println("Square");
        }else{
            System.out.println("Rectangle");
        }*/

        /*Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();

        double tax = 0.0;
        if(income <= 250000){
            tax = 0;
        }else if(income >= 250001 && income <= 300000){
            if(age < 60){
                tax = tax + ((income-250000)*10)/100;
            }else {
                tax = 0;
            }
        }else if(income >= 300001 && income < 500000){
            if(age < 80){
                tax = (double)((300000-250000)*10)/100;
                tax = tax + ((income-300000)*10)/100;

//                tax = tax + (income - 500000)*20/100;
//                tax = (income*10)/100;
            }else{
                tax = 0;
            }
        }else if(income >= 500001 && income < 1000000){
            tax = (double)((500000-250000)*10)/100;
            tax = tax + ((income-500000)*20)/100;
//            tax = (income*20)/100;
        }else if(income > 1000000){
            tax = (double) (1000000-500000)*20/100;
            tax = tax + (double) (1000000-500000-250000)*10/100;
            tax = tax + (income - 1000000)*30/100;
        }
        // Write your logic here

        System.out.print(tax);*/
        /*int n = 25;
        int m;
        while (n >= 1){
            m = n%2;
            if(m != 0){
                System.out.print(n + " ");
            }
            n--;
        }*/

        /*char start ='a',end = 'z';
        int n = 97,m=end;
        while (n>=97 && n<=m){
            System.out.print(start + " ");
            n++;
            start=(char)n;*/
           /* int n=2;
            for (int i=12-n; i>2;i=i-n){
                System.out.println(i);
            }*/
        /*Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            int number = input.nextInt();
            sum = sum + number;
            int avg = sum/n;
            if(i==n){
                System.out.println(avg);
            }
        }*/

        /*int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int counter = 0;
        for (counter = 0; n >=0; n = n / 10) {
            counter++;
            if (n == 0) {
                counter--;
                System.out.println(counter);
                break;
            }
        }*/

      /* int x;
       Scanner input = new Scanner(System.in);
       x = input.nextInt();
       String names[];
       names = new String[x];
       add(int x,int y){

        }*/
        /*Scanner scan = new Scanner(System.in);
        // Enter number 1 in the Input Console
        int setNumber = scan.nextInt();
        int number = 2, highestPower = 1;

        while(highestPower < setNumber){
            highestPower = highestPower * 2;
            if(highestPower >setNumber){
                highestPower = highestPower/2;
                break;
            }
        }
        System.out.print(highestPower);*/

        /*int min;
        int[] array = {156, 171, 260, 95, 244, 296, 137, 180, 198, 61, 70, 283, 276, 55,
                + 100, 59, 278, 191, 109, 110, 158, 206, 77, 279, 53, 117, 217, 214, 107, 99, 222,
                + 275, 179, 213, 199, 139, 174, 286, 176, 155, 237, 256, 251, 187, 249, 215, 211, 113,
                + 144, 50, 148, 49, 170, 236, 219, 106, 71, 263, 145, 231, 190, 165, 239, 41, 177, 297,
                + 184, 193, 287, 202, 161, 189, 79, 232, 154, 153, 208, 72, 143, 300, 233, 124, 75,
                + 277, 63, 130, 86, 242, 203, 116, 196, 289, 146, 273, 268, 56, 104, 173, 134, 194};

        int lngth = array.length;
        min = array[0];
        for(int i=0;i<lngth;i++){
            if(min <= array[i]){
                continue;
            } else {
                min = array[i];
            }

        }
        System.out.println(min);*/
        /*    Scanner scan = new Scanner(System.in);
            // Enter the numbers in the input console
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            System.out.print(lcm(number1, number2));
        }

    public static int lcm(int number1,int  number2){
        int lcm = 1;
        int prd = number1*number2;
        int gcd = 1;
        int div = 1;

        if(number1<number2){
            for (int i=1;i<=number1;i++){
                if(number1%i != 0 || number2%i != 0 ){
                    continue;
                }
                gcd = i;
            }
        }
        lcm = prd/gcd;

        return lcm;*/

        /*double[] array = {10.32,30.50,20.36,40.51,50.49,60.43,71.71};
        Arrays.sort(array);
        for(int i = 0; i <  array.length; i++) {
            // Write the round function here.
            array[i] = Math.round(array[i]);

        }


        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + " ");
        }*/

        /*try {
            File inputFile = new File("C:\\Users\\DISPATCHTRACK 1\\Downloads\\59.txt");
            Scanner scan = new Scanner(inputFile);
            int sum = 0,i=1;
            for(i=1; scan.hasNext();i++){

                sum = sum + scan.nextInt();
            }
            i--;
            System.out.println("Sum is : " + i + " " + sum);
            double mean = (double)sum/(double)i;
            System.out.println("Mean is : " + mean);
        }catch(Exception E){
            System.out.println("Check the file name and folder");
        }*/

   /* Scanner input = new Scanner(System.in);
    System.out.println("Enter Max Marks. Please note : This cannot be changed later");
    student s1 = new student("Rafiq", 21.5f, 13.9f, 56.0f, 98.0f);
    System.out.println(student.total(s1.chemistry,s1.physics,s1.math,s1.english));
    float Total = student.total(s1.chemistry,s1.physics,s1.math,s1.english);
    student s2 = new student(48.0f,49.0f,50.0f);
    Total = student.total_majors(s2.chemistry,s2.physics,s2.math);
    System.out.println(student.total_majors(s2.chemistry,s2.physics,s2.math));
    System.out.println("Percentsge is : " + s2.percentage_majors(student.total_majors(s2.chemistry,s2.physics,s2.math),student.maxMarks));
    }


}*/

/*class student{
    public static final int maxMarks = variable.setMax();
    public String name;
    public float physics;
    public float chemistry;
    public float math;
    public float english;


    *//*public static int setMax(){
        Scanner inpt = new Scanner(System.in);
        return inpt.nextInt();
    }*//*
    public student(String name,float physics,float chemistry,float math,float english){
        this.name = name;
        this.physics = physics;
        this.chemistry = chemistry;
        this.math = math;
        this.english = english;
    }
    public student(){

    }
    public student(float physics,float chemistry,float math){
        this.physics = physics;
        this.chemistry = chemistry;
        this.math = math;
    }
    public static float total_majors(float physics,float chemistry,float math){
        return physics+chemistry+math;
    }

    public static float total(float x, float y, float z, float a){
        return x+y+z+a;
    }
    public float percentage(float total, int maxMarks){
        return (total/(float)maxMarks) * 100;
    }
    public float percentage_majors(float total_majors, int maxMarks){
        return (total_majors/(float)maxMarks) * 100;
    }
}*/

      /*  Person p1 = new Person();
        p1.setName("Ankit");
        System.out.print(p1.getName());
    }
}

class Person {
    public String name;

   \\ public String getName() {
        return name;
    }
    public void setName(String x){
        this.name = x;
    }
    // Declare a setter method here
}*/
       /* class SavingAmount {
            //write your code here
            private int amount;

            public void setInitialSaving(int amount){
                this.amount = amount;
            }
            public int getCurrentSaving(){
                return this.amount;
            }
            public void decrementSaving(){
                this.amount = this.amount-100;
            }
            public void incrementSaving(){
                this.amount = this.amount+1000;
            }
            public void checkSaving(){
                if(this.amount >= 1000){
                    System.out.println("Congratulations! You have saved a good amount");
                }else if (this.amount < 0){
                    System.out.println("You are in debt");
                }else if (this.amount >= 0 && this.amount < 1000){
                    System.out.println("Insufficient saving!");
                }
            }

        }

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs " + obj.getCurrentSaving());*/

        /*Scanner input1 = new Scanner(System.in);
        String player1 = input1.next();
        String player2 = input1.next();
        cards P1 = new cards(player1,input1.nextInt(),input1.next());
        cards P2 = new cards(player1,input1.nextInt(),input1.next());

        if(P1.getNumber() > P2.getNumber()){
            cards.setScore();
        }

    }
}
class cards {
    private String suit;
    private int number;
    Scanner input = new Scanner(System.in);
    private final String playerName;
    private static int score;

    public cards(String suit, int number, String playerName){
        this.suit = suit;
        this.number = number;
        this.playerName = playerName;
    }

    public int setNumber() {
        return input.nextInt();
    }
    public void setSuit() {
        this.suit = input.next();
    }

    public String getSuit() {
        return this.suit;
    }

    public int getNumber() {
        return this.number;
    }

    public int getSuitPriority() {
        int priority = 0;

        switch (getSuit()) {
            case "Spades":
                priority = 4;
                break;
            case "Diamonds":
                priority = 3;
                break;
            case "Hearts":
                priority = 2;
                break;
            case "Clubs":
                priority = 1;
                break;
        }
        return priority;
    }

    public static void setScore(int point){
        score = point;
    }
*/

        /*Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        parellelogram parallelogram = new parellelogram(side1, side2, height);
        System.out.println("Parallelogram Perimeter: " + parallelogram.getPerimeter());
        System.out.println("Parallelogram Area: " + parallelogram.getArea());

        //Rhombus
        double side = scan.nextDouble();
        height = scan.nextDouble();
        rhombus rhombus = new rhombus(side, height);
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());
        System.out.println("Rhombus Area: " + rhombus.getArea());

        //Rectangle
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        //Square
        side = scan.nextDouble();
        Square square = new Square(side);
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Area: " + square.getArea());

        scan.close();

    }
}

abstract class quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;


    public quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }
    abstract double getArea();
    abstract double getPerimeter();
}

class Rectangle extends quadrilateral{

    public Rectangle(double length,double breadth){
        super(length,breadth,length,breadth);
        this.side1 = length;
        this.side2 = breadth;
    }
    double getArea(){
        return this.side1 * this.side2;
    }
    double getPerimeter(){
        return (this.side1 + this.side2) * 2;
    }
}
class Square extends quadrilateral{

    public Square(double Squareside){
        super(Squareside,Squareside,Squareside,Squareside);
        this.side1 = Squareside;
    }
    public double getArea(){
        return this.side1 * this.side1;
    }
    public  double getPerimeter(){
        return 4 * this.side1;
    }
}
class rhombus extends quadrilateral{
    public rhombus(double base, double height){
        super(base,height,base,height);
        this.side1 = base;
        this.side2 = height;
    }
    public double getArea(){
        return (this.side1 * this.side2);
    }
    public double getPerimeter(){
        return 4 * this.side1;
    }
}
class parellelogram extends quadrilateral{
    public parellelogram(double side, double base, double height){
        super(side,base,height,side);
        this.side1 = side;
        this.side2 = base;
        this.side3 = height;
    }
public double getArea(){
    return this.side1 * this.side3;
}
public double getPerimeter(){
    return 2 * (this.side1 + this.side2);
}
}*/
        /*Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        int arr[] = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            arr[i] = input.nextInt();
        }
        int findValue = input.nextInt();
        for (int i = 0; i < numberOfElements; i++) {
            if (arr[i] == findValue) {
                System.out.print("true");
                break;
            } else if (i == numberOfElements - 1) {
                System.out.print("false");
            } else if (arr[i] != findValue) {
                continue;
            }

        }
    }
}*/

      /*  ArrayList arrlst = new ArrayList();

        arrlst.add(new random(1));
        arrlst.add(new random(2));
        arrlst.add(new random(3));
        arrlst.add(new random(4));
        printArrayList(arrlst);
    }
    public static void printArrayList(ArrayList x){
        for(Object o : x){
            random s = (random) o;
            System.out.println(s.getDetails());
        }*/

           /* ArrayList mix = new ArrayList();
            mix.add("Hari");
            mix.add(2);
            printMixList(mix);
        }
    public static void printMixList(ArrayList elements) {
        for(Object o : elements) {
            System.out.println(o);
        }*/

        /*ArrayList<Float> random = new ArrayList<Float>();
        random.add(2.0f);
        random.add(4.0f);
        random.add(5.0f);
        random.add(10.0f);
        random.add(99.9f);
        //Create an ArrayList using Generics here

        printArray(random);
    }
    public static void printArray(ArrayList<Float> ran) {
        for(Float o : ran){
            //  random s = o;
            System.out.println(o);
        }
        //Complete the method declaration here*/

        /*Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();

        ArrayList<Integer> straightList = new ArrayList<Integer>();
        for(int i=0;i<numberOfElements;i++){
            straightList.add(input.nextInt());
        }
        reverseArrayList(straightList);


    }
    static void reverseArrayList(ArrayList<Integer> list){
        int z = list.size();
            for(int i=0;i<z;i++){

                int x,y;
                x = list.get(i);
                y = list.remove(z-1);
                list.add(i,y);
            }*/

        /*ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        System.out.println(random.contains(5f));*/
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
    static void reverseArray(int[] arr) {
        // Write your code here
        //int x,y,z = arr.length-1;
        int x;
        for(int j=0;j<arr.length;j++){
            if(arr[j] != 0){
                continue;
            }else{
                for(int k=j;k<arr.length;k++){
                    if(arr[k] == 0) {
                        for(int l=k;l<arr.length-1;l++){
                        arr[l] = arr[l + 1];
                    }
                        arr[arr.length - 1] = 0;
                    }
                }
            }
        }*/



        /*LinkedList<Student> studentList = new LinkedList<Student>();

        Student s1 = new Student("Sujit", 1);
        Student s2 = new Student("Siddharth", 2);
        Student s3 = new Student("Karanpreet", 3);
        Student s4 = new Student("Hari", 5);
        Student s5 = new Student("Tricha", 4);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        printStudentList(studentList);
    }

    public static void printStudentList(LinkedList<Student> students) {
        int i = 0;
        for(Student s : students) {

           if(i == 1) {
               System.out.println(s.getDetails(students));
               break;
           }
           i++;
        }
    }
}

class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails(LinkedList<Student> students) {

        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }*/
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        printList(random);
    }

    public static void printList(List<Float> arr) {
        ListIterator<Float> it = arr.listIterator();
        while (it.hasNext()) {
            it.next();
            System.out.println(it.next());
        }
    }

}



