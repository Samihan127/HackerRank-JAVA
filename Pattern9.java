//rows=4
//output 
//HALF PYRAMID
//    * 
//    * *
//    * * *
//    * * * *

import java.util.Scanner;

public class Pattern9{

    void display(int iRow){
        for(int i=1;i<=iRow;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int iRow=sc.nextInt();

        Pattern9 obj=new Pattern9();
        obj.display(iRow);
    }
}