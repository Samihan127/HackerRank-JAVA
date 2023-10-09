//print 1 to n and n to 1

import java.lang.*;
import java.util.Scanner;

public class pattern1 {

    void display(int iNo)
    {
        for(int i=1;i<=iNo;i++)
        {
            System.out.print(i +" ");
        } 

        for(int i=iNo;i>0;i--)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:-");
        int iNo=sc.nextInt();

        pattern1 obj=new pattern1();
        obj.display(iNo);
    }
    
}
