class Gen<T>
{
T obj;
Gen(T ob)
  {
  obj = ob;
  }
T getObj()
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
  Integer i = new Integer(100);
  String s = "Demo";
  Gen obj = new Gen(i);
  Gen<String> obj2 = new Gen<>(s);
  obj = obj2 ;
  int i2 = obj.getObj();
  String s2 = obj2.getObj();
  System.out.println(" obj = "+ i2);
  System.out.println(" obj2 = "+ s2);
  obj.show();
  obj2.show();
  }
}






