//deliverycost of parsal weight and distance
import java.util.Scanner;
class deliverycost
{
    public static void main (String args[])
    {
        int w,d;
        Scanner sc = new Scanner(System.in);
    System.out.println("enter weight ");
    w=sc.nextInt();
    System.out.println("enter distance ");
    d=sc.nextInt();

    System.out.println("weight stored and distance stored in the system");

     
        if (w<=6 && d>=100) 
        {
        System.out.println("your cost  will be  1.20 per km ");
    }
    if (w<=6 && d>=300) 
    {
    System.out.println("your cost  will be  1.80 per km ");
}
if (w<=6 && d<=300) 
{
System.out.println("your cost  will be  2.50 per km ");
}      
if (w<=30 && d<=200) 
{
System.out.println("your cost  will be  2.20 per km ");
}    
if (w<=2-30 && d<=200) 
{
System.out.println("your cost  will be  2.50 per km ");
}    
if (w<30) 
{
System.out.println("your cost will be 4.50 per km  ");
}    
 else 
         {
        System.out.println("sorry could't make  deliver   ");
       
    }
    System.out.println("thanks for checking your cost ");
    }
}