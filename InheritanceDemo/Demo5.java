class A
{
void m1()
  {
  System.out.println("M1");
  }
}
class B extends A
{
void m2()
  {
  System.out.println("M3");
  }
}
class Demo 
{
public static void main(String arv[])
  {
  A obj = new B();
  if(obj instanceof B)
    {
    B obj2 = (B)obj;
    obj2.m2();
    }
  else
    System.out.println("Wrong type");
  }
}






