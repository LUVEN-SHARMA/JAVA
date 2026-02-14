public class Student {
    int r;
    String name;
    void getData(){
        r=1;
        name="ABC";
    }
    void diplay(){
        System.out.println(r);
        System.out.println(name);
    }
    public static void main(String[] args){
        Student S1=new Student();
        S1.getData();
        S1.diplay();
    } 
}
