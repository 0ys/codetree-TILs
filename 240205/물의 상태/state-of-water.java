import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int water = sc.nextInt();
        String state;

        if (water<0) {
            state = "ice";
        }
        else if (water>=100) {
            state = "vapor";
        }
        else {
            state = "water";
        }

        System.out.print(state);
    }
}