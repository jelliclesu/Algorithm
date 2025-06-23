import java.util.*;

public class Main {
    public static boolean[] arr = new boolean[(int) Math.pow(3, 12) + 1];
    public static void main(String[] args) {
        /*
        칸토어 집합
        1. -가 3N개 있는 문자열에서 시작한다.
        2. 문자열을 3등분 한 뒤, 가운데 문자열을 공백으로 바꾼다. 이렇게 하면, 선(문자열) 2개가 남는다.
        3. 이제 각 선(문자열)을 3등분 하고, 가운데 문자열을 공백으로 바꾼다. 이 과정은 모든 선의 길이가 1일때 까지 계속 한다.

        3^n 시작
        mid_start = (1 + 3^n) / 3 * 1
        mid+end = (1 + 3^n) / 3 * 2
        mid_start ~ mid_end -> 공백 처리 arr[i] = True
         */
        mergeSort(1, (int) Math.pow(3, 12));

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int len = (int) Math.pow(3, N);

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= len; i++) {
                sb.append(arr[i] ? " " : "-");
            }
            System.out.println(sb);
        }
    }

    private static void mergeSort(int start, int end) {
        int len = end - start + 1;
        if (len < 3) return;

        int oneThird = len / 3;

        int midStart = start + oneThird;
        int midEnd = midStart + oneThird - 1;

        for (int i = midStart; i <= midEnd; i++) {
            arr[i] = true;
        }

        mergeSort(start, midStart - 1);
        mergeSort(midEnd + 1, end);
    }
}