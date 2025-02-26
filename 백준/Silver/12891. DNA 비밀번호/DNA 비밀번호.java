import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int checkArr[] = new int[4];
        int nowArr[] = new int[4];
        int count = 0;
        int result = 0;
        
        char arr[] = new char[s];
        arr = br.readLine().toCharArray();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                count++;    // 0 이면 이미 조건을 만족하는 것
            }
        }
        for (int i = 0; i < p; i++) {
            if (arr[i] == 'A') {
                nowArr[0]++;
                if (nowArr[0] == checkArr[0]) {
                    count++;
                }
            } else if (arr[i] == 'C') {
                nowArr[1]++;
                if (nowArr[1] == checkArr[1]) {
                    count++;
                }
            } else if (arr[i] == 'G') {
                nowArr[2]++;
                if (nowArr[2] == checkArr[2]) {
                    count++;
                }
            } else if (arr[i] == 'T') {
                nowArr[3]++;
                if (nowArr[3] == checkArr[3]) {
                    count++;
                }
            }
        }
        if (count == 4) {
            result++;
        }
        
        // 슬라이딩 윈도우
        for (int i = p; i < s; i++) {
            if (arr[i] == 'A') {
                nowArr[0]++;
                if (nowArr[0] == checkArr[0]) {
                    count++;
                }
            } else if (arr[i] == 'C') {
                nowArr[1]++;
                if (nowArr[1] == checkArr[1]) {
                    count++;
                }
            } else if (arr[i] == 'G') {
                nowArr[2]++;
                if (nowArr[2] == checkArr[2]) {
                    count++;
                }
            } else if (arr[i] == 'T') {
                nowArr[3]++;
                if (nowArr[3] == checkArr[3]) {
                    count++;
                }
            }
            
            if (arr[i - p] == 'A') {
                if (nowArr[0] == checkArr[0]) {
                    count--;
                }
                nowArr[0]--;
            } else if (arr[i - p] == 'C') {
                if (nowArr[1] == checkArr[1]) {
                    count--;
                }
                nowArr[1]--;
            } else if (arr[i - p] == 'G') {
                if (nowArr[2] == checkArr[2]) {
                    count--;
                }
                nowArr[2]--;
            } else if (arr[i - p] == 'T') {
                if (nowArr[3] == checkArr[3]) {
                    count--;
                }
                nowArr[3]--;
            }
            
            if (count == 4) {
                result++;
            }
        }
        System.out.println(result);
    }
}