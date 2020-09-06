class Demo
{
public static void main(String arv[])
  {
  double d1[] = {10.2,15.3,16.4,20.5};
  
  int i[] = doubleToInt(d1);
  
  
  
  for(int j=0; j< i.length; j++)
    System.out.println(i[j]);
  }
public static int [] doubleToInt(double d[])
  {
  int []i1 = new int[d.length];
  for(int j=0; j<i1.length;j++)
    i1[j] = (int)d[j];
  return i1;
  }
}

