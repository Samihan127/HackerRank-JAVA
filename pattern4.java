//rows=4
//col=4
//output
//    * * * *
//    * * * *
//    * * * *
//    * * * * 

import java.lang.*;
import java.util.Scanner;

public class pattern4 {

    void display(int iRow,int iCol){

        for(int i=1;i<=iRow;i++){
         
            for(int j=1;j<=iCol;j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int iRow=sc.nextInt();
        System.out.println("enter number of columns:");
        int iCol=sc.nextInt();

        pattern4 obj=new pattern4();
        obj.display(iRow, iCol);

    }
    
}
