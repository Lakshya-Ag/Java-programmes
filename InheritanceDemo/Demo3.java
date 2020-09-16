class A
{
private int a =10;
static void m1()
  {
  System.out.println("a = ");
  }
}
class B extends A
{  
static void m1()
  {
  
  System.out.println("M2 - A ");
  }  
}
class Demo
{
public static void main(String arv[])
  {
  A obj = new B();
  obj.m1();
  }
}
