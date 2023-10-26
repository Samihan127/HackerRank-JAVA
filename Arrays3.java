//Take an array as input from user.
//search for a smallest num and print it
//

import java.util.Scanner;

public class Arrays3 {

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

        int iSmall=arr[0];

        for(int i=1;i<iSize;i++){
            if(arr[i] <iSmall){
                iSmall=arr[i];
            }
        }
        System.out.println("smallest number is"+ " "+iSmall);

        }
    }

    
