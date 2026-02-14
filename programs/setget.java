class Demo2{
    private int r;
    public void setR(int r){
        this.r=r;
    }
    public int getR(){
        return r;
    }
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}


public class setget {
    public static void main(String[] args) {
        Demo2 D = new Demo2();
        D.setR(10);
        D.setName("Luven");
        System.out.println(D.getR());
        System.out.println(D.getName());
    }
    
}
