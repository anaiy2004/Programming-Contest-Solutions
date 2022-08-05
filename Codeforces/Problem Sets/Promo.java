import java.io.*;
import java.util.*;
public class Promo 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int totalItems = Integer.parseInt(st.nextToken());
		int queries = Integer.parseInt(st.nextToken());
		int[] items = new int[totalItems];
		st = new StringTokenizer(f.readLine());
		for(int i = 0; i < totalItems; i ++)
		{
			items[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(items);
		long[] prefixSums = new long[totalItems + 1];
		prefixSums[1] = items[0];
		for(int i = 2; i <= totalItems; i ++)
		{
			prefixSums[i] = prefixSums[i-1] + items[i - 1];
		}
		for(int i = 0; i < queries; i ++)
		{
			st = new StringTokenizer(f.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(x > totalItems)
			{
				System.out.println(0);
			}
			else
			{
				long sum = prefixSums[totalItems - x + y] - prefixSums[totalItems - x];
				System.out.println(sum);
			}
		}
	}
}
