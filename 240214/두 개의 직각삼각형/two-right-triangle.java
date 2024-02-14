import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String arr;
        for(int i=0; i<n; i++){
            for(int s=0; s<n-i; s++){
                System.out.print("*");
            }
            for(int b=0; b<i*2; b++){
                System.out.print(" ");
            }
            for(int s=0; s<n-i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}