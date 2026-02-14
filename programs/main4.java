class Student{
    int r=10;
    static String name="Luven";
    static void show(){
        System.out.println(name);
    }
}



public class main4 {
    public static void main(String[] args){
        Student S1=new Student();
        System.out.println(S1.r);
        System.out.println(Student.name);
        Student.show();
    }
    
}
