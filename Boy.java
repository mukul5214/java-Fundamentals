import java.util.Scanner;
class Boy
{
 public static void main(String[] args)
{
  System.out.println("enter the gender");
  Scanner S= new Scanner(System.in);
  String G= S.next();
  if(G.equals("Male"))
  {
    System.out.println("go left");
  }
  if(G.equals("Female"))
  {
    System.out.println("go right");
  }
  else 
  System.out.println("error");
}
}
