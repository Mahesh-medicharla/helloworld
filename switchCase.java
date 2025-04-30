import java.util.*;
public class switchCase {
	
public static void main(String args[]) {
Scanner inputName=new Scanner(System.in);
System.out.println("Enter person name: ");
String name=inputName.nextLine().toLowerCase();
switch(name) {
case "aditya":
System.out.println("Aditya- Architecture\nHaving 15 years experience.");
break;
case "mahesh":
System.out.println("Mahesh-Java Developer\nHaving 3 months experience.");
break;
case "vinothini":
System.out.println("Vinothini-Java Developer\nHaving  3 months experience.");
break;
case "ravi":
System.out.println("Ravi-Java Developer\nHaving  3 months experience.");
break;
case "leela":
System.out.println("Leela-Java Developer\nHaving  3 months experience.");
break;
case "thangamani":
System.out.println("Thangamani-Java Developer\nHaving  3 months experience.");

case "yamini":
System.out.println("Yamini-Java Developer\nHaving  3 months experience.");


default:
System.out.println("Enter a valid name:");
}
inputName.close();
}
}