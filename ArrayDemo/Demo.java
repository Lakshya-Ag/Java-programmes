class Demo
{
void meth(double b,int...a)
  {
  System.out.println("double = "+b);
  for(int i=0;i<a.length;i++)
    System.out.println(a[i]);
  }
public static void main(String...arv)
  {
  int i[] = {10,20,30};
  //new Demo().meth(i);
  new Demo().meth(10,20);
  new Demo().meth(100,200,300);
  }
}