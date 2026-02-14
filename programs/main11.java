// copy constructor
class Copy{
    int id;
    String name;
    Copy(int id, String name){
        this.id=id;
        this.name=name;
    }
    Copy(Copy c){
        this.id=c.id;
        this.name=c.name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
public class main11 {
    public static void main(String[] args){
        Copy c1=new Copy(1,"Luven");
        Copy c2=new Copy(c1);
        c1.display();
        c2.display();
}
}