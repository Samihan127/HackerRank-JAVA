// N x i = result.

// Sample Input

// 2
// Sample Output

// 2 x 1 = 2
// 2 x 2 = 4
// 2 x 3 = 6
// 2 x 4 = 8
// 2 x 5 = 10
// 2 x 6 = 12
// 2 x 7 = 14
// 2 x 8 = 16
// 2 x 9 = 18
// 2 x 10 = 20

import java.io.*;




public class java6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter a integer:");

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(N>1 && N<21)
        {
            int i=1;
            for(i=1;i<11;i++)
           {
               System.out.printf("%d %s %d %s %d \n" , N,"x",i,"=",N*i);
    
           }   
        }
       
        bufferedReader.close();
    }
}