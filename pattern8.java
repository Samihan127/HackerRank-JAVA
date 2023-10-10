//rows=4
//col=4
//output 
//HALF PYRAMID
//    * 
//    * *
//    * * *
//    * * * *

import java.util.Scanner;

public class pattern8 {

    void display(int iRow,int iCol){
        for(int i=1;i<=iRow;i++){
            for(int j=1;j<=iCol;j++)
            {
                if(j<=i){ 
                   System.out.print("*");
                }else{
                    System.out.print(" ");
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

        pattern8 obj=new pattern8();
        obj.display(iRow, iCol);


    }
    
}
