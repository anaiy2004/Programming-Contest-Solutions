import java.io.*;
import java.util.*;
public class ChallengingValleys 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int cases = Integer.parseInt(st.nextToken());
		for(int i = 0; i < cases; i ++)
		{
			st = new StringTokenizer(f.readLine());
			long len = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(f.readLine());
			long[] seq = new long[(int)len];
			for(int j = 0; j < len; j ++)
			{
				seq[j] = Integer.parseInt(st.nextToken());
			}
			ArrayList<Boolean> ans = new ArrayList<Boolean>();
			for(int j = 0; j < len - 1; j ++)
			{
				if(seq[j] < seq[j+1])
				{
					ans.add(true);
				}
				else if (seq[j] > seq[j+1])
				{
					ans.add(false);
				}
			}
			Set<Boolean> set = new HashSet<>(ans);
			if(set.size() == 1)
			{
				System.out.println("YES");
				continue;
			}
			boolean neg = false;
			boolean pos = false;
			boolean solved = false;
			for(int j = 0; j < ans.size(); j ++)
			{
				if(!neg && ans.get(j))
				{
					System.out.println("NO");
					solved = true;
					break;
				}
				if(!ans.get(j))
				{
					neg = true;
				}
				if(ans.get(j))
				{
					pos = true;
				}
				if(neg && pos && !ans.get(j))
				{
					System.out.println("NO");
					solved = true;
					break;
				}
			}
			if(!solved)
				System.out.println("YES");
		}
	}
}
