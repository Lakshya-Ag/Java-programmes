interface Predicate
{
void meth1();
}
class Demo
{
public static void main(String arv[])
  {
  
  
 
 
 
  Predicate obj = new Predicate() {
                                    public void meth1()
                                      {
                                      System.out.println("Anonymous");
                                      }
                                   };
  obj.meth1();                       
  
  Predicate obj2 = () ->  System.out.println("Lambda");
  obj2.meth1();      
  }
}