// class Test {
//     int sum = 0;
//     int add(int x, int y)
//     {
//         sum = x+y;
//         return sum;
//     }
// }

// public class AnonymousObject {
//     public static void main(String[] args)
//     {
//         System.out.println(new Test().add(5,3));
//     }
// }

class Add{
    int sum, num1, num2;
    Add(int x, int y)
    {
        this.num1 = x;
        this.num2 = y;

        sum = num1 + num2;

        System.out.println("Sum of "+x+" and "+y+" is "+sum);
    }

    void addition(int x, int y)
    {
        this.num1 = x;
        this.num2 = y;

        sum = num1 + num2;

        System.out.println("Sum of "+x+" and "+y+" is "+sum);

    }
}


class AnonymousObject
{
    public static void main(String[] args)
    {
        new Add(4,6).addition(7,3);
    }
}