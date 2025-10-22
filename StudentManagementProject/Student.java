
import java.util.ArrayList;
import java.util.Scanner;

public class Student{
    private  int id;
    private  String student_name;
    private  int mark;
    ArrayList<Student> ar=new ArrayList();
    public void add(int id,String name,int mark){
        Student s=new Student();
        for(int i=0;i<ar.size();i++){
            if(ar.get(i).id==id){
                System.out.println("\nThis Student "+id+" already there");
                return;
            }
        }
        s.id=id;
        s.student_name=name;
        s.mark=mark;
        ar.add(s);
        System.out.println("\nStudent added Sucessfully");
    }
    public void view(){
        System.out.println("\nId\tnames\tmarks");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i).id+"\t"+ar.get(i).student_name+"\t"+ar.get(i).mark);
        }
    }
    public void update(int id){
        boolean u=false;
        for(int i=0;i<ar.size();i++){
            if(ar.get(i).id==id){
                Scanner sc= new Scanner(System.in);
                System.out.println("Plase choose what you want update");
                System.out.println("1. Name");
                System.out.println("2. Mark");
                int n=sc.nextInt();
                switch(n){
                    case 1:
                        System.out.print("Enter new name = ");
                        String updateName=sc.next();
                        this.id=ar.get(i).id;
                        this.mark=ar.get(i).mark;
                        this.student_name=updateName;
                        ar.set(i, this);
                        u=true;
                        break;
                    case 2:
                        System.out.print("Enter new mark = ");
                        int updateMark=sc.nextInt();
                        this.mark=updateMark;
                        this.id=ar.get(i).id;
                        this.student_name=ar.get(i).student_name;
                        ar.set(i, this);
                        u=true;
                        break;
                    default:
                        System.out.print("\nPlease Enter valid number");
                        break;
                }
            }
        }
        if(u){
            System.out.print("\nUpdate sucessfully");
        }
    }
    public void  delete(int id){
        boolean r=false;
        for(int i=0;i<ar.size();i++){
            if(ar.get(i).id==id){
                ar.remove(i);
                r=true;
            }
        }
        if(r){
            System.out.println("Deleted Sucessfully");
        }
        else{
            System.out.println("Please Try again with valid Id number");
        }
    }
}