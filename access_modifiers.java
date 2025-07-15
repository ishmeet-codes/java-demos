import java.util.Scanner;
public class access_modifiers {
    static class MyEmployee{
        private String name;
        private int id;

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

    public static void main(String[] args) {
        MyEmployee ishmeet =new MyEmployee();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ishmeet.setId(n);
        String x = sc.next();
        ishmeet.setName(x);
        System.out.println(ishmeet.getId());
        System.out.println(ishmeet.getName());
    }
}
