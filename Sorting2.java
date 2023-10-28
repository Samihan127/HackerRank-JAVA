//Selection sort

import java.util.*;

public class Sorting2 {

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

        //Selection sort

        for(int i =0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
           
        }

        printArray(arr);

    }
    
}
