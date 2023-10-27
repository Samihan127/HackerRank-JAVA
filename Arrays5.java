//2D array

import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows:");
        int rows=sc.nextInt();
        System.out.println("enter number of columns:");
        int col=sc.nextInt();

        int arr[][]=new int[rows][col];

        //input
        //rows
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("=============================================");
        //output

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.println(arr[i][j]+" ");
            }
            
        }
        System.out.println();
        

    }
    
}
