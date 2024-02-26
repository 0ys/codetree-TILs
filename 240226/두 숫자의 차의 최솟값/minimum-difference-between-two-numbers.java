import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        int min = 101;
        for(int i=1; i<=n; i ++){
            if(min>arr[i]-arr[i-1]){
                min = arr[i]-arr[i-1];
            }
        }
        System.out.println(min);
    }
}