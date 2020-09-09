import java.util.*;
class Demo 
{
public static void main(String arv[])
  {
  TreeSet<Student> ts = new TreeSet<>(new Demo2());
  ts.add(new Student("A", 5));
  ts.add(new Student("B", 10));
  ts.add(new Student("C", 7));
  
  for(Student s: ts)
  System.out.println("Treeset = "+s.name);    
  }
}
class Student
{
String name;
int rollNo;
Student(String n, int r)
  {
  name = n;
  rollNo = r;
  }
}
class Demo2 implements Comparator<Student>
{
public int compare(Student s1,Student s2)
  {
  if(s1.rollNo < s2.rollNo)
    return -1;
  else if(s1.rollNo > s2.rollNo)
    return 1;
  else
    return 0;
  }
}
