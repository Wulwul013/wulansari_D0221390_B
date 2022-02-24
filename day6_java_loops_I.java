
package wulan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class day6_java_loops_I {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            for(int i =1;i<=10;i++){
                int result = N * i;
                System.out.println(N+" x "+i+" = "+result);
                
            }
        }
        
    }
    
}
