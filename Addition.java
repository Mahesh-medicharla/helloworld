import java.util.*;
public class Addition {
public static void main(String... m1) {
Scanner adding= new Scanner(System.in); //scanner class
System.out.println("Enter first number: "); //user first input
int number1=adding.nextInt();			//storing first integer
System.out.println("Enter second number: ");//user second input
int number2=adding.nextInt();			//storing second integer
String empty=adding.nextLine();
int result1=number1+number2;  //Addition
int result2=number1*number2; //multiplication
/*
System.out.println("enter first string: ");
String name1=adding.nextLine();
System.out.println("Enter second String: ");
String name2=adding.nextLine();
String stringResult=name1+name2; //string concatination using + operator 
*/
System.out.println("enter third string: ");
String name3=adding.nextLine();
System.out.println("Enter fourth String: ");
String name4=adding.nextLine();
String stringResul=name3.concat(name4);
System.out.println("\nString concatination: "+stringResul); //string concatination using predefined method .concat()


System.out.println("\nAddition of number1 and number2 is: \t\\"+result1+"\\"); //printing addition
System.out.println("\nNow multiplication of same numbers is: \t\\"+result2+"\\");//printing mutiplication
//System.out.print("\n\nString concatination is: "+"\""+stringResult+"\"");//printing concatination
}
}

//"+"\""+stringResult+"\""