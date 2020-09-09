import java.util.*;
class Demo 
{
public static void main(String arv[])
  {
  ArrayList<Integer> arr = new ArrayList<>();
  arr.add(10);
  arr.add(20);
  arr.add(30);
  arr.add(25);
  System.out.println("List1 = "+ arr);
  
  ArrayList<Integer> arr2 = new ArrayList<>();
  arr2.add(5);
  arr2.add(17);
  
  arr.addAll(1,arr2);
  
    System.out.println("List1 = "+arr);
    System.out.println("List2 = "+arr2);
   Iterator it = arr.iterator();
  while(it.hasNext())
    {
    Integer i = (Integer)it.next();
    System.out.println(i);
    }
  

  }
}
