package strings;



public class SmallestNumber {


		public static void main(String args[]){ 
			
			
			int[] a = {-2,5,6,7,8};
			int smallest =  a[0];
			for(int i = 0; i<a.length; i++)
			{
				if(a[i]<smallest)
					smallest = a[i];
			}
		System.out.println("Smallest number is " +smallest);						
	}
					
			
	}
		



