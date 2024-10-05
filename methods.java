public class methods {
     //int logic(int x, int y) {
        //int z;
        //if (x > y) {
        //    z = x * y;
      //  } else {
       //     z = (x + y) * 5;
      //  }
        //return z;
   // }
    static void foo(){
        System.out.println("Good morning bro");
    }
    static void foo(int a){
        System.out.println("good morning "+a+" bro");
    }
     static int logic(int x, int y) {
         int z;
         if (x > y) {
             z = x * y;
         } else {
             z = (x + y) * 5;
         }
         return z;
     }

    public static void main(String[] args) {
        int a;
        // methods obj = new methods();
        // a = obj.logic(3, 5);
        a = logic(3, 5);
        System.out.println(a);

        // method overloading
        foo();
        foo(2006);
    }
}
