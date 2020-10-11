class Gen<T extends Number>
{
T arr[];
Gen(T []a)
  {
  arr = a;
  }
double average()
  {
  double sum = 0.0;
  for(int i=0; i< arr.length;i++)
    sum = sum + arr[i].doubleValue();
  return sum/arr.length;
  }
boolean sameAvg(Gen <?> ob2)
  {
  if(this.average()==ob2.average())
    return true;
  else 
    return false;
  }
}
class Demo
{
public static void main(String arv[])
  {
  Integer i1[] = {new Integer(1),new Integer(2),new Integer(3)};
  Gen<Integer> ob1 = new Gen<>(i1);
  double avg = ob1.average();
  System.out.println("ob1 = "+avg);
  
  Double d1[] = {new Double(1.0),new Double(2.0),new Double(3.0)};
  Gen<Double> ob2 = new Gen<>(d1);
  System.out.println(ob1.sameAvg(ob2));
  }
}




