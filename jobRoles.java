import java.util.*;
public class jobRoles {
	
public static void main(String args[]) {
Scanner inputName=new Scanner(System.in);
System.out.println("Enter person name: ");
String name=inputName.nextLine();
if(name.equalsIgnoreCase"Aditya") {
System.out.println("Aditya- Architecture\nHaving 15 years experience.");
} else if (name.equalsIgnoreCase("Mahesh")){
	System.out.println("Mahesh-Java Developer\nHaving 3 months experience.");
}
 else if (name.equalsIgnoreCase("Ravi")){
	System.out.println("Ravi-Java Developer\nHaving  3 months experience.");
}
 else if (name.equalsIgnoreCase("Vinothini")){
	System.out.println("Vinothini-Java Developer\nHaving  3 months experience.");
}
 else if (name.equalsIgnoreCase("Thangamani")){
	System.out.println("Thangamani-Java Developer\nHaving  3 months experience.");
}
 else if (name.equalsIgnoreCase("Yamani")){
	System.out.println("Yamini-Java Developer\nHaving  3 months experience.");
}
 else if (name.equalsIgnoreCase("Leela")){
	System.out.println("Leela-Java Developer\nHaving  3 months experience.");
}
else {
	System.out.println("Enter valid name.");
}
inputName.close();
}
}