import java.util.*;
class Demo 
{
public static void main(String arv[])
  {
  HashMap<String, Integer> mp = new HashMap<>();
  mp.put("A",10);
  mp.put("B",10);
  mp.put("A",20);
  mp.put("C",40);
  mp.put("D",15);
  System.out.println(mp);      
  Set<Map.Entry<String,Integer>> s = mp.entrySet();
  Iterator<Map.Entry<String,Integer>> it = s.iterator();
  
  while(it.hasNext())
    {
    Map.Entry<String,Integer> e1 = it.next();
   
    System.out.println("Key = "+e1.getKey());
    System.out.println("Value = "+e1.getValue());

    }
  }
}
