//store marks of three subject find grade
import java.util.Scanner;
class grade
{
    public static void main (String args[])
    {
        int f,s,t,g,p;
        Scanner sc = new Scanner(System.in);
    System.out.println("enter first subject marks");
    f=sc.nextInt();

    System.out.println("enter second subject marks");
    s=sc.nextInt();

    System.out.println("enter third subject marks");
    t=sc.nextInt();

    System.out.println("subject grade stored");

     g=f+s+t;
     System.out.println("total marks are " +g);
     p=g/300;
        if (p>=90) 
        {
        System.out.println("you got grade a");
    }
        if (p<=90 && p>80)
         {
        System.out.println("you got grade b");
    
    
    }
    if (p<=80 && p>65)
         {
        System.out.println("you got grade c");
         }
         if (p<=65 && p>40)
         {
        System.out.println("you got grade d");
         }
        else 
         {
        System.out.println("you are fail ");
        System.out.println("thanks for checking your grades ");
    }
    }
}