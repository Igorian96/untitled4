public class metod {
    public static void main(String[] args){
        int u = sySon(1,-1);
        System.out.println(u);
    }
    static int sySon(int a, int b){
        int K= a+b;
        if(K == 0){
            K = sySon(1,1);
        }


        return K;
    }
}
