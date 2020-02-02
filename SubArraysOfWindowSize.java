package arrays;

public class SubArraysOfWindowSize {

	public static void windowSize(int a[],int n,int k) {
		
		for(int i=0;i<=n-k;i++) {
			
			int max=0;
			
			for(int j=i;j<i+k;j++) {
				
				if(max<a[j])
					max=a[j];
			}
			System.out.print(max+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,1,4,5,2,3,6};
		
		windowSize(arr,arr.length,3);

	}

}
