class DemoSingle
{
private DemoSingle obj = new DemoSingle();
private DemoSingle()
  {
  }
public static DemoSingle meth()
  {
  return obj;
  }
void meth2()
  {
  System.out.println("Meth2");
  }
}
class Demo
{
public static void main(String arv[])
  {
  DemoSingle obj = DemoSingle.meth();
   
  obj.meth2();
   
  }
}