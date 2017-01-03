package sec;

public class main {

	public static void main(String[] args) {
		int i, k;
		int ar[]={85, 90,70,65,96,88,95,35,40,77};
				
		
		i=0;
		k=0;
		
		while(true){
			i=i+1;
			
			if(i>10){
				break;
			}
			
			if(ar[i-1]>=80)
			{
				k=k+1;
			}
			
		}
		
		System.out.println(k);
		
	}

}
