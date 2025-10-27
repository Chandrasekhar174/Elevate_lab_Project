



class User{
    private int studentId;
    private  String name;
    private String contact;
    public User(int id,String name,String contact){
        this.studentId=id;
        this.name=name;
        this.contact=contact;
    }
    public int getstudentId(){
        return this.studentId;
    }
    public String toString(){
        return this.studentId+"\t"+this.name+"\t"+this.contact;
    }
}