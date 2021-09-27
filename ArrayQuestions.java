class ArrayQuestions
{

	public static void main(String[] args) 
	{
		int a[] = {1,-1,-2,-3,2,1,-5,3,-2,9};
		int a2[] = {-6,-3,-2,-2,0,1,2,5,7};
		int a3[] = {-3,-2,-1,1,3,5,10};
		int len = a.length;
		System.out.print("Given array : ");
		for(int i=0; i<len; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		ArrayQuestions ar = new ArrayQuestions();
		ar.MinMax(a,len);
		ar.Reverse(a,len);
		int [] a1 = ar.Sort(a,len);
		ar.Occur(a,len);
		ar.Negative(a,len);
		ar.Duplicate(a,len);
		ar.Factorial(a,len);
		ar.Common(a1,a2,a3);
		ar.Rearrange(a,len);
		ar.SumPro(a,len);

	}

	//1. Find the maximum and minimum element in an array.
	void MinMax(int a[], int len){
		int min = a[0], max = a[0];
		for(int i=1; i<len; i++){
			if(a[i] < min){
				min = a[i];
			}
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.println("Minimum element in the array is : " + min +"\nMaximum element in the array is : " + max + "\n");
	}

	//2. Reverse the array.
	void Reverse(int a[], int len){
		System.out.print("Reversed Array ");
		for(int i=(len-1); i>=0; i--){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	}

	//3. Sort an array.
	int [] Sort(int a[], int len){
		int [] b = a.clone();
		System.out.print("Sorted Array : ");
		for(int i=0; i<(len-1); i++){
			for(int j=(i+1); j<len; j++){
				if(b[i] > b[j]){
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for(int k=0; k<len; k++){
			System.out.print(b[k]+" ");
		}
		System.out.println("\n");
		return b;
	}

	//4. Occurrence of an integer.
	void Occur(int a[], int len){
		System.out.print("Occurrence of an integer : ");
		int count = 1;
		for(int i=0; i<len; i++){
			for (int j=0; j<len; j++){
				if(a[i]==a[j] && i!=j){
					if(i > j){
						count = 0;
						break;
					}
					else{
						count++;
					}
				}
			}
			if(count > 0){
				System.out.print(a[i]+"["+count+"] ");
			}
			count = 1;
		}
		System.out.println("\n");
	}

	//5. Move the negative elements to one side of the array.
	void Negative(int a[], int len){
		int b[] = a.clone();
		System.out.print("After negative elements are moved : ");
		int flag = 0;
		for(int i=0; i<len; i++){
			if(b[i] < 0){
				int temp = b[flag];
				b[flag] = b[i];
				b[i] = temp;
				flag++;
			}
		}
		for(int j=0; j<len; j++){
			System.out.print(b[j]+" ");
		}
		System.out.println("\n");
	}

	//6. Duplicates in an array.
	void Duplicate(int a[], int len){
		System.out.print("Duplicates in the given array : ");
		for(int i=0; i<(len-1); i++){
			for(int j=0; j<len; j++){
				if(a[i] == a[j] && i > j){
					break;
				}
				if(a[i] == a[j] && i != j){
					System.out.print("\t"+a[i]);
					break;
				} 
			}
		}
		System.out.println("\n");
	}

	//7. Factorial of largest number.
	void Factorial(int a[], int len){
		int largest = a[0], factorial = 1;
		for(int i=1; i<len; i++){
			if(a[i] > largest){
				largest = a[i];
			}
		}
		System.out.print(largest+" is the largest and it's factorial is : ");
		for(int j=largest; j>0; j--){
			factorial = j * factorial;
		}
		System.out.print(factorial+" ");
		System.out.println("\n");
	}

	//8. Find the common element in three sorted array.
	void Common(int a1[], int a2[], int a3[]){
		int i=0, j=0, k=0;
		System.out.print("Common elements in the three sorted array are : ");
		while(i<a1.length && j<a2.length && k<a3.length){
			if(a1[i]==a2[j] && a2[j]==a3[k]){
				System.out.print("  "+a1[i]);
				i++;
				j++;
				k++;
			}
			else{
				if(a1[i]==a2[j]){
					if(a1[i] > a3[k]){
						k++;
					}
					else{
						i++;j++;
					}
				}
				else if(a1[i]==a3[k]){
					if(a1[i] > a2[j]){
						j++;
					}
					else{
						i++;k++;
					}
				}
				else{
					if(a1[i] > a2[j] && a1[i] >a3[k]){
						j++;k++;
					}
					else{
						if(a1[i] > a2[j]){
							i++;j++;
						}
						else if(a1[i] > a3[k]){
							i++;k++;
						}
						else{
							i++;
						}
					}
				}
				
			}
		}
		System.out.println("\n");
	}

	//9. Rearrange array in alternating positive and negative numbers.
	void Rearrange(int a[], int len){
		System.out.print("Rearranged array with alternating positive and negative numbers : ");
		int i=0, flag=1, temp;
		while(i<(len-1)){
			if(a[i] < 0){
				if(a[flag] >= 0){
					temp = a[i+1];
					a[i+1] = a[flag];
					a[flag] = temp;
					flag = ++i;
				}
				else{
					if(flag < (len-1)){
						flag++;
					}
					else{
						i++;
					}
				}
			}
			else{
				if(a[flag] < 0){
					temp = a[i+1];
					a[i+1] = a[flag];
					a[flag] = temp;
					flag = ++i;
				}
				else{
					if(flag < (len-1)){
						flag++;
					}
					else{
						i++;
					}
				}
			}
		}
		for(int z=0; z<len; z++){
			System.out.print(a[z]+" ");
		}
		System.out.println("\n");
	}

	//10. Sum and product of all elements in an array.
	void SumPro(int a[], int len){
		int sum = 0, pro = 1;
		for(int i=0; i<len; i++){
			sum = sum + a[i];
		}
		for(int j=0; j<len; j++){
			pro = pro * a[j];
		}
		System.out.println("Sum of the array is : "+ sum + "\nProduct of the array is : "+pro+"\n");
	}
}
