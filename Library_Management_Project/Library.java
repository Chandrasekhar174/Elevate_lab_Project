
import java.util.ArrayList;
import java.util.Scanner;

class Library{
    private static Library instance;
    private ArrayList<Book>books=new ArrayList<>();
    private  ArrayList<User>users=new ArrayList<>();

    private Library(){};
    private  Scanner sc= new Scanner(System.in);

    public static Library getInstance(){
        if(instance==null){
            instance=new Library();
        }
        return instance;
    }

    public void addBook(){
        System.out.println("Enter Book Id = ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book Name = ");
        String name=sc.nextLine();
        System.out.println("Enter author name = ");
        String author=sc.nextLine();
        System.out.println("Enter description = ");
        String desc=sc.nextLine();
        for(int i=0;i<books.size();i++){
            if(books.get(i).getId()==id){
                System.out.println("This book id already there ");
                return;
            }
        }
        Book book=new Book(id,name,author,desc);
        books.add(book);
        System.out.println("Successfully book added");
    }
    public void addUser(){
        System.out.println("Enter User Id = ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name = ");
        String name=sc.nextLine();
        System.out.println("Enter contact = ");
        String contact=sc.nextLine();
        for(int i=0;i<books.size();i++){
            if(users.get(i).getstudentId()==id){
                System.out.println("This user already there");
                return;
            }
        }
        User user=new User(id,name,contact);
        users.add(user);
        System.out.println("Successfully user added");
    }
    public void allBooks(){
        System.out.println("Id\tname\tauthor\tdesc");
        books.forEach(book-> System.out.println(book.toString()));
    }
    public void allUser(){
        System.out.println("Id\tname\tcontact");
        users.forEach(user->System.out.println(user.toString()));
    }

}
