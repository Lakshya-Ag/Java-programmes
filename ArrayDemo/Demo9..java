import java.util.*;
class Demo
{
public static void main(String arv[])
  {
  ArrayList<Demo2> arr = new ArrayList<>();
  
  arr.add(new Demo2("B"));
 arr.add(new Demo2("A"));
 arr.add(new Demo2("C"));
  System.out.println(arr);
  }
}
class Demo2
{
String s;
Demo2(String t)
  {
  s = t;
  }
public String toString()
  {
  return s;
  }
}














