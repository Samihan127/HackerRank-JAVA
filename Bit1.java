import java.util.*;

public class Bit1 {
    public static void main(String[] args) {

       //Get bit
       int n=15; //1111
       int pos=1;
       int mask=1<<pos;

       if((mask&n)==0){
        System.out.println("bit was zero");
       }else{
        System.out.println("bit was one");
       }

       //set bit
       //set 2nd bit 
       int n1=5;
       int pos1=1;
       int mask1=1<<pos1;

       int num=(mask1 | n1);
       System.out.println(num);

       //clear bit
       int n2=5;
       int pos2=2;
       int mask2=1<<pos2;
       int notMask=~mask2;

       int num1=notMask&n2;
       System.out.println(num1);

       //update bit

       Scanner sc=new Scanner(System.in);
       System.out.println("enter operation 0 or 1");
       int oper=sc.nextInt();

       int n3=5;
       int pos3=1;
       int mask3=1<<pos3;

       if(oper==1){
        //set
        int newNum=mask3|n3;
        System.out.println(newNum);
       }else{
        //clear
        int newBitMask=~mask3;
        int newNum1=newBitMask&n3;
        System.out.println(newNum1);
       }
    }
}
