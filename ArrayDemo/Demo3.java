import java.util.*;
class Demo
{
public static void main(String arv[])
  {
  ArrayList arr = new ArrayList<DemoArray>();
  
  arr.add(new DemoArray("K"));
  arr.add(new DemoArray("L"));

  ArrayList arr2 = new ArrayList<DemoArray>();
  arr2.add(new DemoArray("M"));
  
  arr2.addAll(arr);
  
  System.out.println("ArrayList = "+arr2);
  }
}

class DemoArray
{
String name;
DemoArray(String name)
  {
  this.name = name;
  }
public String toString()
  {
  return name;
  }
}