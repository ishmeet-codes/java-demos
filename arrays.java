public class arrays {
    public static void main(String[] args) {
        int h1=0;
        int [] marks = new int[5];
        marks[0]= 100;
        marks[1]=90;
        marks[2]=80;
        marks[3]=70;
        marks[4]=60;
        // array functions
        System.out.println("Length fn");
        System.out.println(marks.length);
        //for each loop
        for(int element: marks){
            System.out.println(element);
        }

        // multidimensional arrays
        System.out.println("Multidimensional arrays");
        int [][] flats;
        flats = new int [3][3];
        flats [0][0] =101;
        flats [0][1] =102;
        flats [0][2] =103;
        flats [1][0] =104;
        flats [1][1] =105;
        flats [1][2] =106;
        flats [2][0] =107;
        flats [2][1] =108;
        flats [2][2] =109;

        for(int i = 0;i<flats.length;i++){
            for(int j =0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
