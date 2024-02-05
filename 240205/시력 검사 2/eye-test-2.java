import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double sight = sc.nextDouble();

        if (sight>=1.0) System.out.print("High");
        else if (sight>=0.5) System.out.print("Middle");
        else System.out.print("Low");
    }
}