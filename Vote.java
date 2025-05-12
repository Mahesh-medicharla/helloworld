import java.util.*;
public class Vote{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age: ");
int age=sc.nextInt();
if(age<18){
System.out.println("Your are not elgible for voting...");
}
else if(age>=18){
System.out.println("Your elgible for vote! Now you can caste your vote.");
}
else {
System.out.println("For more informatiom visit gov site...");
}
}
}