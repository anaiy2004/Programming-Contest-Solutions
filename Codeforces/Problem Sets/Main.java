import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int q = Integer.parseInt(st.nextToken());
        for(int i = 0; i < q; i ++) {
            st = new StringTokenizer(f.readLine());
            int l = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(f.readLine());
            int[] x = new int[l];
            for(int j = 0; j < l; j ++) {
                x[j] = Integer.parseInt(st.nextToken());
            }
            solve(x);
        }
    }
    public static void solve(int[] x) {
        Arrays.sort(x);
        if(x.length == 1) {
            System.out.println(-1);
            return;
        }
        int counter = 1;
        for(int i = 0; i < x.length - 1; i ++) {
            if(x[i] == x[i + 1]) {
                counter ++;
            }
            else {
                break;
            }
            if(counter == x.length) {
                System.out.println(-1);
                return;
            }
        }
        int[] b = new int[counter];
        for(int i = 0; i < counter; i ++) {
            b[i] = x[0];
        }
        int[] c = new int[x.length - counter];
        for(int i = 0; i < x.length - counter; i ++) {
            c[i] = x[counter + i];
        }
        System.out.println(b.length + " " + c.length);
        for (int el : b) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (int el : c) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}