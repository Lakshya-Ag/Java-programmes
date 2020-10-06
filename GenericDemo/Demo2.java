class Gen
{
Object obj;
Gen(Object ob)
  {
  obj = ob;
  }
Object getObj()
  {
  return obj;
  }
void show()
  {
  System.out.println("CLass = "+obj.getClass());
  }
}
class Demo
{
public static void main(String arv[])
  {
  Integer i = new Integer(10);
  String s = "Demo";
  
  Gen obj1 = new Gen(i);
  int i2 = (Integer)obj1.getObj();
  System.out.println("i = "+i2);
  obj1.show(); 
  
  Gen obj2 = new Gen(s);
  obj2 = obj1;
  String s2 = (String)obj2.getObj();
  System.out.println("s = "+s2);
  obj2.show();
  }
}






