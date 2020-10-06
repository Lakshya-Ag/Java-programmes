class Gen<T extends Number>
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
  System.out.println("Name = "+obj.getClass());
  }
}
class Demo
{
public static void main(String arv[])
  {
  Integer i = new Integer(10);
  String s = "Demo";
  
  Gen<Integer> obj1 = new Gen<Integer>(i);
  int i2 = obj1.getObj();
  System.out.println("i = "+i2);
  obj1.show(); 
  
  Gen<String> obj2 = new Gen<>(s);
  obj2 = obj1;
  String s2 = obj2.getObj();
  System.out.println("s = "+s2);
  obj2.show();
  
  }
}











