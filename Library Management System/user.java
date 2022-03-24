class User
{
	public void display()
{
	System.out.println("User class");
}

class Staff extends User
{
public void display()
{
	System.out.println("Staff class");
}
}

class Student extends User
{
public void display()
{
	System.out.println("Student class");
}
}

class Librarian extends User
{
public void display()
{
	System.out.println("Librarian class");
}
}


public static void main(String args[])
{
User obj = new User();
obj.display();
}
}