class Demo
{
public static void main(String ...arv)
  {
  double d[] = {10.5,15.3,34.5};
  //meth(d);
  meth(10.2,20.5);
  System.out.println("2nd");
  meth(10.2,50.5,20.5);
  }
static void meth(int a, double...d)
  {
  for(int i=0; i < d.length; i++)
    System.out.println(d[i]);
  }
}