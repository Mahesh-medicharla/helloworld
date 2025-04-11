public class premitiveDataTypes {
public static void main(String args[]) {
	/*In java data types specify the type of data that a variable can hold.
	------->we have two types
	
	1.Premitive -->(8 types)-byte(1byte), short(2bytes), int(4bytes), long(8bytes), float(4bytes), double(8bytes), char(2bytes), boolean(1byte).
	--> Every premitive data type has certain size and range.
	
	2.Non-premitive -->(user defined,stores addresses to memory locations)string,array,class and objects.
	*/
	
//Integral types
byte by=10;
short s=1000;
int i=1000000;
long l=123456789L;

//Floating point types
float f=23.0f;
double d=228.01;

//character type
char ch='m';

//Boolean type
boolean b=true;
System.out.println("byte: "+by);
System.out.println("short: "+s);
System.out.println("int: "+i);
System.out.println("long: "+l);
System.out.println("float: "+f);
System.out.println("double: "+d);
System.out.println("char: "+ch);
System.out.println("boolean: "+b);
}
}