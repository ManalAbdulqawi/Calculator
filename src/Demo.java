import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int a;
        int b;
        int c=calcolerOptions();
        System.out.println( " Enter the first number must be integer ");

        Scanner reader1=new Scanner(System.in);
        a = reader1.nextInt();
        System.out.println( "Enter the second number must be integer ");
        Scanner reader2=new Scanner(System.in);
        b = reader2.nextInt();
        runCaculation( a, b, c);




    }
    public static void runCaculation(int a, int b, int c)
    { if(c==1)
        System.out.println("The answer of sum "+a+" and "+b+" is "+sum(a,b) );
        if(c==2)
            System.out.println("The answer of subtract "+a+" and "+b+" is "+sub(a,b) );
        if(c==3)
            System.out.println("The answer of multiplication "+a+" and "+b+" is "+multiplied(a,b) );
        if(c==4)
            System.out.println("The answer of division "+a+" and "+b+" is "+division(a,b) );}
    public  static int calcolerOptions()
    {

        System.out.println( "1- Add the two numbers ");
        System.out.println( "2- Subtract ");
        System.out.println( "3- Multiplication ");
        System.out.println( "4- Division ");
        System.out.println( " Choose the number of the calculation options:  ");
        Scanner reader1=new Scanner(System.in);
        int a = reader1.nextInt();
return a;

    }
    public static int sum(int a,int b)
    {return a+b;}
    public static int sub(int a,int b)
    {return a-b;}
    public static int multiplied(int a,int b)
    {return a*b;}
    public static double division(int a,int b)
    {return (double)a/b;}
}
