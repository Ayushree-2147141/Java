class Polygon
{
    void display()
    {
        System.out.println("This is polygon class!");
    }
}

class Demo
{
    void createAnonymousClass()
    {
        //object creation
        Polygon poly = new Polygon()
        {
            void display()
            {
                System.out.println("This is anonymous class!");
            }
        };
        poly.display();
        //poly.displayme();
    }
}



class AnonymousClassDemo
{
    public static void main(String[] args)
    {
        //creating object for anonymous Class
        Demo d = new Demo();
        d.createAnonymousClass();

    }
}