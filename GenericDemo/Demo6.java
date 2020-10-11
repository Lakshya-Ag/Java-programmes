class Gen
{
Object obj;
Gen(Object o)
  {
  obj = o;
  }
Object getObj()
  {
  return obj;
  }
void show()
  {
  System.out.println("ClassName = "+obj.getClass());
  }
}
class Demo
{
public static void main(String arv[])
  {
  Gen obj1 = new Gen("Demo1");
  String s = (String)obj1.getObj();
  System.out.println(s);
  obj1.show();
  
  Integer i1 = new Integer(10);
  Gen obj2 = new Gen(i1);
  obj2 = obj1;
  int a = (Integer)obj2.getObj();
  System.out.println(a);
  obj2.show();
  }
}









