//rows=4
//output 
//HALF PYRAMID
//    * * * *
//    * * *
//    * * 
//    * 

import java.util.Scanner;

public class Pattern10{

    void display(int iRow){
        for(int i=1;i<=iRow;i++){
            for(int j=iRow;j>=i;j--)
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

        Pattern10 obj=new Pattern10();
        obj.display(iRow);
    }
}
