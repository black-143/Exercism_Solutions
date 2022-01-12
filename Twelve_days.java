import java.util.*;
class Main
{
	public void rnatranscription()
	{
		String s="GCTAKB";
		StringBuilder sb =new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='G')
				sb.append('C');
			else if(s.charAt(i)=='C')
				sb.append('G');
			else if(s.charAt(i)=='T')
				sb.append('A');
			else if(s.charAt(i)=='A')
				sb.append('U');
			else
				sb.append(s.charAt(i));

		}
		System.out.println(sb.toString());
	}
	public static void main(String args[])
	{
		Main m=new Main();
		
		m.rnatranscription();

	}
}