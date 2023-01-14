import java.io.*;
import java.util.*;
public class BrokenKeyboard 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int cases = Integer.parseInt(st.nextToken());
		for(int i = 0; i < cases; i ++)
		{
			st = new StringTokenizer(f.readLine());
			int length = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(f.readLine());
			String word = st.nextToken();
			boolean even = true;
			boolean done = false;
			for(int j = 0; j < length; j ++)
			{
				if(even)
				{
					even = false;
					continue;
				}
				if(!even)
				{
					if(j == length - 1)
					{
						System.out.println("NO");
						done = true;
						break;
					}
					//System.out.println(word + " " + word.charAt(j) + " " + j);
					if(word.charAt(j) != word.charAt(j+1))
					{
						System.out.println("NO");
						done = true;
						break;
					}
					even = true;
					j ++;
				}
			}
			if(!done)
				System.out.println("YES");
		}
	}

}
