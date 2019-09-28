package lec05;

public class YHTriangle {
    public static void main(String[] args) {
        int n = 10;
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) a[i][0] = 1;//C(i,0)
        for (int i = 0; i < n; i++) a[i][i] = 1;//C(i,i)
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                a[i][j] = a[i - 1][j] + a[i - 1][j - 1];//C(i,j)=C(i-1,j-1)+C(i-1,j)
            }
        }
        disp2d(a);
    }

    private static void disp2d(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
