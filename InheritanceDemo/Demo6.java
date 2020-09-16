enum Day
{
SUN,MON,TUE;
}
class Demo
{
public static void main(String arv[])
  {
  Day d[] = Day.values();
  for(Day d1:d)
    System.out.println(d1);
  }
}