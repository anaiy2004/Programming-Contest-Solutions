import java.io.*;
import java.util.*;
public class DifferentDifferences {
	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int querries = Integer.parseInt(st.nextToken());
		for(int i = 0; i < querries; i ++)
		{
			st = new StringTokenizer(f.readLine());
			int k = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int[] ans = new int[k];
			ans[0] = 1;
			for(int j = 1; j < k; j ++)
			{
				if(n - (ans[j - 1] + j) + 1 > k - j - 1)
				{
					ans[j] = ans[j - 1] + j;
				}
				else
				{
					ans[j] = ans[j-1] + 1;
				}
			}
			for(int elements : ans)
			{
				System.out.print(elements + " ");
			}
			System.out.println();
		}
	}
}
