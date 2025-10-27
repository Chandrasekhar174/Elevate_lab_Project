
import java.util.Scanner;

class main{
    public static void main(String[] args) {

        Library library=Library.getInstance();

        while(true){
            System.out.println("\nWelcome to Library Management App");
            System.out.println("1. Add Book \t 2.Add User");
            System.out.println("3. All Books \t 4. All Users");
            System.out.println("5.Borrow Book \t 6.Return Book");
            System.out.println("7.User borrowed books \t 0.Exit ");
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            if(n==0){
                System.exit(0);
            }
            switch (n) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.addUser();
                    break;
                case 3:
                    library.allBooks();
                    break;
                case 4:
                    library.allUser();
                    break;
                default:
                    System.err.println("Please Enter correct number");
                    break;
            }
        }
    }
}