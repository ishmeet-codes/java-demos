public class varsrgs {
    static int sum(int ...arr){
        int sum=0;
        for(int a:arr){
            sum +=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,11,26,547));
    }
}
