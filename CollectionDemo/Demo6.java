import java.util.*;
class Demo 
{
public static void main(String arv[])
  {
  Deque<Integer> dq = new LinkedList<Integer>();
  dq.addFirst(10);
  dq.addFirst(20);
  dq.addLast(30);
  
  System.out.println("Dequeue = "+dq);
     
  }
}
