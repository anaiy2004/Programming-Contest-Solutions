import java.io.*;
import java.util.*;
public class BlockTowers 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int cases = Integer.parseInt(st.nextToken());
		for(int i = 0; i < cases; i ++)
		{
			st = new StringTokenizer(f.readLine());
			int towerCount = Integer.parseInt(st.nextToken());
			ArrayList<Integer> towerArr = new ArrayList<Integer>();
			st = new StringTokenizer(f.readLine());
			int ans = Integer.parseInt(st.nextToken());
			towerArr.add(ans);
			for(int j = 1; j < towerCount; j ++)
			{
				int element = Integer.parseInt(st.nextToken());
				if(element > ans)
					towerArr.add(element);
			}
			Collections.sort(towerArr);
			for(int j = 0; j < towerArr.size(); j++)
			{
				if(towerArr.get(j) > ans)
				{
					ans = (int) Math.ceil((1.0 * ans + towerArr.get(j)) / 2);
				}
			}
			System.out.println(ans);
			
		}
	}
}
