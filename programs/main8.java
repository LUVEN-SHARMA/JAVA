class Student{
    int r;
    String name;
    Student(){
        r= 0;
        name = "Null";
    }
    Student (int r, String name){
        this.r=r;
        this.name=name;
    }
    void display(){
        System.out.println(r);
        System.out.println(name);
    }
}


public class main8 {
    public static void main(String[] args){
        Student S1=new Student();
        S1.display();
        Student S2=new Student(10, "Luven");
        S2.display();
    }
    
}
