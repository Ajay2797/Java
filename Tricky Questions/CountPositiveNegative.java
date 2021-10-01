import java.util.*;
class CountPositiveNegative
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter the number of elements in the array : ");
		int n = s.nextInt();
		if(n>0){
			int [] arr = new int [n];
			for(int i=0; i<n; i++){
				System.out.print("Enter the "+(i+1)+" element : ");
				arr[i] = s.nextInt();
			}
			CountPositiveNegative a = new CountPositiveNegative();
			a.NumberOf(arr,n);
		}
		else{
			System.out.print("\nEnter the number of elements above 0.\n ");
		}
	}

	//20 inputs number of +s, -ve, odd, even and 0s
	public void NumberOf(int arr[], int n){
		int positive = 0, negative = 0, odd = 0, even = 0, zero = 0;

		System.out.print("\nInput Array : [");

		for(int j=0; j<n; j++){
			System.out.print(arr[j]+",");
		}
		System.out.print("\b]\n");

		for(int k =0; k<n; k++){
			if(arr[k] > 0){
				positive++;
			}
			else if(arr[k] < 0){
				negative++;
			}
			else{
				zero++;
			}
			if(arr[k] != 0){
				if(arr[k] % 2 == 0 ){
					even++;
				}
				else{
					odd++;
				}
			}
		}
		System.out.println("\nPositive : "+positive+"\nNegative : "+negative+"\nZero : "+zero+"\nOdd : "+odd+"\nEven : "+even+"\n");
	}
}
