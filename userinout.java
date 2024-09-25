import java.util.Scanner;
public class userinout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject 1 :- ");
        float m1 = sc.nextFloat();
        System.out.print("Enter marks of subject 2 :- ");
        float m2 = sc.nextFloat();
        System.out.print("Enter marks of subject 3 :- ");
        float m3 = sc.nextFloat();
        System.out.print("Enter marks of subject 4 :- ");
        float m4 = sc.nextFloat();
        System.out.print("Enter marks of subject 5 :- ");
        float m5 = sc.nextFloat();
        float total = (m1+m2+m3+m4+m5)/5;
        System.out.print("Total percentage is :- ");
        System.out.println(total);


    }
}
