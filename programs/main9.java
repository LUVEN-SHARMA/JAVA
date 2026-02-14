class Student{
    int r;
    String name;
    Student(int r, String name){
        this.r=r;
        this.name=name;
    }
    void show(Student S){
        this.r=S.r;
        this.name=S.name;
    }
    void display(){
        System.out.println("Roll no:"+r);
        System.out.println("Name:"+name);
    }
}

public class main9{
    public static void main(String[] args){
        Student S1=new Student(1, "Luven");
        Student S2=new Student(2, "Rohit");
        S2.show(S1);
        S2.display();
    }
    
}
