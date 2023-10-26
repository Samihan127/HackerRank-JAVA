//take array input from user
//chk whether it is in ascending order or not

import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array:");
        int iSize=sc.nextInt();
        int arr[]=new int[iSize];
   
        System.out.printf("enter %d elements",iSize);
        System.out.println();
        
        //input
        for(int i=0;i<iSize;i++){
            arr[i]=sc.nextInt();
        }

        boolean isAscending=true;

        for(int i=0;i<iSize-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending=false;
            }
           
        }

        if(isAscending){
             System.out.println("sorted in ascending order:");

        }else{
            System.out.println("not sorted");
        }
       


        
    }
    
}
