class Demo
{
public static void main(String arv[])
  {
  StringBuilder sb = new StringBuilder("Hello");
  int c = sb.capacity();
  System.out.println("Capacity = "+c);
  System.out.println("STring 2 = "+sb.insert(2,"X1234567891234568"));
  System.out.println("Capacity = "+sb.capacity());
  } 
}