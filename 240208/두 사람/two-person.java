import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b;
        char aSex, bSex;

        a = sc.nextInt();
        aSex = sc.next().charAt(0);

        b = sc.nextInt();
        bSex = sc.next().charAt(0);

        if ((a>=19&&aSex=='M') ||(b>=19&&bSex=='M')) System.out.println(1);
        else System.out.println(0);
    }
}