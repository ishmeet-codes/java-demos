class MyMainEmployee {
    private String name;
    private int id;

    public MyMainEmployee(){
        id=45;
        name="Rounak";

    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getId() {
        return id;
    }
    public void setId(int i) {
        id = i;
    }

}
public class constructors {
    public static void main(String[] args) {
        MyMainEmployee ish= new MyMainEmployee();
       // ish.setName("ISHMEET SINGH");
        // ish.setId(123);
        System.out.println(ish.getName());
        System.out.println(ish.getId());
    }
}
