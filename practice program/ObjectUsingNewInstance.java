class demo {
    void display()
    {
        System.out.println("This is object using newInstance()");
    }
}

class ObjectUsingNewInstance
{
public static void main(String[] args)
{
    try
    {
        Class c = Class.forName("demo");
        obj = c.newInstance();
        obj.display();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
