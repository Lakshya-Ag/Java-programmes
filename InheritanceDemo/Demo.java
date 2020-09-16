class A
{
int x = 10;
A()
  {
  System.out.println("A 1");
  }
void meth1()
  {
  System.out.println("M - A");
  }
}
class B extends A
{
int x = 20;
B()
  {
 
  System.out.println("x = "+super.x);
  }
public static void main(String arv[])
  {
  B obj = new B();
  obj.meth1();
  }
}