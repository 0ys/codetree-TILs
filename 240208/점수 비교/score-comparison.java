import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a_math = sc.nextInt();
        int a_en = sc.nextInt();
        int b_math = sc.nextInt();
        int b_en = sc.nextInt();

        System.out.println(a_math>b_math && a_en>b_en? 1:0);
    }
}