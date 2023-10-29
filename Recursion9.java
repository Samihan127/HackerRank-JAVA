//move all x to last pos in new string

public class Recursion9 {

    public static void MoveX(String str,int idx,int count,String newString){

        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }

        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            MoveX(str, idx+1, count, newString);
        }else{
            newString+=currChar;
            MoveX(str, idx+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str="axvxfxgggxh";
        MoveX(str,0,0,"");

    }
}
