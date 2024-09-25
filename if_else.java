public class if_else {
    public static void main(String[] args) {
        int age = 9;
        int mark1 =73;
        System.out.println("------If Else ------");
        if(age>19 && age<=25){
            System.out.println("Yes,You can drive");
        }
        else {
            System.out.println("No, You can not drive");
        }

        System.out.println("------Else If ------");
        if(mark1 <27){
            System.out.println("You are fail");
        } else if (mark1 >= 27 && mark1 < 35 ) {
            System.out.println("You got E");
        } else if (mark1 >= 35 && mark1 < 70 ) {
            System.out.println("You got D");
        } else if (mark1 >= 70 && mark1 < 80 ) {
            System.out.println("You got C");
        } else if (mark1 >= 80 && mark1 < 90 ) {
            System.out.println("You got B");
        } else if (mark1 >= 90  ) {
            System.out.println("You got A");
        }

    }
}

