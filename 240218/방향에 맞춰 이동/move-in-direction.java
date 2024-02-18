import java.util.*;
import java.io.*;

public class Main {
    // (1,0)(0,-1)(-1,0)(0,1) E S W N
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, -1, 0, 1};

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int distance=0, direction=0, x=0, y=0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            switch(d){
                case "E": direction = 0; break;
                case "S": direction = 1; break;
                case "W": direction = 2; break;
                case "N": direction = 3; break;
            }
            distance = Integer.parseInt(st.nextToken());
            // System.out.println(direction[i]+" "+distance[i]);
            x += dx[direction]*distance;
            y += dy[direction]*distance;
        }

        bw.write(x+" "+y);

        br.close();
        bw.flush();
        bw.close();
    }
}