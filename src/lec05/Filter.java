package lec05;

import java.util.Arrays;

public class Filter {
    static final int N = 100;
    static int A[] = new int[N];

    static void fill() {
        //for(int i=0;i<N;i++)A[i]=1;
        Arrays.fill(A, 1);
        A[0] = A[1] = 0;
        for (int i = 2; i * i <= N; i++) {
            if (A[i] == 1) {
                for (int j = 2 * i; j < N; j += i) {
                    A[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        fill();
        System.out.println(Arrays.toString(A));
        for (int i = 0; i < N; i++) {
            if (A[i] == 1) System.out.print(i + " ");
        }

    }
}
