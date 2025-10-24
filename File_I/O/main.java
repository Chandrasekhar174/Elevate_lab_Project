
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

class file{
    public static void main(String[] args) {
        String st="Hello java developer";
        try {
            FileWriter fw=new FileWriter("demo.txt");
            fw.write(st);
            fw.close();
            FileReader fd=new FileReader("demo.txt");
            BufferedReader br=new BufferedReader(fd);
            String message;
            while((message=br.readLine())!=null){
                System.out.print(message);
            }
            br.close();
            fd.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}