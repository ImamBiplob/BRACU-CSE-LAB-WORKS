import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class MITM {

    public static int graph[][];
    public static int n;
    public static int p[];
    public static int d[];
    public static boolean check[];

    public static void main(String[] args) {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(br);
        n = sc.nextInt();
        int e = sc.nextInt();
        graph = new int[n][n];
        p = new int[n];
        d = new int[n];

        check = new boolean[n];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                graph[i][j] = -1;
            }
        }

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = sc.nextInt();
        }


        dijMethod(0);
        int[] d1 = new int[n];
        System.arraycopy(d, 0, d1, 0, d.length);

        dijMethod(n - 1);

        int[] d2 = new int[n];
        System.arraycopy(d, 0, d2, 0, d.length);

        int ans[] = new int[n];
  
  int index = 0;
  int min = 100000000;
        for (int i = 0; i < d.length; i++) {
            ans[i] = d1[i] + d2[i];
   if(min>ans[i]){
   min = ans[i];
    index =i;
   }
  }

        System.out.println(index);

    }

    public static void dijMethod(int s) {
        for (int v = 0; v < graph.length; v++) {
            d[v] = 99999999;
            p[v] = -1;
            check[v] = false;
        }
        d[s] = 0;

        for (int i = 0; i < graph.length; i++) {
            int u = min(d, check);
            check[u] = true;
            for (int v = 0; v < graph.length; v++) {
                if (!check[v] && graph[u][v] != -1 && d[u] + graph[u][v] < d[v]) {
                    p[v] = u;
                    d[v] = d[u] + graph[u][v];

                }
            }
        }

    }

    public static int min(int[] d, boolean[] check) {

        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < d.length; i++) {
            if (check[i] == false && d[i] < min) {
                min = d[i];
                minIndex = i;

            }
        }
        return minIndex;
    }
}