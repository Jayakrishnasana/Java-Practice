package allprograms.numberprograms;

public class FibbonocciNumbersInShape {

	public static void main(String[] args) {
	fib(10);	

	}
	static void fib(int n) {
		
		int a=1,b=1,c;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==j) {
					System.out.print(b);
					
					c=a+b;
				
					
					a=b;
					b=c;
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n;j++) {
				if(i+j==n+1) {
					System.out.print(b);
					c=a+b;
					a=b;
					b=c;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}



/*
1          
 2         
  3        
   5       
    8      
     13     
      21    
       34   
        55  
         89 
          144
           
          233
         377 
        610  
       987   
      1597    
     2584     
    4181      
   6765       
  10946        

 */ 