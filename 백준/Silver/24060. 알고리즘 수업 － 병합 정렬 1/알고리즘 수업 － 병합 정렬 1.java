import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int K;
    public static int count = 0;
    public static int answer = -1;

    public static void main(String[] args) throws IOException {
        /*
        병합 정렬로 오름차순 정렬할 경우, 배열 A 에 K 번째 저장되는 수
        k == count answer
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        mergeSort(arr, 0, N - 1);
        System.out.println(answer);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int t = 0;

        int[] temp = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            }
            else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        while (j <= end) {
            temp[t++] = arr[j++];
        }
        t = 0;
        for (i = start; i <= end; i++) {
            arr[i] = temp[t++];
            count++;
            if (count == K) answer = arr[i];
        }
    }
}