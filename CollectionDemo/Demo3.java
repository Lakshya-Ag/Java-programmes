import java.util.*;
class Demo
{
public static void main(String arv[])
  {
  TreeSet<Student> ts =new TreeSet<>();
  ts.add(new Student("A", 15));
  ts.add(new Student("B", 25));
  ts.add(new Student("C", 5));
  for(Student s: ts)
    System.out.println(s.Name);
  }
}

class Student implements Comparable<Student>
{
String Name;
int id;
Student (String name, int i)
  {
  Name =name;
  id = i;
  }
public int compareTo(Student obj2)
  {
  if(this.id < obj2.id)
    return -1;
  else if(this.id > obj2.id)
    return 1;
  else 
    return 0;
  }
}