public class arrays {
    public static void main(String[] args) {
        int h1=0;
        int [] marks = new int[5];
        marks[0]= 100;
        marks[1]=90;
        marks[2]=80;
        marks[3]=70;
        marks[4]=60;
        for (int i =0 ; i<5;i++){

           h1 += marks[i] ;
        }
        System.out.println(h1);
    }
}
