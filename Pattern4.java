
//Number Patterns
public class Pattern4 {

public static void main(String [] args){
	int[] a = {4,9,5,3,2,10};
	
	for(int i=0;i<a.length;i++)
	{
		int cnt = 0;
		for(int j=0;j<i;j++)
		{
			if(a[i]<a[j])
			{
				cnt++;
			}
		}
		if(cnt==0)
		{
			System.out.print(0+" ");
		}
		else
		{
		System.out.print(cnt+" ṇ");
		}
		
	}
}
}

