//print all subsequences

public class Recursion11 {

    public static void Subsequences(String str,int idx,String newString){

        if (idx==str.length()) {
            System.out.println(newString);
            return;
            
        }

        char currChar=str.charAt(idx);

        //to be
        Subsequences(str, idx+1, newString+currChar);

        //not to be
        Subsequences(str, idx+1, newString);

    }
    public static void main(String[] args) {
        String str="abc";
        Subsequences(str,0,"");
    }
    
}
