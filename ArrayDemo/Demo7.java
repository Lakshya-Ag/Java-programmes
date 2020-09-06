import java.util.*;
class Demo
{
public static void main(String arv[])
  {
  ArrayList arr = new ArrayList();
  arr.add("K17CR");
  arr.add(25.5);
  arr.add(new Demo2("A"));
  arr.add(new Demo2("B"));
  System.out.println("ArrayList = "+arr.toString());
  }
}
class Demo2
{
String n;
Demo2(String m)
  {
  n = m;
  }
public String toString()
  {
  return n;
  }
}





