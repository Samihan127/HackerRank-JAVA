//n=10
//1       *       3       *       5       *       7       *       9       *

import java.lang.*;
import java.util.Scanner;

public class pattern3 {

    void display(int iNo) {

        for(int i=1;i<=iNo;i++){
            if(i%2==0){
                System.out.print("*" +" ");
            }else{
                System.out.print(i+" ");
            }
        }
    } 

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:-");
        int iNo=sc.nextInt();

        pattern3 obj=new pattern3();
        obj.display(iNo);
    }  
}

