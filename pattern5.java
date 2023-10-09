//rows=4
//col=4
//output
//    1 1 1 1
//    2 2 2 2
//    3 3 3 3
//    4 4 4 4

import java.lang.*;
import java.util.Scanner;

public class pattern5 {

    void display(int iRow,int iCol){

        for(int i=1;i<=iRow;i++){
         
            for(int j=1;j<=iCol;j++){
                System.out.print(i+" ");
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

        pattern5 obj=new pattern5();
        obj.display(iRow, iCol);

    }
    
}
