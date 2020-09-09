import java.util.*;
class Demo
{
public static void main(String arv[])
  {
  TreeSet<Integer> ts =new TreeSet<>();
  ts.add(10);
  ts.add(40);
  ts.add(50);
  ts.add(25);
  ts.add(15);
  
  System.out.println(ts);
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