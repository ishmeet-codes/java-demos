public class custom_class {
      static class Employee {
        int id;
        String name;
    }
    public static void main(String[] args) {
         // Instantiating a new Employee Objects
          Employee ishmeet = new Employee();
          Employee john = new Employee();
          // Setting Attributes
         ishmeet.id = 13 ;
         ishmeet.name = "Ishmeet" ;
         john.id = 14;
         john.name = "JohnCena";
         // Printing Attributes
        System.out.println(ishmeet.id);
        System.out.println(ishmeet.name);
        System.out.println(john.id);
        System.out.println(john.name);
    }
}
