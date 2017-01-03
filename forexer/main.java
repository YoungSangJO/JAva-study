package forexer;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A, B, N, SUM;
		
		SUM=0;
		A=s.nextInt();
		B=s.nextInt();
		
		if(A>B)
		{
			for(N=B;N<=A;N++)
			{
				SUM=SUM+N;
			}
		}
		else
		{
			for(N=A;N<=B;N++)
			{
				SUM=SUM+N;
			}
		}
		System.out.println("fgjhfj"+SUM+"asdasd"+(A+B));
	}

}
