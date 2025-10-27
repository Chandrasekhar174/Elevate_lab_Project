

class Book{
    private int bookId;
    private String bookName;
    private String author;
    private String desciptition;

    public Book(int id,String name,String author,String desc){
        this.bookId=id;
        this.bookName=name;
        this.author=author;
        this.desciptition=desc;

    }
    public Book(int id,String name,String author){
        this(id, name, author,"");
    }
    public int getId(){
        return this.bookId;
    }
    public String toString(){
        return this.bookId+"\t"+this.bookName+"\t"+this.author+"\t"+this.desciptition;
    }
}