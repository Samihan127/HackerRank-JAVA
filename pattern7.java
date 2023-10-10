//rows=4
//col=4
//output 
//HOLLOW RECTANGLE
//    * * * *
//    *     *
//    *     *
//    * * * *

import java.util.Scanner;

public class pattern7 {

    void display(int iRow,int iCol){
        for(int i=1;i<=iRow;i++){
            for(int j=1;j<=iCol;j++)
            {
                if(i==1||j==1||i==iRow||j==iCol){
                   System.out.print("*"+" ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int iRow=sc.nextInt();

        System.out.println("enter number of Columns:");
        int iCol=sc.nextInt();

        pattern7 obj=new pattern7();
        obj.display(iRow, iCol);


    }
    
}
