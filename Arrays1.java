import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enteer size of n array:");
        int iSize=sc.nextInt();
        int num []=new int [iSize];

       System.out.printf("enter %d elements",iSize);
       System.out.println();

        //input
        for(int i=0;i<iSize;i++){
            num [i]=sc.nextInt();
        }
        
        System.out.println("==================================");
        //output
        for(int i=0;i<iSize;i++){
            System.out.println(num[i]);
        }
    }
    
}
