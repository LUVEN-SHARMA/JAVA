class student{
    int r;
    String name;
    static String college = "ABES";
    static int count =0;
    void getdata(int r, String name){
        this.r=r;
        this.name=name;
        count++;
    }
    void display(){
        System.out.println(r);
        System.out.println(name);
        System.out.println(college);
        System.out.println(count);
    }

}
public class Main2 {
    public static void main(String[] args){
        student S = new student();
        S.getdata(1, "Luven");
        System.out.println(student.count);
        System.out.println(student.college);
        S.display();


    
}
}
