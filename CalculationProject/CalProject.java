
import  java.util.*;

class Cal{
    public static void fun(){
        while(true){
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multipliction");
            System.out.println("4 Division");
            System.out.println("5 Exit\n");
            System.out.println("which functionality you want");
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            if(n==5){
                return;
            }
            switch(n){
                case 1:
                    sum();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;
                default:
                    System.out.println("Please enter valid number");
                    break;
            }

        }
    }
    public static void mul(){
        Scanner sc= new Scanner(System.in);
        System.out.println("How many number you want enter");
        int n=sc.nextInt();
        int m=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            m*=x;
        }
        System.out.println("Sum of numbers are " +m);
    }
    public static void div(){
         Scanner sc= new Scanner(System.in);
        System.out.print("Please enter two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y==0){
            System.err.println("Zero is not divisible");
        }
        else{
            System.out.println("Divisible of two number is "+ (x/(y)));
        }
        
    }
    public static void sub(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Subtraction of two number is "+ (x-y));
    }
   public static void sum(){
    Scanner sc= new Scanner(System.in);
    System.out.print("How many number you want enter");
    int n=sc.nextInt();
    int add=0;
    for(int i=0;i<n;i++){
        int x=sc.nextInt();
        add+=x;
    }
    System.out.println("Sum of numbers are " +add);
   }
    public static void main(String args[]){

        System.out.println("Welcome to Calculation App");
        fun();

    }

}