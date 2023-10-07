// Qs. Print if a number is prime or not (Input n from the user). 

import java.lang.*;
import java.util.Scanner;

public class ChkPrime {

    int prime(int iNo){

        int iRet=0;
        for(int i=2;i<=iNo/2;i++) {
            if(iNo%i==0)
            {
               iRet=1;
               break;
            }
        }
        return iRet;
    }

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
    int iNo=sc.nextInt();

    ChkPrime obj=new ChkPrime();
    int iRet=obj.prime(iNo);

    if(iRet==1){
        System.out.println("Not prime");
    }
    else{
        System.out.println("prime");
    }

}

}
