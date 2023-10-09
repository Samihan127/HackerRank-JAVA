//print -n to n

import java.lang.*;
import java.util.Scanner;

public class pattern2 {

    void display(int iNo) {
        for (int i = -iNo; i <= iNo; i++) {
            System.out.print(i + " ");
        }
    } 

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:-");
        int iNo=sc.nextInt();

        pattern2 obj=new pattern2();
        obj.display(iNo);
    }
    
}
