import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<N; i++){
            String key = sc.next();

            if (key.equals("push_front")){
                int A = sc.nextInt();
                list.addFirst(A);
            }
            else if (key.equals("push_back")){
                int A = sc.nextInt();
                list.addLast(A);
            }
            else if (key.equals("pop_front"))
                System.out.println(list.pollFirst());
            else if (key.equals("pop_back"))
                System.out.println(list.pollLast());
            else if (key.equals("size"))
                System.out.println(list.size());
            else if (key.equals("empty"))
                System.out.println(list.isEmpty() ? 1 : 0);
            else if (key.equals("front"))
                System.out.println(list.peekFirst());
            else if (key.equals("back"))
                System.out.println(list.peekLast());
        }
    }
}