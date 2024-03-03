import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<N; i++){
            String input = sc.next();

            if(input.equals("push_back")){
                int a = sc.nextInt();
                arr.add(a);
            } 
            else if(input.equals("pop_back")){
                arr.remove(arr.size()-1);
            } 
            else if(input.equals("get")){
                int k = sc.nextInt();
                System.out.println(arr.get(k-1));
            } 
            else if(input.equals("size")){
                System.out.println(arr.size());
            } 
        }
    }
}