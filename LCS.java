package Practicals;
import java.util.*;
public class LCS {
    static void common(String S1, String S2, int m, int n) {
        int[][] LCS_table = new int[m + 1][n + 1];

        // Building the mtrix in bottom-up way
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    LCS_table[i][j] = 0;
                else if (S1.charAt(i - 1) == S2.charAt(j - 1))
                    LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
                else
                    LCS_table[i][j] = Math.max(LCS_table[i - 1][j], LCS_table[i][j - 1]);
            }
        }

        int index = LCS_table[m][n];
        int temp = index;
        char[] S = new char[index + 1];
        S[index] = '\0';

        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                S[index - 1] = S1.charAt(i - 1);
                i--;
                j--;
                index--;
            }
            else if (LCS_table[i - 1][j] > LCS_table[i][j - 1])
                i--;
            else
                j--;
        }
        System.out.print("LCS : ");
        for (int k = 0; k <= temp; k++)
            System.out.print(S[k]);
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two sequences:");
        String S1 =sc.nextLine();
        String S2 =sc.nextLine();
        int A = S1.length();
        int B = S2.length();
        common(S1,S2,A,B);
    }
}
