package third;

public class main {

	public static void main(String[] args) {
		int k, fac, sum;
		
		k=0;
		sum=0;
		fac=1;
		
		while(true)
		{
			k=k+1;
			fac=fac*k;
			sum=sum+fac;
			if(k>=10)
			{
				break;
			}
		}
		System.out.println(sum);
	}

}
