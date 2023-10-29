//print factorial of number n

import java.util.Scanner;

public class Recursion2{

    public static int PrintFact(int n){

        if (n==1 || n==0) {
            return 1;

        }
        int Fact_nm1=PrintFact(n-1);   //plz look stack memory
        int Fact_n=n*Fact_nm1;
        return Fact_n;
        
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");  //assume number is 3
        int n=sc.nextInt();

        int iret=PrintFact(n);
        System.out.println(iret);
        
    }
}
/*                        *    //MEMORY STACK
 *                        *
 * ********************** *
 *                        *
 * ********************** *    
 *   PrintFact n=1        *    //till this line no  13 willonly run
 * ********************** *
 *    PrintFact n=2       *
 * ********************** *
 *     PrintFact  n=3     *
 * ********************** *
 *        main n=3        *
 * ********************** *
 */
