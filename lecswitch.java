import java.util.Scanner;
public class lecswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1;
        System.out.print("Enter age :-");
        age1 = sc.nextInt();
        switch(age1) {
            case 18:
                System.out.println("You are going to become adult");
                break;
                case 21:
                System.out.println("You are going to join job");
                break;
                case 50:
                System.out.println("You are going to retire");
                break;
                default:
                System.out.println("Enjoy life");
        }
    }
}
