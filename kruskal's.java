import java.util.*;
public class kruskal {
    public static void main(String[] args) {
        int n, i, j, min, m, max;
        int count = 0;
        int sum = 0;
        int u = 0, v = 0;
        System.out.println("Enter the number of vertices");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int graph[][] = new int[n][n];
        int visited[] = new int[n];
        for (i = 0; i < n; i++) {
            visited[i] = i + 1;
        }

        System.out.println("Enter the weighted graph");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        while (count < (n - 1)) {
            min = graph[0][0];
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (min > graph[j][i]) {
                        min = graph[i][j];
                        u = i;
                        v = j;
                    }

                }
            }
            System.out.println((u + 1) + "-" + (v + 1) + " " + min);
            sum = sum + min;
            graph[u][v] = graph[v][u] = 99;

            if (visited[u] < visited[v]) {
                max = visited[v];
                m = visited[v] = visited[u];
            } else {
                max = visited[u];
                m = visited[u] = visited[v];
            }

            for (i = 0; i < n; i++) {
                if (visited[i] == max) {
                    visited[i] = m;
                }
            }
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (i != j && visited[j] == visited[i]) {
                        u = i;
                        v = j;
                        graph[u][v] = graph[v][u] = 99;
                    }
                }
            }
            count++;
        }

        System.out.println("sum " + sum);

    }
}