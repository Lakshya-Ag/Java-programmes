import java.util.*;
class Demo
{
public static void main(String arv[])
  {
  ArrayList<String> arr = new ArrayList<>();
  arr.add("A");
  arr.add("C");
  arr.add("F");
  arr.add("B");
  //System.out.println(arr );
  
  ArrayList arr2 = new ArrayList();
  arr2.add("X");
  arr2.add("Y");
  arr2.addAll(arr);
  Iterator it = arr2.iterator();
  while(it.hasNext())
    System.out.println(it.next());
  }
}