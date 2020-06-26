import java.util.Scanner;
public class switch_case
{
  public static void main(String[] args)
  {
    int choice;
    System.out.println("pick one: 1. Hi\t. Hey\t. Hello\t");
    Scanner s=new Scanner(System.in);
    choice=s.nextInt();
    switch(choice)
    {
      case 1: System.out.println("You said Hi");
              break;
      case 2: System.out.println("You said Hey");
              break;
      case 3: System.out.println("You said Hello");
              break;
      default: System.out.println("Invalid");
    }
  }
}
