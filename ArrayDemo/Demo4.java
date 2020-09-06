class Demo
{
public static void main(String  arv[])
  { 
  int a[] = new int[5];
  for(int  i=0;  i <5 ;  i++)
      {     
      a[i] = i+1;     
      }
  int b[] = a.clone();
  a[2] = 20 ; 
  for(int i=0; i<5; i++)
      System.out.println(a[i]);
  }}
