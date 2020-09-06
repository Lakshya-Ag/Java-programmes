import java.util.*;
class Demo
{
public static void main(String arv[])
  {
  ArrayList<Student> arr = new ArrayList<>();
  Student st;
  int n;
  while(true)
  {
  System.out.println("Press\n1. Enter\n2. Display\n3. Exit");
  n = Student.sc.nextInt();
  switch(n)
    {
    case 2: 
      for(Student s: arr)
        System.out.println(s);
      break;
    case 1: 
      st = new Student();
      arr.add(st);
      break;
    case 3:
      System.exit(0);
    default:
      System.out.println("Wrong input");
    }
  }
  }
}

class Student 
{
String name, city;
static Scanner sc = new Scanner(System.in);
Student()
  {
  System.out.println("Enter Name");
  sc.nextLine();
  name = sc.nextLine();
  System.out.println("Enter City");
  city = sc.nextLine();
  }
public String toString()
  {
  return "Name = "+name+" City = "+city;
  }
}




