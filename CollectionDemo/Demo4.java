import java.util.*;
class Demo implements Comparator<Student>
{
public int compare(Student obj1,Student obj2)
  {
  if(obj1.id < obj2.id)
    return -1;
  else if(obj1.id > obj2.id)
    return 1;
  else 
    return 0;
  }
public static void main(String arv[])
{
  TreeSet<Student> ts =new TreeSet<>(new Demo());
  ts.add(new Student("A", 15));
  ts.add(new Student("B", 25));
  ts.add(new Student("C", 5));
  for(Student s: ts)
    System.out.println(s.Name);
  }
}
class Student 
{
String Name;
int id;
Student (String name, int i)
  {
  Name =name;
  id = i;
  }
}