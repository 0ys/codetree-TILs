import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int a = 1;
            for(int j=n-i; j>=0; j--){
                System.out.print(i+" * "+a+" = "+i*a++);
                if(j==0){
                    System.out.println();
                } else {
                    System.out.print(" / ");
                }
            }
        }
    }
}