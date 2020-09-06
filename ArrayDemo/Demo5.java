class Demo
{
public static void main(String arv[])
  {
  double d[] = {10.5,15.3,34.5};
  
  int i[] = doubleToInt(d);
  
  for(int j=0;j< i.length; j++)
    System.out.println(i[j]);
  }
public static int [] doubleToInt(double d[])
  {
  int it[] = new int[d.length];
  for(int i=0; i< it.length; i++)
    it[i] = (int)d[i];
  
  return it;
  }
}