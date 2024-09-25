public class string {
    public static void main(String[] args) {
        String name = new String("Ishmeet");
        System.out.println(name);
        String nam1 = "rounak";
        System.out.println(nam1);
        // .length () function
        int a= nam1.length();
        System.out.println(a);
        // .toLowerCase () function
        String b= name.toLowerCase();
        System.out.println(b);
        // .toUpperCase () function
        String c= name.toUpperCase();
        System.out.println(c);
        //.trim() function (remove leading and previous spaces)
        String ntc = "          IShmeet       ";
        System.out.println(ntc);
        System.out.println(ntc.trim());
        // .substring(int start)
        System.out.println(name.substring(2));
        // .substring( int start,int end)
        System.out.println(name.substring(1,5));
        // .replace('o','n')
        System.out.println(name.replace('s','S'));
        System.out.println(name.replace("hmeet","HMEET"));
        // .startswith("is")
        System.out.println(name.startsWith("Ish"));
        System.out.println(name.endsWith("eet"));
        // .charAt(2)
        System.out.println(name.charAt(4));
        // .indexof()
        System.out.println(name.indexOf("e"));
        System.out.println(name.indexOf("i",4));
        // .lastindexof()
        System.out.println(name.lastIndexOf("eet",7));
        // .equal()
        System.out.println(name.equals("Ishmeet"));
        // .equalignorecase
        System.out.println(name.equalsIgnoreCase("isHMEet"));
        System.out.println("Hi next word is in new line \n next word will be after tab \t \'qu\\ote\'");
    }
}




