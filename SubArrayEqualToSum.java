package arrays;

public class SubArrayEqualToSum {
	
	public static void subArraySum(int a[],int n,int x) {
		int count=0;
		for(int i=0;i<n;i++) {
			
			for(int j=i;j<n;j++) {
				
				int ans=0;
				
				for(int k=i;k<=j;k++) {
					ans=ans+a[k];
					
					if(ans==x) {
						
						if(count!=0)
						System.out.println(i+" "+k);

						count++;
						break;
					}
				}
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 4, 20, 3, 10, 5};
		
		subArraySum(arr, arr.length, 33);

	}

}
