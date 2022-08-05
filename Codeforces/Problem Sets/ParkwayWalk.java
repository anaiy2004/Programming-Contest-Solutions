import java.io.*;
import java.util.*;
public class ParkwayWalk
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(f.readLine());
		for(int i = 0; i < cases; i ++)
		{
			StringTokenizer st = new StringTokenizer(f.readLine());
			int benches = Integer.parseInt(st.nextToken());
			int initialEnergy = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(f.readLine());
			int energyRequired = 0;
			for(int j = 0; j < benches; j ++)
			{
				energyRequired += Integer.parseInt(st.nextToken());
			}
			System.out.println(Math.max(0, energyRequired - initialEnergy));
		}
	}
}
