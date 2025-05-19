import java.util.*;

public class Student {
    String clgName, state; //variables
    int pinCode; //variables

    Student(String clgName, String state, int pinCode) { //constructor and 3 parameters passed
        this.clgName = clgName;
        this.state = state;
        this.pinCode = pinCode;
    }

    public static void main(String[] args) { //main method
        Scanner cls = new Scanner(System.in); //scanner class means to take user input
        System.out.println("Enter name:");
        String name1 = cls.nextLine(); //storing user input
        System.out.println("Enter Branch name:");
        String name2 = cls.nextLine(); //storing user input
        System.out.println("Enter Roll number:");
        int name3 = cls.nextInt(); //storing user input
        if (name1.length() <= 10) { //if block

            System.out.println("Name is: " + name1 + "\nBranch name is: " + name2 + "\nRoll number is :" + name3);   //print statement
        } else {                   //else block
            System.out.println("\t\tEnter valid name: "); //print statement
        }
        Student std = new Student("BVC Engineering college", "Andhra Pradesh", 533253); //calling constructor by creating object
        System.out.println("\n" + std.clgName + "\n" + std.state + "\n" + std.pinCode); //print statement
    }
}