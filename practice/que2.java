package practice;

public class que2 {
    public static void main(String[] args) {
        int x=4;
        int y =0;
        int z=0;
        int [] num ={2,4,6,8,0};
        for(int i=0;i< num.length;i++){
            if(num[i] == x){
                 y +=1;
                 z=i;
            }
        }
        if(y==1){
            System.out.format("X is placed at %d",z+1);

        }else {
            System.out.println("Given number is not in array");
        }
    }
}
