package javaAssignment;

public class RemoveDupRecersivly {
	
	static String str="";
	static int f=0;
	
	 static void fun(char[] s,int n) {
		
		 if(n>=s.length-1) {
			return;
		}
		 else if(s[n]==s[n+1]) {
			 f=1;
			fun(s, n+1);
		}
		 else if(s[n]!=s[n+1]) {
			 if(f==0) {
			str=str+s[n];
			 }
			 f=0;
			 
			fun(s, n+1);
		}
		 

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "acaaabbbacdddd";
		char []s1=s.toCharArray();
			

		
		fun(s1,0);
		System.out.println(str);


	}

}
