//Bubble sort

import java.util.*;

public class Sorting1 {

    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of an array:");
        int iSize=sc.nextInt();
        int arr[]=new int[iSize];

        System.out.printf("enter %d elements",iSize);
        System.out.println();

        for(int i=0;i<iSize;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("==========================================");

        //bubble sort

        for(int j=0;j<arr.length-1;j++){
            for(int k=0;k<arr.length-j-1;k++){
                if(arr[k]>arr[k+1]){
                    //swap
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }

        printArray(arr);

    }
    
}
