import java.util.*;
class Demo
{
public static void main(String arv[])
  {
  int count = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter String");
  String s = sc.nextLine();
  System.out.println("Enter character");
  char  c = sc.nextLine().charAt(0);
  for(int i =0;i<s.length();i++)
    if(s.charAt(i)==c)
      count++;
  System.out.println("Number of occurence of "+c+" is = "+count);
  } 
}