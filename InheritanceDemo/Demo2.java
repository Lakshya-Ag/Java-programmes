class A
{
void meth1()
  {
  System.out.println("M");
  }
}
class B extends A
{
protected void meth1()
  {
  System.out.println("x");
  }
void meth2()
  {
  System.out.println("M2");
  }
public static void main(String arv[])
  {
  A obj = new B();
  obj.meth1();
  obj.meth2();
  }
}