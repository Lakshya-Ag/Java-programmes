import java.util.*;
class Demo
{
public static void main(String arv[])
  {
  ArrayList  arr = new ArrayList();
  arr.add(100);
  arr.add(10.5);
  
  ArrayList arr2 = new ArrayList();
  arr2.add("A");
  arr2.add("B");
  
  arr.add(arr2);

  for(Object obj:arr)
    System.out.println(obj);
  
  }
}


