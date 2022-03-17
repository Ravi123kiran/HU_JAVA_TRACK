package java2_assg;
import java.util.Arrays;
import java.util.Scanner;

public class string {
        static Scanner scan = new Scanner(System.in);
        static int n, m;
        static String s1, s2, s3;
        static int[][] dp;
        public static void main(String[] args) {
            s1 = scan.nextLine();
            s2 = scan.nextLine();
            s3 = scan.nextLine();
            n = s1.length(); m = s2.length();
            if (check()) System.out.println("Valid");
            else System.out.println("Invalid");
        }
        static boolean check() {
            if (n+m != s3.length()) return false;
            dp = new int[n+1][m+1];
            for (int[] i: dp) Arrays.fill(i, -1);
            return topDown(0, 0, 0) == 1;
        }
        static int topDown(int i, int j, int k) {
            if (k >= n+m) return dp[i][j] = 1;
            if (dp[i][j] != -1) return dp[i][j];
            dp[i][j] = 0;
            if (i < n && j < m) {
                dp[i][j] = (s1.charAt(i)==s3.charAt(k)? topDown(i+1,j,k+1): 0) |
                        (s2.charAt(j) == s3.charAt(k)? topDown(i,j+1,k+1): 0);
            } else if (i >= n) {
                dp[i][j] = s2.charAt(j) == s3.charAt(k)? topDown(i,j+1,k+1): 0;
            } else dp[i][j] = s1.charAt(i)==s3.charAt(k)? topDown(i+1,j,k+1): 0;
            return dp[i][j];
        }
    }
