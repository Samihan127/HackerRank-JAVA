//calculate x to the power n

public class Recursion4 {

    public static int CalcPow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xPownm1=CalcPow(x, n-1);
        int xPow=x*xPownm1;
        return xPow;

    }
    public static void main(String[] args) {
        int x=2, n=5;
        int ans=CalcPow(x,n);
        System.out.println(ans);

    }
}
