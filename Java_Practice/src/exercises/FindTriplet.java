package exercises;

public class FindTriplet {

	public static void main(String[] args) {
		
		int sum = 23;
		
		int[] arr = {12,9,1,4,2,5};
		
		int length = 6;
		
		for(int i=0; i<length-2; i++)
		{
			
			int j=i+1;
			int k=length-1;
			
			while(j<k)
			{
				System.out.println(i + " " + j + " " + k);
				
				int temp = arr[i] + arr[j] + arr[k];
				
				if (sum == temp) {
					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					break;
				} else if(sum < temp) {
					k--;
				} else {
					j++;
				}	
				
			}
			
		}

	}
	
	

}
