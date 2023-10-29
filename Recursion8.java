//check whether array is sorted or not(increasing array)

import java.util.*;

public class Recursion8 {

    public static boolean ChkSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }

        if(arr[idx]<arr[idx+1]){
            return ChkSorted(arr, idx+1);
        }else
        {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int iSize=sc.nextInt();
        int arr[]=new int[iSize];
        System.out.printf("enter %d elements",iSize);
        System.out.println();

        for(int i=0;i<iSize;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(ChkSorted(arr,0));
    }
    
}
