import java.util.*;
class ReverseArray
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
			ReverseArray a = new ReverseArray();
			a.print(arr,n);
			a.Reverse(arr,n);
		}
		else{
			System.out.print("\nEnter the number of elements above 0.\n ");
		}
	}

	// Display the Array
	public void print(int arr[],int n){
		System.out.print("\nGiven Array : [");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+",");
		}
		System.out.print("\b]\n");
	}

	//Copy all elements in new array in reverse order
	public void Reverse(int arr[], int n){
		int newArray[] = new int[n];
		for(int i=(n-1); i>=0; i--){
			newArray[i] = arr[n-(i+1)];
		}
		System.out.print("\nReversed array : [");
		for(int j=0; j<n; j++){
			System.out.print(newArray[j]+",");
		}
		System.out.print("\b]\n\n");
	}
}