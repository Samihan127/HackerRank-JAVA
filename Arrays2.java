//Take an array as input from user.
//search for a given number x and
//print the index at which it occurs

import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of an array");
        int iSize=sc.nextInt();
        int arr[]=new int [iSize];

        System.out.printf("enter %d elements",iSize);
        System.out.println();

        for(int i=0;i<iSize;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Please give a number that you want to search");
        int iNum=sc.nextInt();

        for(int i=0;i<iSize;i++){
            if(arr[i]==iNum){
                System.out.println("num found at index:"+i);
            }
        }
    }

    
}
