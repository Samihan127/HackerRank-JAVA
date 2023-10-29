//print first and last occurance of element in string

import java.util.Scanner;

public class Recursion7 {
    public static int first=-1;
    public static int last=-1;

    public static void FindOccur(String str,int idx,char element){

        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        FindOccur(str, idx+1, element);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        System.out.println("enter an element you want to check");
        char element=sc.next().charAt(0);

        FindOccur(str,0,element);
    } 
}
