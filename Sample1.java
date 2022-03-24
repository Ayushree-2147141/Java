class JavaExample
{
static int var1 = 77;//will reflect the last value 
String var2;

public static void main(String args[])
{

JavaExample ob1 = new JavaExample();
JavaExample ob2 = new JavaExample();

ob1.var1 = 88;

ob1.var2 = "I am object1";

ob2.var1 = 99;

ob2.var2 = "I ma object2";
;'
System.out.println("ob1 integer: "+ob1.var1);

System.out.println("ob1 string: "+ob1.var2);

System.out.println("ob2 integer: "+ob2.var1);

System.out.println("ob1 string: "+ob2.var2);

}
}
