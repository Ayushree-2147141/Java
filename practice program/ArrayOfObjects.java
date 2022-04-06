import java.util.*;

public class ArrayOfObjects {
    public static void main(String args[])
    {
        int n , i, sid;
        String sname;
        //creating array of object for student class
        Student arr[] = new Student[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the number of students: ");
        n = sc.nextInt();

        System.out.println("\nEnter details");
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter name : ");
            sc.nextLine();
            sname = sc.nextLine();

            System.out.println("\nEnter id: ");
            sid = sc.nextInt();

            //constructor calling and passing values from
            arr[i] = new Student(sname, sid);
        }

        System.out.println("\nDo you want to display the table? (1/0)");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            for(i=0;i<n;i++)
            {
                arr[i].display();
            }
        }
        else
        {
            System.out.println("Nothing to display!");
        }

    }
}


class Student
{
String studentName;
int studentId;

Student(String name, int id)
{
    this.studentName = name;
    this.studentId = id;
}

void display()
{
    System.out.println(studentName+"\t"+studentId+"\n");
}
}