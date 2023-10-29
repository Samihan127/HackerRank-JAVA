//print reverse string

import java.util.Scanner;

public class Recursion6 {

    public static void PrintRev(String str,int idx){

        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        PrintRev(str, idx-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string that u want to reverse:");
        String str=sc.nextLine();

        PrintRev(str,str.length()-1);
    }
}
