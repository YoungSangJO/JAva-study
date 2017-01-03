package first;

public class main {

	public static void main(String[] args) {
		int a, b,c;
		a=1;
		b=1;
		int sum;
		sum=a+b;
		while(true){
			c=a+b;
			sum=sum+c;
			System.out.println(c);
			if(c<21){
				a=b;
				b=c;
			}
			else{
				System.out.println(sum);
				break;
			}
		}
		
	}

}
