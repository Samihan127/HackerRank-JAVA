//rows=4
//col=4
//output
//    $ * * *
//    * $ * *
//    * * $ *
//    * * * $ 

import java.util.Scanner;

public class pattern6 {

    void display(int iRow,int iCol){
        for(int i=1;i<=iRow;i++){
            for(int j=1;j<=iCol;j++)
            {
                if(i==j){
                    System.out.print("$"+" ");
                }else{
                    System.out.print("*"+" ");
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

        pattern6 obj=new pattern6();
        obj.display(iRow, iCol);


    }
    
}
