import java.util.*;
public class Employee {
public static void main(String args[]) {
String name1,name2;
Scanner inputName= new Scanner(System.in);
System.out.println("Enter Employe name: ");
String name=inputName.nextLine();
System.out.println("Enter name1: ");
name1=inputName.nextLine();
System.out.println("Enter name2: ");
name2=inputName.nextLine();
String position="Architecture";
int[] experience={1,2,3,15};
System.out.println(("Name of employe: "+name+"\nExperience is: "+experience[3]).toUpperCase()); //using string method converted to uppercase laters.
String[] names={"Aditya","Mahesh","Phani"};
System.out.println(names[0]);

System.out.println("\u2023"+name1.concat(name2));//using string method concatination of two strings.
inputName.close();
}
} 