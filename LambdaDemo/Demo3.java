@FunctionalInterface
interface D
{
void test(int a);
}
class Demo
{
public static void main(String arv[])
  {
  D obj = new D(){
                  public void test()
                    {
                    System.out.println("Anonymous");
                    }
                  };
  obj.test();
  
  D obj2 =  i -> System.out.println("Lambda");
  obj2.test();
  }
}