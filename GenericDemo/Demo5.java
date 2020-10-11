class Gen<T>
{
T obj;
Gen(T o)
  {
  obj = o;
  }
T getObj()
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
  Gen<String> obj1 = new Gen<String>("Demo1");
  String s = obj1.getObj();
  System.out.println(s);
  obj1.show();
  
  Integer i1 = new Integer(10);
  Gen<Integer> obj2 = new Gen<>(i1);
  obj2 = obj1;
  int a = obj2.getObj();
  System.out.println(a);
  obj2.show();
  }
}









