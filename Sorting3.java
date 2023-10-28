//Inserction sort

import java.util.*;

public class Sorting3 {

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

        //Inserction sort

        for(int i =1;i<arr.length;i++){
            int Current=arr[i];
            int j=i-1;

            while (j>=0 && Current < arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }

            //placement
            arr[j+1]=Current;

        }

        printArray(arr);

    }
}
