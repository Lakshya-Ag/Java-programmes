//class Day extends Enum
enum Day
{
MON,SUN,TUE;
}

class Demo
{
public static void main(String arv[])
  {
  Day d;
  d = Day.SUN;
  Day d1[] = Day.values();
  for(int i=0;i<d1.length;i++)
    System.out.println(d1[i]);
  }
}