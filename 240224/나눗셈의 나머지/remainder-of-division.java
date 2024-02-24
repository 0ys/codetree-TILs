import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] countArr = new int[b];
        while(a>1){
            int c = a%b;
            a /= b;
            countArr[c]++;;
        }
        
        int sum = 0;
        for(int c : countArr){
            sum += c*c;
        }
        System.out.println(sum);
    }
}