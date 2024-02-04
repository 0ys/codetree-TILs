import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();

        double m = height*0.01;
        double bmi = weight/(m*m);
        
        System.out.println((int)bmi);
        if ((int)bmi >=25 ) {
            System.out.println("Obesity");
        }
    }
}