import java.util.*;
import java.io.*;

public class Main {
    static int[] distance;
    static int[] direction;

    // (1,0)(0,-1)(-1,0)(0,1) E S W N
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, -1, 0, 1};

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        distance = new int[N];
        direction = new int[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            switch(d){
                case "E": direction[i] = 0; break;
                case "S": direction[i] = 1; break;
                case "W": direction[i] = 2; break;
                case "N": direction[i] = 3; break;
            }
            distance[i] = Integer.parseInt(st.nextToken());
            // System.out.println(direction[i]+" "+distance[i]);
        }

        int x=0, y=0;
        for(int i=0; i<N; i++){
            x += dx[direction[i]]*distance[i];
            y += dy[direction[i]]*distance[i];
        }
        bw.write(x+" "+y);

        br.close();
        bw.flush();
        bw.close();
    }
}