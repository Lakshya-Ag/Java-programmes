@FunctionalInterface
interface D
{
void test();
//void test2();
String toString();
}

class Demo
{
public static void main(String arv[])
  {
  D obj =  new D(){
                   public void test()
                    {
                    System.out.println("Anonymous");
                    }
                  };
  obj.test();
  
  D obj2 = () ->{System.out.println("Lambda");};
  obj2.test();
  System.out.println(obj2.toString());
  }
}