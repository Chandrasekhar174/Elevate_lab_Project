
import java.util.Scanner;


public class main{
    public static void main(String[] args) {
        Student st= new Student();
        while(true){
            System.out.println("\nWelcome Student Management App");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            if(n==5){
                System.exit(0);
            }
            switch(n){
                case 1:
                    System.out.print("Enter id = ");
                    int id=sc.nextInt();
                    System.out.print("Enter name = ");
                    String name=sc.next();
                    System.out.print("Enter mark = ");
                    int mark=sc.nextInt();
                    st.add(id, name, mark);
                    break;
                case 2:
                    st.view();
                    break;
                case 3:
                    System.out.print("Enter Id = ");
                    int num=sc.nextInt();
                    st.update(num);
                    break;
                case 4:
                    System.out.print("Enter id = ");
                    int d=sc.nextInt();
                    st.delete(d);
                    break;
                default:
                    System.out.print("Please enter valid number");
                    break; 
            }
        }
    }
}